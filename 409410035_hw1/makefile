ANTLR_JAR=../antlr-3.5.3-complete-no-st3.jar
SRCS=mylexer.g mylexer.java

all: mylexer.class testLexer.class

mylexer.java: mylexer.g
	java -jar $(ANTLR_JAR) $<

mylexer.class: mylexer.java
	javac -cp $(ANTLR_JAR):. $<

testLexer.class: testLexer.java mylexer.class
	javac -cp $(ANTLR_JAR):. $<

clean:
	rm -f mylexer.java mylexer.tokens mylexer.class testLexer.class

mylexer: mylexer.g
	java -jar $(ANTLR_JAR) $<

.PHONY: mylexer
