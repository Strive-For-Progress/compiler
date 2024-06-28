編譯方式:
	這裡預設 antlr-3.5.3-complete-no-st3.jar 是在前一個檔案裡，
	請注意版本和路徑問題。若版本不同，則須將 
	antlr-3.5.3-complete-no-st3.jar 改為您使用的版本。
	1. 
		java -jar ../antlr-3.5.3-complete-no-st3.jar mylexer.g 
		javac -cp ../antlr-3.5.3-complete-no-st3.jar:. *.java
	2. 
		make

執行方式:
	請注意版本和路徑問題。若版本不同，則須將 
	antlr-3.5.3-complete-no-st3.jar 改為您使用的版本。
	java -cp ../antlr-3.5.3-complete-no-st3.jar:. testLexer sample1.c
	java -cp ../antlr-3.5.3-complete-no-st3.jar:. testLexer sample2.c
	java -cp ../antlr-3.5.3-complete-no-st3.jar:. testLexer sample3.c