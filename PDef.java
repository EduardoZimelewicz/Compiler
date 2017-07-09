public class PDef extends Arvore {
	public String esq;
	public Integer dir;
	public PDef p;
	public IDef i;

	public PDef(Token esq, Token dir, PDef p) {
		this.esq = esq.value;
		this.dir = Integer.parseInt(dir.value);
		this.p = p;
		this.i = null;

	}

	public PDef(IDef i) {
		this.esq = null;
		this.dir = null;
		this.p = null;
		this.i = i;
	}

	@Override
	public Integer eval(Tabela e) {
		if (i == null) {
			return null;
		} else {
			int value = dir;
			e.set(esq, value);
			return value;
		}
	}

	@Override
	public String toString() {
		if (i == null) {
			return esq + " = " + dir + "\n" + (p != null ? p.toString() : "");
		} else {
			return i.toString();
		}

	}

}
