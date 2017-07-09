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

"if" 				{return new Symbol(Sym.IF, new Token(yytext()));}        		
"then" 			{return new Symbol(Sym.THEN, new Token(yytext()));}    
"else" 			{return new Symbol(Sym.ELSE, new Token(yytext()));}    
"def" 			{return new Symbol(Sym.DEF, new Token(yytext()));}

">" 				{return new Symbol(Sym.LESSTHAN, new Token(yytext()));}    
"<" 				{return new Symbol(Sym.MORETHAN, new Token(yytext()));}
"=" 				{return new Symbol(Sym.ASSIGNMENT, new Token(yytext()));}  

"+" 				{return new Symbol(Sym.PLUS, new Token(yytext()));}
"-" 				{return new Symbol(Sym.MINUS, new Token(yytext()));} 
"*" 				{return new Symbol(Sym.MULT, new Token(yytext()));} 
"/" 				{return new Symbol(Sym.DIV, new Token(yytext()));} 

"(" 				{return new Symbol(Sym.LEFTPAREN, new Token(yytext()));}
")" 				{return new Symbol(Sym.RIGHTPAREN, new Token(yytext()));}
";" 				{return new Symbol(Sym.SEMICOLON, new Token(yytext()));}
"," 				{return new Symbol(Sym.COMMA, new Token(yytext()));}

{BRANCO} 						{/*ignore*/}
{COMENT_LINHA} 			{/*ignore*/}
{COMENT_COLUNA} 		{/*ignore*/}
{ID} 						{return new Symbol(Sym.IDENTIFIER, new Token(yytext()));}
{INTEIRO} 				{return new Symbol(Sym.INTEGER, new Token(yytext()));}

[^]			{ throw new RuntimeException("Caractere invalido " + yytext() + " na linha " + (yyline+1) + ", coluna " +(yycolumn+1)); }