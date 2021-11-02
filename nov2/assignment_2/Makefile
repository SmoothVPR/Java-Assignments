PROJECT = assignment_1

JC      = javac

SRC     = .
OBJ     = .
SOURCES = $(wildcard *.java)
OBJECTS = $(wildcard *.class)

all: $(OBJECTS)

$(OBJECTS): $(SOURCES)
	$(JC) $(SOURCES)

clean:
	rm -f $(OBJECTS)
