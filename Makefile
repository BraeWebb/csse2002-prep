OUTPUT_TUTE := tutorials/
OUTPUT_PRAC := practicals/
TUTES := $(wildcard ./week*tute.tex)
PRACS := $(wildcard ./week*prac.tex)

TEX=pdflatex
FLAGS=-shell-escape -interaction=batchmode -file-line-error

all: $(TUTES) $(PRACS)
	make tutes
	make pracs

tutes: $(TUTES)
	@for week in $(TUTES); do \
		make tute WEEK=$${week}; \
	done

pracs: $(PRACS)
	@for week in $(PRACS); do \
		make prac WEEK=$${week}; \
	done

tute: csse2002.cls $(WEEK)
	mkdir -p $(OUTPUT_TUTE)
	$(TEX) $(FLAGS) -output-directory=$(OUTPUT_TUTE) $(WEEK)

prac: csse2002.cls $(WEEK)
	mkdir -p $(OUTPUT_PRAC)
	$(TEX) $(FLAGS) -output-directory=$(OUTPUT_PRAC) $(WEEK)

