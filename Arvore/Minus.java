package Arvore;

public class Minus extends Arvore {
	Arvore esq;
	Arvore dir;
	
	public Minus(Arvore esq, Arvore dir) {
		this.esq = esq;
		this.dir = dir;
	}

	@Override
	public Integer eval(Tabela e) {
		return esq.eval(e) - dir.eval(e);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

}
