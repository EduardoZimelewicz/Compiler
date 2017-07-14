import java.util.ArrayList;

public class ArgsDef extends Arvore {
	String id;
	String c;
	ArgsDef args;
	public ID novo;

	public ArgsDef(Token id, Token c, ArgsDef args) {
		this.id = id.value;
		this.c = c.value;
		this.args = args;

		if (Tabela.lista == null) {
			Tabela.lista = new ArrayList<>();
		}
		this.novo = new ID(Tabela.contador, this.id);
		Tabela.lista.add(this.novo);
		Tabela.contador++;
		// Tabela.increaseKey();

	}

	public ArgsDef(Token id) {
		this.id = id.value;
		this.c = null;
		this.args = null;

		this.novo = new ID(Tabela.contador, this.id);
		if (Tabela.lista != null) {
			Tabela.lista.add(this.novo);
		}

		if (Tabela.lista != null) {
			ArrayList<ID> auxiliar = Tabela.lookup(Tabela.getKey());
			//System.out.println(Tabela.lista.size() + " " + auxiliar.size());
			for (int i = 0; i < Tabela.lista.size(); i++) {
				for (int j = 0; j < auxiliar.size(); j++) {
					if (Tabela.lista.get(i).identificador.equals(auxiliar.get(j).identificador)) {
						System.out.println("Erro de semantica, uso de parametro não declarado anteriormente");
						System.exit(1);
					}
					
				}
			}

			for (int i = 1; i < Tabela.lista.size(); i++) {
				Tabela.armazenador++;
				System.out.println(Tabela.lista.get(i-1).identificador+ Tabela.lista.get(i).identificador);
				if (Tabela.lista.get(i-1).identificador.equals(Tabela.lista.get(i).identificador)) {
					System.out.println("Erro de semantica, uso do mesmo parametro várias vezes na mesma função");
					while (Tabela.armazenador != 0) {
						Tabela.lista.remove(0);
						Tabela.armazenador--;
						System.exit(1);
					}
					
				}
			}

		}

		Tabela.contador++;
	}

	@Override
	public Integer eval(Tabela e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		if (args == null) {
			return id;
		} else {
			return id + c + " " + args;
		}

	}

}
