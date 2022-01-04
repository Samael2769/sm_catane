##
## EPITECH PROJECT, 2021
## Untitled (Workspace)
## File description:
## Makefile
##

JFLAGS	=	-g

JC	=	javac

.SUFFIXES:	.java .class

.java.class:
		$(JC) $(JFLAGS) $*.java

NAME	=	Catane

CLASSES	= 	core/GameObject.java\
			core/Plate.java\
			core/Player.java\
			core/Core.java\
			term/MapHandler.java\
			$(NAME).java\

all: $(NAME)

$(NAME): $(CLASSES:.java=.class)

clean:
	$(RM) *.class
	$(RM) core/*.class
	$(RM) term/*.class