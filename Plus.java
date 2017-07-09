

public class Plus extends Arvore{
	Arvore dir;
	Arvore esq;
	
	public Plus(Arvore dir, Arvore esq) {
		this.esq = esq;
		this.dir = dir;
	}
	
	public Integer eval(Tabela t) {
		return esq.eval(t) + dir.eval(t);
	}

}

