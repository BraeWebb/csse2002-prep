TEX=pdflatex
FLAGS=-shell-escape -interaction=nonstopmode -file-line-error -output-directory=out/

all: ass2preview ass1review

ass2preview: ass2preview.tex
	$(TEX) $(FLAGS) ass2preview.tex

ass1review: ass1review.tex
	$(TEX) $(FLAGS) ass1review.tex 
