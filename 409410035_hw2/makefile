ANTLR = java -jar ./antlr-3.4-complete.jar
JC = javac
JVM = java
MAIN_CLASS = testParser
ANTLR_FILE = myparser.g
ANTLR_JAR = antlr-3.4-complete.jar
SRC_FILES = *.java

all: compile run

compile:
	$(ANTLR) $(ANTLR_FILE)
	$(JC) -cp $(ANTLR_JAR):. $(SRC_FILES)

run:
	$(JVM) -cp $(ANTLR_JAR):. $(MAIN_CLASS) $(FILE)

clean:
	rm -f *.class *.tokens
