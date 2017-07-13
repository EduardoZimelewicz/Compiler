import java.util.ArrayList;

public class ArgsDef extends Arvore{
	String id;
	String c;
	ArgsDef args;
	public ID novo;
	public static int contador = 0;
	public static int armazenador = 0;
	public static ArrayList<ID> lista;
	
	public ArgsDef(Token id, Token c, ArgsDef args) {
		this.id = id.value;
		this.c = c.value;
		this.args = args;
		
		if(ArgsDef.lista == null) {
			ArgsDef.lista = new ArrayList<>();
		}
	  this.novo = new ID(contador, this.id);
	  if(ArgsDef.contador>0) {
			for(int i = 0; i < ArgsDef.lista.size(); i++) {
				if(ArgsDef.lista.get(i).identificador.equals(this.novo.identificador)) {
					System.out.println("Erro de semantica, uso do memo parametro várias vezes na mesma função");
					while(ArgsDef.armazenador!=0) {
						ArgsDef.lista.remove(0);
						ArgsDef.armazenador = ArgsDef.contador=0;
					}
					System.exit(1);
				}
			}
		}
	  ArgsDef.lista.add(this.novo);
	  //Tabela.increaseKey();	
	
	}
	
	public ArgsDef(Token id) {
		this.id = id.value;
		this.c = null;
		this.args = null;
	}
	
	@Override
	public Integer eval(Tabela e) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		if(args == null) {
			return id;
		}else {
			return id+ c +" "+ args;
		}
		
	}
	
}
