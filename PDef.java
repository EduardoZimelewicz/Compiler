import java.util.ArrayList;

public class PDef extends Arvore {
	public String esq;
	public Integer dir;
	public PDef p;
	public IDef i;
	public ArrayList<ID> lista;

	public PDef(Token esq, Token dir, PDef p) {
		this.esq = esq.value;
		this.dir = Integer.parseInt(dir.value);
		this.p = p;
		this.i = null;
		this.lista = new ArrayList<>();
		int escopo = Tabela.getKey();		
		lista.add(new ID(escopo, this.esq, this.dir));
		Tabela.increaseKey();
		Tabela.set(escopo,lista);
	}

	public PDef(IDef i) {
		this.esq = null;
		this.dir = null;
		this.p = null;
		this.i = i;
		this.lista = new ArrayList<>();
	}

	@Override
	public Integer eval(Tabela e) {
		if (i == null) {
			return null;
		} else {
			int value = dir;
			
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
