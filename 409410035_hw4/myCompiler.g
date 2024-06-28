grammar myCompiler;

options {
   language = Java;
}

@header {
    // import packages here.
    import java.util.HashMap;
    import java.util.ArrayList;
}

@members {
    boolean TRACEON = false;

    // Type information.
    public enum Type{
       ERR, BOOL, INT, FLOAT, CHAR, CONST_INT;
    }

    // This structure is used to record the information of a variable or a constant.
    class tVar {
	   int   varIndex; // temporary variable's index. Ex: t1, t2, ..., etc.
	   int   iValue;   // value of constant integer. Ex: 123.
	   float fValue;   // value of constant floating point. Ex: 2.314.
	};

    class Info {
       Type theType;  // type information.
       tVar theVar;
	   
	   Info() {
          theType = Type.ERR;
		  theVar = new tVar();
	   }
    };

	
    // ============================================
    // Create a symbol table.
	 // ArrayList is easy to extend to add more info. into symbol table.
	 //
	 // The structure of symbol table:
	 // <variable ID, [Type, [varIndex or iValue, or fValue]]>
	 //    - type: the variable type   (please check "enum Type")
	 //    - varIndex: the variable's index, ex: t1, t2, ...
	 //    - iValue: value of integer constant.
	 //    - fValue: value of floating-point constant.
    // ============================================

    HashMap<String, Info> symtab = new HashMap<String, Info>();




   // 在語法開始部分定義一個堆疊用於管理標籤
   Stack<String> labelStack = new Stack<String>();
   
    // labelCount is used to represent temporary label.
    // The first index is 0.
    int labelCount = 0;
    int print_label = 1;
    // varCount is used to represent temporary variables.
    // The first index is 0.
    int varCount = 0;

    // Record all assembly instructions.
    List<String> TextCode = new ArrayList<String>();


    /*
     * Output prologue.
     */
    void prologue()
    {
       TextCode.add("; === prologue ====");
       TextCode.add("declare dso_local i32 @printf(i8*, ...)\n");
	   TextCode.add("define dso_local i32 @main()");
	   TextCode.add("{");
    }
    
	
    /*
     * Output epilogue.
     */
    void epilogue()
    {
       /* handle epilogue */
       TextCode.add("\n; === epilogue ===");
	   TextCode.add("ret i32 0");
       TextCode.add("}");
    }
    
    
    /* Generate a new label */
    String newLabel()
    {
       labelCount ++;
       return (new String("L")) + Integer.toString(labelCount);
    } 
    
    
    public List<String> getTextCode()
    {
       return TextCode;
    }
}

program: VOID MAIN '(' ')'
        {
           /* Output function prologue */
           prologue();
        }

        '{' 
           declarations
           statements
        '}'
        {
	   if (TRACEON)
	      System.out.println("VOID MAIN () {declarations statements}");

           /* output function epilogue */	  
           epilogue();
        }
        ;


declarations: type Identifier
        {
           if (TRACEON)
              System.out.println("declarations: type Identifier : declarations");

           if (symtab.containsKey($Identifier.text)) {
              // variable re-declared.
              System.out.println("Type Error: " + 
                                  $Identifier.getLine() + 
                                 ": Redeclared identifier.");
              System.exit(0);
           }
                 
         /* Add ID and its info into the symbol table. */
	      Info the_entry = new Info();
		   the_entry.theType = $type.attr_type;
		   the_entry.theVar.varIndex = varCount;
		   varCount ++;
		   symtab.put($Identifier.text, the_entry);

         // issue the instruction.
		   // Ex: \%a = alloca i32, align 4
           if ($type.attr_type == Type.INT) { 

              TextCode.add("\%t" + the_entry.theVar.varIndex + " = alloca i32, align 4");
           }
        } ';' declarations
        | 
        {
           if (TRACEON)
              System.out.println("declarations: ");
        }
        ;


type
returns [Type attr_type]
    : INT { if (TRACEON) System.out.println("type: INT"); $attr_type=Type.INT; }
    | CHAR { if (TRACEON) System.out.println("type: CHAR"); $attr_type=Type.CHAR; }
    | FLOAT {if (TRACEON) System.out.println("type: FLOAT"); $attr_type=Type.FLOAT; }
	;


statements:statement statements
          |
          ;


statement: assign_stmt ';'
         | if_stmt
         | printf_stmt 
         | func_no_return_stmt ';'
         | for_stmt
         ;

printf_stmt
    : 'printf' '(' STRING_LITERAL
	{
        	String format = $STRING_LITERAL.text;
       	format = format.substring(1, format.length() - 1); // Remove the quotes around the string

         int n = format.length()+1;

         String replacedFormat = format.replace("\\n", "\\0A");
         int count = (format.length() - replacedFormat.length()) ; // Count the number of replaced occurrences
         n += count;
         TextCode.add(print_label+1,"@.str" + print_label + " = private unnamed_addr constant [" + (n) + " x i8] c\"" + replacedFormat + "\\00\""); 
         String  line = "call i32 (i8*, ...) @printf(i8* getelementptr inbounds (["
                        + (n) + " x i8], ["
                        + (n) + " x i8]* @.str"
                        + print_label + ", i64 0, i64 0)";
   }
	(',' a = arith_expression 
      {
         if ($a.theInfo.theType == Type.INT) 
		      line += ", i32 \%t" +  $a.theInfo.theVar.varIndex ;
         else if($a.theInfo.theType == Type.CONST_INT)
            line += ", i32 " +$a.theInfo.theVar.iValue ;
	   }
   )* ')'
   { 
      TextCode.add(line+")");
      print_label++;
   } ';'
    ;



for_stmt: FOR '(' assign_stmt ';'
                  cond_expression ';'
                  assign_stmt
              ')'
                  block_stmt
        ;
		 
		 


if_stmt
  : if_then_stmt if_else_stmt
  ;

if_then_stmt
  : IF '(' cond_expression
    {
      String Ltrue = newLabel();
      String Lfalse = newLabel();
      String Lend = newLabel();
      TextCode.add("br i1 \%cmp"+$cond_expression.theInfo.theVar.varIndex+", label \%"+Ltrue+", label \%"+Lfalse);
      TextCode.add(Ltrue+':');
      
      // 將標籤名稱推入堆疊
      labelStack.push(Lfalse);
      labelStack.push(Lend);
    }
    ')' block_stmt
  ;

if_else_stmt
  : ELSE
    {
      // 取得最新的標籤名稱
      String Lend = labelStack.pop();
      String Lfalse = labelStack.pop();
      TextCode.add("br label \%"+Lend);
      TextCode.add(Lfalse+":");
    }
    block_stmt
    {
      TextCode.add("br label \%"+Lend);
      TextCode.add(Lend+":");
    }
  |
  ;

				  
block_stmt: '{' statements '}'
	  ;

assign_stmt: Identifier '=' arith_expression
             {
                Info theRHS = $arith_expression.theInfo;
				    Info theLHS = symtab.get($Identifier.text); 
		   
                if ((theLHS.theType == Type.INT) && (theRHS.theType == Type.INT)) {		   
                   // issue store insruction.  Ex: store i32 \%tx, i32* \%ty
                   TextCode.add("store i32 \%t" + theRHS.theVar.varIndex + ", i32* \%t" + theLHS.theVar.varIndex+", align 4");
				    } else if ((theLHS.theType == Type.INT) && (theRHS.theType == Type.CONST_INT)) {
                   // issue store insruction.  Ex: store i32 value, i32* \%ty
                   TextCode.add("store i32 " + theRHS.theVar.iValue + ", i32* \%t" + theLHS.theVar.varIndex+", align 4");				
				    }
			   };

		   
func_no_return_stmt: Identifier '(' argument ')'
                   ;


argument: arg (',' arg)*
        ;

arg: arith_expression
   | STRING_LITERAL
   ;
		   
cond_expression
returns [Info theInfo]
@init {theInfo = new Info();}
               : a=arith_expression (RelationOP b=arith_expression{
                     theInfo.theVar.varIndex = varCount;
                     varCount ++;
                     if ($RelationOP.text.equals(">")) {
                        if ($b.theInfo.theType == Type.CONST_INT && $a.theInfo.theType != Type.CONST_INT)
                           TextCode.add("\%cmp" + theInfo.theVar.varIndex + " = icmp sgt i32 \%t" + $a.theInfo.theVar.varIndex + ", " + $b.theInfo.theVar.iValue);
                        else if ($a.theInfo.theType == Type.CONST_INT && $b.theInfo.theType != Type.CONST_INT)
                           TextCode.add("\%cmp" + theInfo.theVar.varIndex + " = icmp sgt i32 "+ $a.theInfo.theVar.iValue+ ", \%t" + $b.theInfo.theVar.varIndex );
                        else if ($a.theInfo.theType == Type.CONST_INT && $b.theInfo.theType == Type.CONST_INT)
                           TextCode.add("\%cmp" + theInfo.theVar.varIndex + " = icmp sgt i32 " + $a.theInfo.theVar.iValue + ", " + $b.theInfo.theVar.iValue);
                        else
                           TextCode.add("\%cmp" + theInfo.theVar.varIndex + " = icmp sgt i32 \%t" + $a.theInfo.theVar.varIndex + ", \%t" + $b.theInfo.theVar.varIndex);
                     } else if ($RelationOP.text.equals("<")) {
                        if ($b.theInfo.theType == Type.CONST_INT && $a.theInfo.theType != Type.CONST_INT)
                           TextCode.add("\%cmp" + theInfo.theVar.varIndex + " = icmp slt i32 \%t" + $a.theInfo.theVar.varIndex + ", " + $b.theInfo.theVar.iValue);
                        else if ($a.theInfo.theType == Type.CONST_INT && $b.theInfo.theType != Type.CONST_INT)
                           TextCode.add("\%cmp" + theInfo.theVar.varIndex + " = icmp slt i32 "+ $a.theInfo.theVar.iValue+ ", \%t" + $b.theInfo.theVar.varIndex );
                        else if ($a.theInfo.theType == Type.CONST_INT && $b.theInfo.theType == Type.CONST_INT)
                           TextCode.add("\%cmp" + theInfo.theVar.varIndex + " = icmp slt i32 " + $a.theInfo.theVar.iValue + ", " + $b.theInfo.theVar.iValue);
                        else
                           TextCode.add("\%cmp" + theInfo.theVar.varIndex + " = icmp slt i32 \%t" + $a.theInfo.theVar.varIndex + ", \%t" + $b.theInfo.theVar.varIndex);
                     } else if ($RelationOP.text.equals(">=")) {
                        if ($b.theInfo.theType == Type.CONST_INT && $a.theInfo.theType != Type.CONST_INT)
                           TextCode.add("\%cmp" + theInfo.theVar.varIndex + " = icmp sge i32 \%t" + $a.theInfo.theVar.varIndex + ", " + $b.theInfo.theVar.iValue);
                        else if ($a.theInfo.theType == Type.CONST_INT && $b.theInfo.theType != Type.CONST_INT)
                           TextCode.add("\%cmp" + theInfo.theVar.varIndex + " = icmp sge i32 "+ $a.theInfo.theVar.iValue+ ", \%t" + $b.theInfo.theVar.varIndex );
                        else if ($a.theInfo.theType == Type.CONST_INT && $b.theInfo.theType == Type.CONST_INT)
                           TextCode.add("\%cmp" + theInfo.theVar.varIndex + " = icmp sge i32 " + $a.theInfo.theVar.iValue + ", " + $b.theInfo.theVar.iValue);
                        else
                           TextCode.add("\%cmp" + theInfo.theVar.varIndex + " = icmp sge i32 \%t" + $a.theInfo.theVar.varIndex + ", \%t" + $b.theInfo.theVar.varIndex);
                     } else if ($RelationOP.text.equals("<=")) {
                        if ($b.theInfo.theType == Type.CONST_INT && $a.theInfo.theType != Type.CONST_INT)
                           TextCode.add("\%cmp" + theInfo.theVar.varIndex + " = icmp sle i32 \%t" + $a.theInfo.theVar.varIndex + ", " + $b.theInfo.theVar.iValue);
                        else if ($a.theInfo.theType == Type.CONST_INT && $b.theInfo.theType != Type.CONST_INT)
                           TextCode.add("\%cmp" + theInfo.theVar.varIndex + " = icmp sle i32 "+ $a.theInfo.theVar.iValue+ ", \%t" + $b.theInfo.theVar.varIndex );
                        else if ($a.theInfo.theType == Type.CONST_INT && $b.theInfo.theType == Type.CONST_INT)
                           TextCode.add("\%cmp" + theInfo.theVar.varIndex + " = icmp sle i32 " + $a.theInfo.theVar.iValue + ", " + $b.theInfo.theVar.iValue);
                        else
                           TextCode.add("\%cmp" + theInfo.theVar.varIndex + " = icmp sle i32 \%t" + $a.theInfo.theVar.varIndex + ", \%t" + $b.theInfo.theVar.varIndex);
                     } else if ($RelationOP.text.equals("!=")) {
                        if ($b.theInfo.theType == Type.CONST_INT && $a.theInfo.theType != Type.CONST_INT)
                           TextCode.add("\%cmp" + theInfo.theVar.varIndex + " = icmp ne i32 \%t" + $a.theInfo.theVar.varIndex + ", " + $b.theInfo.theVar.iValue);
                        else if ($a.theInfo.theType == Type.CONST_INT && $b.theInfo.theType != Type.CONST_INT)
                           TextCode.add("\%cmp" + theInfo.theVar.varIndex + " = icmp ne i32 "+ $a.theInfo.theVar.iValue+ ", \%t" + $b.theInfo.theVar.varIndex );
                        else if ($a.theInfo.theType == Type.CONST_INT && $b.theInfo.theType == Type.CONST_INT)
                           TextCode.add("\%cmp" + theInfo.theVar.varIndex + " = icmp ne i32 " + $a.theInfo.theVar.iValue + ", " + $b.theInfo.theVar.iValue);
                        else
                           TextCode.add("\%cmp" + theInfo.theVar.varIndex + " = icmp ne i32 \%t" + $a.theInfo.theVar.varIndex + ", \%t" + $b.theInfo.theVar.varIndex);
                     } else if ($RelationOP.text.equals("==")) {
                        if ($b.theInfo.theType == Type.CONST_INT && $a.theInfo.theType != Type.CONST_INT)
                           TextCode.add("\%cmp" + theInfo.theVar.varIndex + " = icmp eq i32 \%t" + $a.theInfo.theVar.varIndex + ", " + $b.theInfo.theVar.iValue);
                        else if ($a.theInfo.theType == Type.CONST_INT && $b.theInfo.theType != Type.CONST_INT)
                           TextCode.add("\%cmp" + theInfo.theVar.varIndex + " = icmp eq i32 "+ $a.theInfo.theVar.iValue+ ", \%t" + $b.theInfo.theVar.varIndex );
                        else if ($a.theInfo.theType == Type.CONST_INT && $b.theInfo.theType == Type.CONST_INT)
                           TextCode.add("\%cmp" + theInfo.theVar.varIndex + " = icmp eq i32 " + $a.theInfo.theVar.iValue + ", " + $b.theInfo.theVar.iValue);
                        else
                           TextCode.add("\%cmp" + theInfo.theVar.varIndex + " = icmp eq i32 \%t" + $a.theInfo.theVar.varIndex + ", \%t" + $b.theInfo.theVar.varIndex);
                     }
                   }
               )*
               ;
			   
arith_expression
returns [Info theInfo]
@init {theInfo = new Info();}
                : a=multExpr { $theInfo=$a.theInfo; }
                 ( '+' b=multExpr
                    {
					  
                       // code generation.					   
                       if (($a.theInfo.theType == Type.INT) && ($b.theInfo.theType == Type.INT)) {
                           TextCode.add("\%t" + varCount + " = add nsw i32 \%t" + $theInfo.theVar.varIndex + ", \%t" + $b.theInfo.theVar.varIndex);
					   
                           // Update arith_expression's theInfo.
                           $theInfo.theType = Type.INT;
                           $theInfo.theVar.varIndex = varCount;
					            varCount ++;
                       } else if (($a.theInfo.theType == Type.INT) && ($b.theInfo.theType == Type.CONST_INT)) {
                           TextCode.add("\%t" + varCount + " = add nsw i32 \%t" + $theInfo.theVar.varIndex + ", " + $b.theInfo.theVar.iValue);
					   
                           // Update arith_expression's theInfo.
                           $theInfo.theType = Type.INT;
                           $theInfo.theVar.varIndex = varCount;
                           varCount ++;
                       } else if (($a.theInfo.theType == Type.CONST_INT) && ($b.theInfo.theType == Type.INT)) {
                           TextCode.add("\%t" + varCount + " = add nsw i32 \%t" + $b.theInfo.theVar.varIndex + ", " + $theInfo.theVar.iValue);
					   
                           // Update arith_expression's theInfo.
                           $theInfo.theType = Type.INT;
                           $theInfo.theVar.varIndex = varCount;
                           varCount ++;
                       } else if (($a.theInfo.theType == Type.CONST_INT) && ($b.theInfo.theType == Type.CONST_INT)) {
                           $theInfo.theVar.iValue = $a.theInfo.theVar.iValue + $b.theInfo.theVar.iValue;
                           $theInfo.theType = Type.CONST_INT;
                       }
                    }
                 | '-' b=multExpr
                     {
                        if (($a.theInfo.theType == Type.INT) && ($b.theInfo.theType == Type.INT)) {
                           TextCode.add("\%t" + varCount + " = sub nsw i32 \%t" + $a.theInfo.theVar.varIndex + ", \%t" + $b.theInfo.theVar.varIndex);

                           $theInfo.theType = Type.INT;
                           $theInfo.theVar.varIndex = varCount;
                           varCount++;
                        } else if (($a.theInfo.theType == Type.INT) && ($b.theInfo.theType == Type.CONST_INT)) {
                           TextCode.add("\%t" + varCount + " = sub nsw i32 \%t" + $a.theInfo.theVar.varIndex + ", " + $b.theInfo.theVar.iValue);

                           // Update arith_expression's theInfo.
                           $theInfo.theType = Type.INT;
                           $theInfo.theVar.varIndex = varCount;
                           varCount++;
                        } else if (($a.theInfo.theType == Type.CONST_INT) && ($b.theInfo.theType == Type.INT)) {
                           TextCode.add("\%t" + varCount + " = sub nsw i32 \%t" + $a.theInfo.theVar.varIndex + ", " + $b.theInfo.theVar.varIndex);

                           // Update arith_expression's theInfo.
                           $theInfo.theType = Type.INT;
                           $theInfo.theVar.varIndex = varCount;
                           varCount++;
                        } else if (($a.theInfo.theType == Type.CONST_INT) && ($b.theInfo.theType == Type.CONST_INT)) {
                           $theInfo.theVar.iValue = $a.theInfo.theVar.iValue - $b.theInfo.theVar.iValue;
                           $theInfo.theType = Type.CONST_INT;
                        }
                     }
                 )*
                 ;

multExpr returns [Info theInfo]
@init {theInfo = new Info();}
  : a=signExpr { $theInfo=$a.theInfo; }
    ( '*' b=signExpr
      {
         if (($a.theInfo.theType == Type.INT) && ($b.theInfo.theType == Type.INT)) {
            TextCode.add("\%t" + varCount + " = mul nsw i32 \%t" + $a.theInfo.theVar.varIndex + ", \%t" + $b.theInfo.theVar.varIndex);

            $theInfo.theType = Type.INT;
            $theInfo.theVar.varIndex = varCount;
            varCount++;
         } else if (($a.theInfo.theType == Type.INT) && ($b.theInfo.theType == Type.CONST_INT)) {
            TextCode.add("\%t" + varCount + " = mul nsw i32 \%t" + $a.theInfo.theVar.varIndex + ", " + $b.theInfo.theVar.iValue);

            // Update multExpr's theInfo.
            $theInfo.theType = Type.INT;
            $theInfo.theVar.varIndex = varCount;
            varCount++;
         } else if (($a.theInfo.theType == Type.CONST_INT) && ($b.theInfo.theType == Type.INT)) {
            TextCode.add("\%t" + varCount + " = mul nsw i32 \%t" + $a.theInfo.theVar.varIndex + ", \%t" + $b.theInfo.theVar.varIndex);

            // Update multExpr's theInfo.
            $theInfo.theType = Type.INT;
            $theInfo.theVar.varIndex = varCount;
            varCount++;
         } else if (($a.theInfo.theType == Type.CONST_INT) && ($b.theInfo.theType == Type.CONST_INT)) {
            $theInfo.theVar.iValue = $a.theInfo.theVar.iValue * $b.theInfo.theVar.iValue;
            $theInfo.theType = Type.CONST_INT;
         }
      }
    | '/' c=signExpr
      {
         if (($a.theInfo.theType == Type.INT) && ($c.theInfo.theType == Type.INT)) {
            TextCode.add("\%t" + varCount + " = sdiv i32 \%t" + $a.theInfo.theVar.varIndex + ", \%t" + $c.theInfo.theVar.varIndex);

            $theInfo.theType = Type.INT;
            $theInfo.theVar.varIndex = varCount;
            varCount++;
         } else if (($a.theInfo.theType == Type.INT) && ($c.theInfo.theType == Type.CONST_INT)) {
            TextCode.add("\%t" + varCount + " = sdiv i32 \%t" + $a.theInfo.theVar.varIndex + ", " + $c.theInfo.theVar.iValue);

            // Update multExpr's theInfo.
            $theInfo.theType = Type.INT;
            $theInfo.theVar.varIndex = varCount;
            varCount++;
         } else if (($a.theInfo.theType == Type.CONST_INT) && ($c.theInfo.theType == Type.INT)) {
            TextCode.add("\%t" + varCount + " = sdiv i32 \%t" + $a.theInfo.theVar.varIndex + ", \%t" + $c.theInfo.theVar.varIndex);

            // Update multExpr's theInfo.
            $theInfo.theType = Type.INT;
            $theInfo.theVar.varIndex = varCount;
            varCount++;
         } else if (($a.theInfo.theType == Type.CONST_INT) && ($c.theInfo.theType == Type.CONST_INT)) {
            $theInfo.theVar.iValue = $a.theInfo.theVar.iValue / $c.theInfo.theVar.iValue;
            $theInfo.theType = Type.CONST_INT;
         }
      }
    )*
    ;


signExpr
returns [Info theInfo]
@init {theInfo = new Info();}
        : a=primaryExpr { $theInfo=$a.theInfo; } 
        | '-' primaryExpr      
         {
            $theInfo.theType = $primaryExpr.theInfo.theType;
            $theInfo.theVar.iValue = -1 * $primaryExpr.theInfo.theVar.iValue;
         }
	;
		  
primaryExpr
returns [Info theInfo]
@init {theInfo = new Info();}
           : Integer_constant
	      {
            $theInfo.theType = Type.CONST_INT;
			   $theInfo.theVar.iValue = Integer.parseInt($Integer_constant.text);
         }
           | Floating_point_constant
           | Identifier
              {
                // get type information from symtab.
                Type the_type = symtab.get($Identifier.text).theType;
				    $theInfo.theType = the_type;

                // get variable index from symtab.
                int vIndex = symtab.get($Identifier.text).theVar.varIndex;
				
                switch (the_type) {
                case INT: 
                         // get a new temporary variable and
						 // load the variable into the temporary variable.
                         
						 // Ex: \%tx = load i32, i32* \%ty.
						 TextCode.add("\%t" + varCount + " = load i32, i32* \%t" + vIndex+", align 4");
				         
						 // Now, Identifier's value is at the temporary variable \%t[varCount].
						 // Therefore, update it.
						 $theInfo.theVar.varIndex = varCount;
						 varCount ++;
                         break;
                case FLOAT:
                         break;
                case CHAR:
                         break;
			
                }
              }
	   | '&' Identifier
	   | '(' a=arith_expression ')'{
         $theInfo.theVar.iValue = $a.theInfo.theVar.iValue;
         $theInfo.theType = $a.theInfo.theType;
      }
           ;

		   
/* description of the tokens */
FLOAT:'float';
INT:'int';
CHAR: 'char';

MAIN: 'main';
VOID: 'void';
IF: 'if';
ELSE: 'else';
FOR: 'for';

RelationOP: '>' |'>=' | '<' | '<=' | '==' | '!=';

Identifier:('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
Integer_constant:'0'..'9'+;
Floating_point_constant:'0'..'9'+ '.' '0'..'9'+;

STRING_LITERAL
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;

WS:( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};
COMMENT:'/*' .* '*/' {$channel=HIDDEN;};


fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    ;
