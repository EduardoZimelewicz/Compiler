package Arvore;

public class MoreThan extends Arvore{
	Arvore esq;
	Arvore dir;
	
	public MoreThan(Arvore dir, Arvore esq) {
		this.esq = esq;
		this.dir = dir;
	}
	
	@Override
	public Integer eval(Tabela e) {
		if(esq.eval(e) < dir.eval(e)) {
			return 1;
		}
		return 0;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

}
