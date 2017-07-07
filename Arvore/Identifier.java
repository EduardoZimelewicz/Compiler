package Arvore;

public class Identifier extends Arvore{
	public String id;
		
	public Identifier(String id) {
		this.id = id;
	}
	@Override
	public Integer eval(Tabela e) {
		return e.lookup(id);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}
