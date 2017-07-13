import java.util.ArrayList;

public class ArgsDef extends Arvore{
	String id;
	String c;
	ArgsDef args;
	
	public ArgsDef(Token id, Token c, ArgsDef args) {
		this.id = id.value;
		this.c = c.value;
		this.args = args;
		
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
