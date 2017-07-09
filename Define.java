import java.util.ArrayList;

public class Define extends Arvore{
 String def;
 String identifier;
 String leftParen, rightParen;
 ArgsDef args;
 EDef e;
  
 public Define(Token def, Token identifier, Token leftParen, ArgsDef args, Token rightParen, EDef e) {
  this.def = def.value;
  this.identifier = identifier.value;
  this.leftParen = leftParen.value;
  this.rightParen = rightParen.value;
  this.args = args;
  this.e = e;
  
 }
 
 public String toString() {
  return def + " " + identifier + " " + leftParen + args.toString() + rightParen + " " + " = " + " " + e + ";" + "\n";   
 }

@Override
public Integer eval(Tabela e) {
 // TODO Auto-generated method stub
 return null;
}
}