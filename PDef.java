import java.util.ArrayList;

public class PDef extends Arvore {
	public String esq;
	public Integer dir;
	public PDef p;
	public IDef i;
	public ID id;
	public ArrayList<ID> lista;

	public PDef(Token esq, Token dir, PDef p) {
		this.esq = esq.value;
		this.dir = Integer.parseInt(dir.value);
		this.p = p;
		this.i = null;
		if(Tabela.lookup(Tabela.getKey()) == null) {
			this.lista = new ArrayList<>();
		}
		else {
			this.lista = Tabela.lookup(Tabela.getKey());
		}
		int escopo = Tabela.getKey();
		this.id = new ID(escopo, this.esq, this.dir); 
		if(Tabela.lookup(escopo) != null) {
			for(int i = 0; i < this.lista.size(); i++) {
				if(lista.get(i).identificador.equals(this.id.identificador)) {
					System.out.println("Erro de semantica, variaveis iguais em mesmo escopo");
					System.exit(1);
				}
			}
		}
		lista.add(this.id);
		Tabela.set(escopo,lista);
	}

	public PDef(PDef p) {
		this.esq = null;
		this.dir = null;
		this.p = p;
		this.i = null;
		this.lista = new ArrayList<>();
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
