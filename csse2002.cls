\NeedsTeXFormat{LaTeX2e}
%\ProvidesClass{csse2002}[CSSE2002 Slides]
 
\LoadClass[12]{beamer}

% Programming language formatting
\input{languages}

% Slide formatting
\usepackage{multicol}
\usepackage{enumitem}

\usetheme[progressbar=frametitle]{metropolis}
\setbeamertemplate{frame numbering}[fraction]
\usefonttheme{metropolis}
\usecolortheme{spruce}
\setbeamercolor{background canvas}{bg=white}

\definecolor{mygreen}{rgb}{125, 5, 25}
\usecolortheme[named=mygreen]{structure}
\setbeamercovered{transparent=5}

\setlist[itemize]{label=\bullet}
\setlist[enumerate]{label=\arabic*.}

\newenvironment{topic}[1]
    {\begin{frame}[t,fragile,environment=topic]{#1}}
    {\end{frame}}

\newenvironment{subtopic}[1]
    {\begin{onlyenv}<#1>}
    {\end{onlyenv}}

% Title page information
\title{CSSE2002 \MakeUppercase{\jobname}}
\author{Brae}
\institute {Semester 2, 2018}

