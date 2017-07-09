

public class Assignment extends Arvore{
	public String esq;
	public Integer dir;
	public Assignment p;
	
	public Assignment(Token esq, Token dir, Assignment p) {
		this.esq = esq.value;
		this.dir = Integer.parseInt(dir.value);
		this.p = p;
	}
	
	@Override
	public Integer eval(Tabela e) {
		int value = dir;
		e.set(esq, value);
		return value;
	}

	@Override
	public String toString() {
		return esq + " = " + dir + "\n" + (p != null? p.toString() : ""); 
	}
	
}
