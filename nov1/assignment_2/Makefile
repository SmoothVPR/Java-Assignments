PROJECT  = assignment_2

JC       = javac
JAR      = jar
JFLAGS   =
JARFLAGS = cvfm

MANIFEST = manifest.txt

BIN      = bin
SRC      = src/com/ss
OBJ      = build
SOURCES  = $(wildcard $(SRC)/*.java)
OBJECTS  = $(patsubst $(SRC)/%.java, $(OBJ)/ss/%.class, $(SOURCES))

all: $(PROJECT)

$(PROJECT): $(OBJECTS) $(MANIFEST)
	$(JAR) $(JARFLAGS) $(PROJECT).jar $(MANIFEST) $(OBJECTS) 

$(OBJECTS): $(OBJ) $(BIN)
	$(JC) $(JFLAGS) $(SOURCES) -d $(OBJ)

$(MANIFEST):
	@echo "Manifest-Version: 1.0" > manifest.txt
	@echo "Class-Path: build/ss" >> manifest.txt
	@echo "Main-Class: ss.Main"  >> manifest.txt

$(BIN):
	mkdir -p $@

$(OBJ):
	mkdir -p $@

clean:
	rm -f $(OBJECTS)
	rm -f $(MANIFEST)
	rm -f $(PROJECT).jar
