grammar myChecker;

@header {
    // import packages here.
    import java.util.HashMap;
}

@members {
    boolean TRACEON = false;
   
	
    public enum TypeInfo {
        Integer,
		Float,
		Char,
		Bool,
		Error
    } 
	
	HashMap<String,TypeInfo> symtab = new HashMap<String,TypeInfo>();

}

program
	: VOID MAIN '(' ')' '{' statements '}'
     { if (TRACEON) System.out.println("VOID MAIN () {statements}"); }
	;


type returns [TypeInfo attr_type]
	: INT     { if (TRACEON) System.out.println("type: INT");     $attr_type = TypeInfo.Integer; }
	| FLOAT   { if (TRACEON) System.out.println("type: FLOAT");   $attr_type = TypeInfo.Float; }
	| BOOLEAN { if (TRACEON) System.out.println("type: BOOLEAN"); $attr_type = TypeInfo.Char; }
	| CHAR    { if (TRACEON) System.out.println("type: CHAR");    $attr_type = TypeInfo.Bool; }
	;

statements
	: statement statements
	|;


	logical_expr returns [TypeInfo attr_type] 
	   : a = relation_expr {$attr_type = $a.attr_type; }
	   ( '&&' b  =  relation_expr 
			{ 
				if ($a.attr_type != $b.attr_type) {
					System.out.println("Error! " + 
										$a.start.getLine() +
										": Type mismatch for the operator && in an expression.");
					$attr_type = TypeInfo.Error;
				} else {
					$attr_type = TypeInfo.Bool;
				}
			}
		| '||' c = relation_expr 
			{ 
				if ($a.attr_type != $c.attr_type) {
					System.out.println("Error! " + 
										$a.start.getLine() +
										": Type mismatch for the operator || in an expression.");
					$attr_type = TypeInfo.Error;
				} else {
					$attr_type = TypeInfo.Bool;
				}
        	}
	   )*
	| '!'  d = relation_expr  
		{
			if ($d.attr_type != TypeInfo.Bool) {
					System.out.println("Error! " + 
										$d.start.getLine() +
										": Type mismatch for the operator ! in an expression.");
					$attr_type = TypeInfo.Error;
				} else {
					$attr_type = TypeInfo.Bool;
				}
		}
	
	;


relation_expr returns [TypeInfo attr_type]
	:  
	 a = bitwise_expr { $attr_type = $a.attr_type;}
	  ( '==' b = bitwise_expr
	    { if ($a.attr_type != $b.attr_type) {
			  System.out.println("Error! " + 
				                 $a.start.getLine() +
						         ": Type mismatch for the operator == in an expression.");
		      $attr_type = TypeInfo.Error;
		  } else {
			  $attr_type = TypeInfo.Bool;
		  }
        }
	  | '!=' c = bitwise_expr
	    { if ($a.attr_type != $c.attr_type) {
			  System.out.println("Error! " + 
				                 $a.start.getLine() +
						         ": Type mismatch for the operator != in an expression.");
		      $attr_type = TypeInfo.Error;;
		  } else {
			  $attr_type = TypeInfo.Bool;
		  }
        }
		| '<=' d = bitwise_expr
	    { if ($a.attr_type != $d.attr_type) {
			  System.out.println("Error! " + 
				                 $a.start.getLine() +
						         ": Type mismatch for the operator <= in an expression.");
		      $attr_type = TypeInfo.Error;
		  } else {
			  $attr_type = TypeInfo.Bool;
		  }
        }
		| '>=' e = bitwise_expr
	    { if ($a.attr_type != $e.attr_type) {
			  System.out.println("Error! " + 
				                 $a.start.getLine() +
						         ": Type mismatch for the operator >= in an expression.");
		      $attr_type = TypeInfo.Error;
		  } else {
			  $attr_type = TypeInfo.Bool;
		  }
        }
		| '<' f = bitwise_expr
	    { if ($a.attr_type != $f.attr_type) {
			  System.out.println("Error! " + 
				                 $a.start.getLine() +
						         ": Type mismatch for the operator < in an expression.");
		      $attr_type = TypeInfo.Error;
		  } else {
			  $attr_type = TypeInfo.Bool;
		  }
        }
		| '>' g = bitwise_expr
	    { if ($a.attr_type != $g.attr_type) {
			  System.out.println("Error! " + 
				                 $a.start.getLine() +
						         ": Type mismatch for the operator > in an expression.");
		      $attr_type = TypeInfo.Error;
		  } else {
			  $attr_type = TypeInfo.Bool;
		  }
        }
	  )*
	  ;


	bitwise_expr returns [TypeInfo attr_type] 
		: a = arith_expression { $attr_type = $a.attr_type; }
		( '>>' b = arith_expression
			{
			   if ($a.attr_type !=  TypeInfo.Integer || $b.attr_type != TypeInfo.Integer)  {
					System.out.println("Error! " + 
										$a.start.getLine() +
										": Type mismatch for the operator >> in an expression both side need to be integer.");
					$attr_type = TypeInfo.Error;
				}
			}
		| '<<' c = arith_expression
			{
				 if ($a.attr_type !=  TypeInfo.Integer || $c.attr_type != TypeInfo.Integer)  {
					System.out.println("Error! " + 
										$a.start.getLine() +
										": Type mismatch for the operator << in an expression both side need to be integer.");
					$attr_type = TypeInfo.Error;
				}
			}
		| '&' d = arith_expression
			{  
			    if ($a.attr_type !=  TypeInfo.Integer || $d.attr_type != TypeInfo.Integer)  {
					System.out.println("Error! " + 
										$a.start.getLine() +
										": Type mismatch for the operator & in an expression both side need to be integer.");
					$attr_type = TypeInfo.Error;
				}
			}
		| '^' e = arith_expression
			{ 
				if ($a.attr_type !=  TypeInfo.Integer || $e.attr_type != TypeInfo.Integer)  {
					System.out.println("Error! " + 
										$a.start.getLine() +
										": Type mismatch for the operator ^ in an expression both side need to be integer.");
					$attr_type = TypeInfo.Error;
				}
        	}
		| '~' f = arith_expression
			{ 
				if ($a.attr_type !=  TypeInfo.Integer || $f.attr_type != TypeInfo.Integer)  {
					System.out.println("Error! " + 
										$a.start.getLine() +
										": Type mismatch for the operator ~ in an expression both side need to be integer.");
					$attr_type = TypeInfo.Error;
				}
        	}
		| '|' g = arith_expression
			{ 
				if ($a.attr_type !=  TypeInfo.Integer || $g.attr_type != TypeInfo.Integer)  {
					System.out.println("Error! " + 
										$a.start.getLine() +
										": Type mismatch for the operator | in an expression both side need to be integer.");
					$attr_type = TypeInfo.Error;
				}
        	}
	  )*
	;
	



arith_expression returns [TypeInfo attr_type]
	: a = multExpr { $attr_type = $a.attr_type; }
      ( '+' b = multExpr
	    { if ($a.attr_type != $b.attr_type) {
			  System.out.println("Error! " + 
				                 $a.start.getLine() +
						         ": Type mismatch for the operator + in an expression.");
		      $attr_type = TypeInfo.Error;
		  }
        }
	  | '-' c = multExpr
	    { if ($a.attr_type != $c.attr_type) {
			  System.out.println("Error! " + 
				                 $a.start.getLine() +
						         ": Type mismatch for the operator + in an expression.");
		      $attr_type = TypeInfo.Error;
		  }
        }
	  )*
	;

multExpr returns [TypeInfo attr_type]
	: a = signExpr { $attr_type = $a.attr_type; }
      ( '*' b = signExpr
	  	{ if ($a.attr_type != $b.attr_type) {
			  System.out.println("Error! " + 
				                 $a.start.getLine() +
						         ": Type mismatch for the operator * in an expression.");
		      $attr_type = TypeInfo.Error;
		  }
        }
      | '/' c = signExpr
	  	{ if ($a.attr_type != $c.attr_type) {
			  System.out.println("Error! " + 
				                 $a.start.getLine() +
						         ": Type mismatch for the operator / in an expression.");
		      $attr_type = TypeInfo.Error;
		  }
        }
	  | '%' d = signExpr
	  	{ if ($a.attr_type != $d.attr_type) {
			  System.out.println("Error! " + 
				                 $a.start.getLine() +
						         ": Type mismatch for the operator \% in an expression.");
		      $attr_type = TypeInfo.Error;
		  }
        }
	  )*
	;

signExpr returns [TypeInfo attr_type]
	: primaryExpr { $attr_type = $primaryExpr.attr_type; }
	| '-' primaryExpr { $attr_type = $primaryExpr.attr_type; }
	;
primaryExpr returns [TypeInfo attr_type] 
	: Integer_constant        { $attr_type = TypeInfo.Integer; }
	| Floating_point_constant { $attr_type = TypeInfo.Float; }
	| Identifier			  { $attr_type = symtab.get($Identifier.text);}
	| '(' logical_expr ')' { $attr_type = $logical_expr.attr_type; }
    ;
assginExpr returns [TypeInfo attr_type]
	: 
	Identifier { $attr_type = symtab.get($Identifier.text); }
	'++'{ if ($attr_type != TypeInfo.Integer) {
			  System.out.println("Error! " + 
				                $Identifier.getLine() +
						         ": Type mismatch for the operator ++ in an expression. Must be Integer");
		      $attr_type = TypeInfo.Error;
		  }
        }
	|Identifier { $attr_type = symtab.get($Identifier.text); } '--'{ if ($attr_type != TypeInfo.Integer) {
			  System.out.println("Error! " + 
				                 $Identifier.getLine() +
						         ": Type mismatch for the operator -- in an expression. Must be Integer");
		      $attr_type = TypeInfo.Error;
		  }
        }
    | Identifier { $attr_type = symtab.get($Identifier.text); } '=' logical_expr 
	 {
	   if (symtab.containsKey($Identifier.text)) {
	       $attr_type = symtab.get($Identifier.text);
	   } else {
           /* Add codes to report and handle this error */
		    System.out.println("Error! " + 
				                 $logical_expr.start.getLine() +
						         ": Undeclared identifier.");
	       $attr_type = TypeInfo.Error;
		  
	   }
		
	   if ($attr_type != $logical_expr.attr_type) {
           System.out.println("Error! " + 
				              $logical_expr.start.getLine() +
						      ": Type mismatch for the two side operands in an assignment statement.");
		   $attr_type = TypeInfo.Error;
       }
	 }
	|Identifier { $attr_type = symtab.get($Identifier.text); } '+=' logical_expr 
	 {
	   if (symtab.containsKey($Identifier.text)) {
	       $attr_type = symtab.get($Identifier.text);
	   } else {
           /* Add codes to report and handle this error */
		    System.out.println("Error! " + 
				                 $logical_expr.start.getLine() +
						         ":  Undeclared identifier.");
	       $attr_type = TypeInfo.Error;
		  
	   }
		
	   if ($attr_type != $logical_expr.attr_type) {
           System.out.println("Error! " + 
				              $logical_expr.start.getLine() +
						      ": Type mismatch for the two side operands in an assignment statement.");
		   $attr_type = TypeInfo.Error;
       }
	 }
	| Identifier { $attr_type = symtab.get($Identifier.text); } '-=' logical_expr 
	 {
	   if (symtab.containsKey($Identifier.text)) {
	       $attr_type = symtab.get($Identifier.text);
	   } else {
           /* Add codes to report and handle this error */
		    System.out.println("Error! " + 
				                 $logical_expr.start.getLine() +
						         ":  Undeclared identifier.");
	       $attr_type = TypeInfo.Error;
		  
	   }
		
	   if ($attr_type != $logical_expr.attr_type) {
           System.out.println("Error! " + 
				              $logical_expr.start.getLine() +
						      ": Type mismatch for the two side operands in an assignment statement.");
		   $attr_type = TypeInfo.Error;
       }
	 }
	| Identifier { $attr_type = symtab.get($Identifier.text); } '*=' logical_expr 
	 {
	   if (symtab.containsKey($Identifier.text)) {
	       $attr_type = symtab.get($Identifier.text);
	   } else {
           /* Add codes to report and handle this error */
		    System.out.println("Error! " + 
				                 $logical_expr.start.getLine() +
						         ":  Undeclared identifier.");
	       $attr_type = TypeInfo.Error;
		  
	   }
		
	   if ($attr_type != $logical_expr.attr_type) {
           System.out.println("Error! " + 
				              $logical_expr.start.getLine() +
						      ": Type mismatch for the two side operands in an assignment statement.");
		   $attr_type = TypeInfo.Error;
       }
	 }
	| Identifier { $attr_type = symtab.get($Identifier.text); } '/=' logical_expr 
	 {
	   if (symtab.containsKey($Identifier.text)) {
	       $attr_type = symtab.get($Identifier.text);
	   } else {
           /* Add codes to report and handle this error */
		    System.out.println("Error! " + 
				                 $logical_expr.start.getLine() +
						         ":  Undeclared identifier.");
	       $attr_type = TypeInfo.Error;
		  
	   }
		
	   if ($attr_type != $logical_expr.attr_type) {
           System.out.println("Error! " + 
				              $logical_expr.start.getLine() +
						      ": Type mismatch for the two side operands in an assignment statement.");
		   $attr_type = TypeInfo.Error;
       }
	} 
	| Identifier { $attr_type = symtab.get($Identifier.text); } '%=' logical_expr 
	 {
	   if (symtab.containsKey($Identifier.text)) {
	       $attr_type = symtab.get($Identifier.text);
	   } else {
           /* Add codes to report and handle this error */
		    System.out.println("Error! " + 
				                 $logical_expr.start.getLine() +
						         ": Undeclared identifier.");
	       $attr_type = TypeInfo.Error;
		  
	   }
		
	   if ($attr_type != $logical_expr.attr_type) {
           System.out.println("Error! " + 
				              $logical_expr.start.getLine() +
						      ": Type mismatch for the two side operands in an assignment statement.");
		   $attr_type = TypeInfo.Error;
       }
	} 
	| Identifier { $attr_type = symtab.get($Identifier.text); } '<<=' logical_expr 
	 {
	   if (symtab.containsKey($Identifier.text)) {
	       $attr_type = symtab.get($Identifier.text);
	   } else {
           /* Add codes to report and handle this error */
		    System.out.println("Error! " + 
				                 $logical_expr.start.getLine() +
						         ": Undeclared identifier.");
	       $attr_type = TypeInfo.Error;
		  
	   }
		
	   if ($attr_type != $logical_expr.attr_type  || $attr_type != TypeInfo.Integer) {
           System.out.println("Error! " + 
				              $logical_expr.start.getLine() +
						      ": Type mismatch for the two side operands, both of them must be integer type in the assignment statement.");
		   $attr_type = TypeInfo.Error;
       }
	 }
	   | Identifier { $attr_type = symtab.get($Identifier.text); } '>>=' logical_expr 
	 {
	   if (symtab.containsKey($Identifier.text)) {
	       $attr_type = symtab.get($Identifier.text);
	   } else {
           /* Add codes to report and handle this error */
		    System.out.println("Error! " + 
				                 $logical_expr.start.getLine() +
						         ": Undeclared identifier.");
	       $attr_type = TypeInfo.Error;
		  
	   }
		
	   if ($attr_type != $logical_expr.attr_type  || $attr_type != TypeInfo.Integer) {
           System.out.println("Error! " + 
				              $logical_expr.start.getLine() +
						      ": Type mismatch for the two side operands, both of them must be integer type in the assignment statement.");
		   $attr_type = TypeInfo.Error;
       }
	} 
	  | Identifier { $attr_type = symtab.get($Identifier.text); } '|=' logical_expr 
	 {
	   if (symtab.containsKey($Identifier.text)) {
	       $attr_type = symtab.get($Identifier.text);
	   } else {
           /* Add codes to report and handle this error */
		    System.out.println("Error! " + 
				                 $logical_expr.start.getLine() +
						         ": Undeclared identifier.");
	       $attr_type = TypeInfo.Error;
		  
	   }
		
	   if ($attr_type != $logical_expr.attr_type  || $attr_type != TypeInfo.Integer) {
           System.out.println("Error! " + 
				              $logical_expr.start.getLine() +
						      ": Type mismatch for the two side operands, both of them must be integer type in the assignment statement.");
		   $attr_type = TypeInfo.Error;
       }
	} 
	  | Identifier { $attr_type = symtab.get($Identifier.text); } '&=' logical_expr 
	 {
	   if (symtab.containsKey($Identifier.text)) {
	       $attr_type = symtab.get($Identifier.text);
	   } else {
           /* Add codes to report and handle this error */
		    System.out.println("Error! " + 
				                 $logical_expr.start.getLine() +
						         ": Undeclared identifier.");
	       $attr_type = TypeInfo.Error;
		  
	   }
		
	   if ($attr_type != $logical_expr.attr_type  || $attr_type != TypeInfo.Integer) {
           System.out.println("Error! " + 
				              $logical_expr.start.getLine() +
						      ": Type mismatch for the two side operands, both of them must be integer type in the assignment statement.");
		   $attr_type = TypeInfo.Error;
       }
	} 
	  | Identifier { $attr_type = symtab.get($Identifier.text); } '^=' logical_expr 
	 {
	   if (symtab.containsKey($Identifier.text)) {
	       $attr_type = symtab.get($Identifier.text);
	   } else {
           /* Add codes to report and handle this error */
		    System.out.println("Error! " + 
				                 $logical_expr.start.getLine() +
						         ": Undeclared identifier.");
	       $attr_type = TypeInfo.Error;
		  
	   }
		
	   if ($attr_type != $logical_expr.attr_type  || $attr_type != TypeInfo.Integer) {
           System.out.println("Error! " + 
				              $logical_expr.start.getLine() +
						      ": Type mismatch for the two side operands, both of them must be integer type in the assignment statement.");
		   $attr_type = TypeInfo.Error;
       }
	} 
	;  
	

statement returns [TypeInfo attr_type]
	:  assginExpr  ';'
	| IF '(' logical_expr ')' if_then_statements
	| ternary_expr
	| type Identifier ( '=' value = logical_expr {
		if ($type.attr_type != $logical_expr.attr_type) { 
			System.out.println("Error! " + 
				              $logical_expr.start.getLine() +
						      ": Type mismatch for the two side operands in an assignment statement.");
		    $attr_type = TypeInfo.Error;
		}

	})? ';' 
     {
	   if (TRACEON) System.out.println("declarations: type Identifier : declarations");
	 
  	   if (symtab.containsKey($Identifier.text)) {
		   System.out.println("Error! " + 
				              $Identifier.getLine() + 
							  ": Redeclared identifier.");
	   } else {
		   /* Add ID and its attr_type into the symbol table. */
		   symtab.put($Identifier.text, $type.attr_type);
	   }
	 }
	| '++' Identifier { 
		$attr_type = symtab.get($Identifier.text);
		if ($attr_type != TypeInfo.Integer) {
			  System.out.println("Error! " + 
				                $Identifier.getLine() +
						         ": Type mismatch for the operator ++ in an expression. Must be Integer");
		      $attr_type = TypeInfo.Error;
		  }
        }';'
	| '--' Identifier { 
		$attr_type = symtab.get($Identifier.text);
		if ($attr_type != TypeInfo.Integer) {
			  System.out.println("Error! " + 
				                $Identifier.getLine() +
						         ": Type mismatch for the operator -- in an expression. Must be Integer");
		      $attr_type = TypeInfo.Error;
		  }
        }';'
	| while_statement
	| for_statement
	| do_while_statement
	;



ternary_expr returns [TypeInfo attr_type]:
	'(' a = logical_expr 
	{
		if ($a.attr_type != TypeInfo.Bool) {
			System.out.println("Error! " + $a.start.getLine()+ ": Type need to be boolean in condition part");
			attr_type = TypeInfo.Error;
		} else {
			attr_type = TypeInfo.Bool;
		}
	}
	')' '?'  (logical_expr)  ':'  (logical_expr)  ';'
	;

if_then_statements
	: statement
	| '{' statements '}' (ELSE (  IF '(' logical_expr ')')? '{' statements '}')?
	;

while_statement : {  if (TRACEON) System.out.println("Parsing an WHILE statement "); } 'while' '(' logical_expr 
	{
		if ($logical_expr.attr_type != TypeInfo.Bool) {
				System.out.println("Error! " + $logical_expr.start.getLine()+ ": Type need to be boolean in condition part"); 
		} 
	}
	')' '{' (statements) '}' ;

for_statement : { if (TRACEON) System.out.println("Parsing an FOR statement "); } 
				'for' '('  (Identifier '=' logical_expr)?  ';' 
				(y = logical_expr
				{
					if ($y.attr_type != TypeInfo.Bool) {
						System.out.println("Error! " + $y.start.getLine()+ ": Type need to be boolean in condition part"); 
					} 
				})?
				 ';'  (assginExpr)? ')' '{' (statements) '}' ;

do_while_statement :{ if (TRACEON)  System.out.println("Parsing an DO_WHILE statement "); } 'do' '{' (statements) '}' 'while' '(' logical_expr 
	{
		if ($logical_expr.attr_type != TypeInfo.Bool) {
				System.out.println("Error! " + $logical_expr.start.getLine()+ ": Type need to be boolean in condition part"); 
		} 
	}
	')' ';' ; 
		   
/* ====== description of the tokens ====== */
FLOAT:'float';
INT:'int';
CHAR: 'char';
BOOLEAN: 'bool';
MAIN: 'main';
VOID: 'void';
IF: 'if';
ELSE: 'else';

Identifier:('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
Integer_constant:'0'..'9'+;
Floating_point_constant:'0'..'9'+ '.' '0'..'9'+;

WS:( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};
COMMENT:'/*' .* '*/' {$channel=HIDDEN;};