package Arvore;

public class Assignment extends Arvore{
	public String esq;
	public Arvore dir;
	
	public Assignment(String esq, Arvore dir) {
		this.esq = esq;
		this.dir = dir;
	}
	
	@Override
	public Integer eval(Tabela e) {
		int value = dir.eval(e);
		e.set(esq, value);
		return value;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}
