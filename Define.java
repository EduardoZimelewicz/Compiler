import java.util.ArrayList;

public class Define extends Arvore{
 String def;
 String identifier;
 String leftParen, rightParen;
 ArgsDef args;
 EDef e;
 ID id;
 public ArrayList<ID> lista;
  
 public Define(Token def, Token identifier, Token leftParen, ArgsDef args, Token rightParen, EDef e) {
  this.def = def.value;
  this.identifier = identifier.value;
  this.leftParen = leftParen.value;
  this.rightParen = rightParen.value;
  this.args = args;
  this.e = e;
  if(Tabela.lookup(Tabela.getKey()) == null) {
		this.lista = new ArrayList<>();
	}
	else {
		this.lista = Tabela.lookup(Tabela.getKey());
	}
  int escopo = Tabela.getKey();
  this.id = new ID(escopo, this.identifier);
  if(Tabela.lookup(escopo) != null) {
		for(int i = 0; i < this.lista.size(); i++) {
			if(lista.get(i).identificador.equals(this.id.identificador)) {
				System.out.println("Erro de semantica, definições de mesmo nome no mesmo escopo");
				System.exit(1);
			}
		}
	}
  lista.add(this.id);
  Tabela.set(escopo,lista);
  //Tabela.increaseKey();
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