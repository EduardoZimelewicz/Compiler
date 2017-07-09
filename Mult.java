

public class Mult extends Arvore {
	Arvore esq;
	Arvore dir;
	
	public Mult(Arvore esq, Arvore dir) {
		this.esq = esq;
		this.dir = dir;
	}

	@Override
	public Integer eval(Tabela e) {
		return esq.eval(e) * dir.eval(e);
	}
	
}
