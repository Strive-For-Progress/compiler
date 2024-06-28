ANTLR_PATH = ./antlr-3.4-complete.jar
ANTLR_LIB = $(ANTLR_PATH):.

input ?= input.c

compile:
	@java -jar $(ANTLR_PATH) myCompiler.g
	@javac -cp $(ANTLR_LIB) myCompilerLexer.java myCompilerParser.java myCompiler_test.java

run: compile
	@java -cp $(ANTLR_LIB) myCompiler_test $(input) > $(input:.c=.ll)
	@lli $(input:.c=.ll)

clean:
	rm -f *.class *.ll *.s *.exe
