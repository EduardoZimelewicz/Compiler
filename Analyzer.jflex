import java_cup.runtime.*;

%%

%cupdebug
%class LexAnalyzer
%standalone
%line
%column
%cupsym Sym
%cup

TERM_LINHA = \r|\n|\r\n
INPUT = [^\r\n]
BRANCO = {TERM_LINHA} | [ \t\f]
COMENT_LINHA = "//" {INPUT}* {TERM_LINHA}?
COMENT_COLUNA = "/*" [^*] ~"*/" | "/*" "*"+ "/"
ID = [a-zA-Z_][a-zA-Z0-9_]*
INTEIRO =  0 | [1-9][0-9]*

%%

"if" 				{return new Symbol(Sym.IF);}        		
"then" 			{return new Symbol(Sym.THEN);}    
"else" 			{return new Symbol(Sym.ELSE);}    
"def" 			{return new Symbol(Sym.DEF);}

">" 				{return new Symbol(Sym.LESSTHAN);}    
"<" 				{return new Symbol(Sym.MORETHAN);}
"=" 				{return new Symbol(Sym.ASSIGNMENT);}  

"+" 				{return new Symbol(Sym.PLUS);}
"-" 				{return new Symbol(Sym.MINUS);} 
"*" 				{return new Symbol(Sym.MULT);} 
"/" 				{return new Symbol(Sym.DIV);} 

"(" 				{return new Symbol(Sym.LEFTPAREN);}
")" 				{return new Symbol(Sym.RIGHTPAREN);}
";" 				{return new Symbol(Sym.SEMICOLON);}
"," 				{return new Symbol(Sym.COMMA);}

{BRANCO} 						{/*ignore*/}
{COMENT_LINHA} 			{/*ignore*/}
{COMENT_COLUNA} 		{/*ignore*/}
{ID} 						{return new Symbol(Sym.IDENTIFIER);}
{INTEIRO} 				{return new Symbol(Sym.INTEGER);}

[^]			{ throw new RuntimeException("Caractere invalido " + yytext() + " na linha " + (yyline+1) + ", coluna " +(yycolumn+1)); }