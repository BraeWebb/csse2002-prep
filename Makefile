TEX=pdflatex
FLAGS=-shell-escape -interaction=nonstopmode -file-line-error -output-directory=out/

all: ass2preview ass1review week10tute week11prac week11tute

ass2preview: ass2preview.tex
	$(TEX) $(FLAGS) ass2preview.tex

ass1review: ass1review.tex
	$(TEX) $(FLAGS) ass1review.tex 

week10tute: week10tute.tex
	$(TEX) $(FLAGS) week10tute.tex

week11prac: week11prac.tex
	$(TEX) $(FLAGS) week11prac.tex

week11tute: week11tute.tex
	$(TEX) $(FLAGS) week11tute.tex
