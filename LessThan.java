

public class LessThan extends Arvore{
	Arvore esq;
	Arvore dir;
	
	public LessThan(Arvore esq, Arvore dir) {
		this.esq = esq;
		this.dir = dir;
	}
	
	@Override
	public Integer eval(Tabela e) {
		if(esq.eval(e) > dir.eval(e)) {
			return 1;
		}
		return 0;
	}

}
