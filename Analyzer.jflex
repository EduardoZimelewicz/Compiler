%%

%class LexAnalyzer
%standalone
%line
%column

TERM_LINHA = \r|\n|\r\n
INPUT = [^\r\n]
BRANCO = {TERM_LINHA} | [ \t\f]
COMENT_LINHA = "//" {INPUT}* {TERM_LINHA}?
COMENT_COLUNA = "/*" [^*] ~"*/" | "/*" "*"+ "/"
ID = [a-zA-Z_][a-zA-Z0-9_]*
INTEIRO =  0 | [1-9][0-9]*

%%
"if" 				{System.out.println(yytext() + " - " + "Palavra reservada if");}        		
"then" 			{System.out.println(yytext() + " - " + "Palavra reservada then");}    
"else" 			{System.out.println(yytext() + " - " + "Palavra reservada else");}    
"def" 			{System.out.println(yytext() + " - " + "Palavra reservada def");}    

">" 				{System.out.println(yytext() + " - " + "Op menorQue");}    
"<" 				{System.out.println(yytext() + " - " + "Op maiorQue");}
"=" 				{System.out.println(yytext() + " - " + "Op igual");}  

"+" 				{System.out.println(yytext() + " - " + "Op soma");}
"-" 				{System.out.println(yytext() + " - " + "Op subtracao");} 
"*" 				{System.out.println(yytext() + " - " + "Op multiplicacao");} 
"/" 				{System.out.println(yytext() + " - " + "Op divisao");} 

"(" 				{System.out.println(yytext() + " - " + "Abre parenteses");}
")" 				{System.out.println(yytext() + " - " + "Fecha parenteses");}
";" 				{System.out.println(yytext() + " - " + "ponto e virgula");}
"," 				{System.out.println(yytext() + " - " + "virgula");}

{BRANCO} 						{/*ignore*/}
{COMENT_LINHA} 			{/*ignore*/}
{COMENT_COLUNA} 		{/*ignore*/}
{ID} 						{System.out.println(yytext() + " - " + "Identificador");}
{INTEIRO} 				{System.out.println(yytext() + " - " + "Numero Inteiro");}

[^]			{ throw new RuntimeException("Caractere invalido " + yytext() + " na linha " + (yyline+1) + ", coluna " +(yycolumn+1)); }