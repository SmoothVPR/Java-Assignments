PROJECT = assn_2

JC      = javac
JFLAGS  =

SRC     = .
OBJ     = .
SOURCES = $(wildcard *.java)
OBJECTS = $(patsubst %.java, %.class, $(SOURCES))

all: $(OBJECTS)

$(OBJECTS): $(SOURCES)
	$(JC) $(JFLAGS) $(SOURCES)

clean:
	rm -f $(OBJECTS)
