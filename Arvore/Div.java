package Arvore;

public class Div extends Arvore{
	Arvore esq;
	Arvore dir;
	
	public Div(Arvore dir, Arvore esq) {
		this.esq = esq;
		this.dir = dir;
	}
	
	@Override
	public Integer eval(Tabela e) {
		return esq.eval(e) / dir.eval(e);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

}
