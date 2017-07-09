import java.util.ArrayList;

public class EDef extends Arvore {
	String interger, identifier, ife, thene, elsee, identifier2, leftparen, rightparen;
	EDef e1, e2, e3, e4, e5, e6;
	OpSDef ops;
	OpMDef opm;
	OpRelDef opr;
	SeqDef seq;

	public int valor;

	public EDef(Token valor) {
		this.identifier = this.interger = valor.value;
		this.e1 = e2 = null;
		this.ops = null;
		this.opm = null;
		this.ife = null;
		this.e3 = null;
		this.opr = null;
		this.e4 = null;
		this.thene = null;
		this.e5 = null;
		this.elsee = null;
		this.e6 = null;
		this.identifier2 = null;
		this.leftparen = null;
		this.seq = null;
		this.rightparen = null;
	}

	public EDef(EDef e1, OpSDef ops, EDef e2) {
		this.identifier = this.interger = null;
		this.opm = null;
		this.ife = null;
		this.e3 = null;
		this.opr = null;
		this.e4 = null;
		this.thene = null;
		this.e5 = null;
		this.elsee = null;
		this.e6 = null;
		this.identifier2 = null;
		this.leftparen = null;
		this.seq = null;
		this.rightparen = null;
		this.e1 = e1;
		this.ops = ops;
		this.e2 = e2;
		if (ops.toString().equals("+")) {
			this.valor = e1.valor + e2.valor;
		} else if (ops.toString().equals("-")) {
			this.valor = e1.valor - e2.valor;
		}
		ArrayList<ID> lista = Tabela.lookup(Tabela.getKey());
		if (lista == null) {
			lista = new ArrayList<>();
		}
		lista.add(new ID(Tabela.getKey(), " a", this.valor));
		Tabela.set(Tabela.getKey(), lista);

	}

	public EDef(EDef e1, OpMDef opm, EDef e2) {
		this.identifier = this.interger = null;
		this.ops = null;
		this.ife = null;
		this.e3 = null;
		this.opr = null;
		this.e4 = null;
		this.thene = null;
		this.e5 = null;
		this.elsee = null;
		this.e6 = null;
		this.identifier2 = null;
		this.leftparen = null;
		this.seq = null;
		this.rightparen = null;
		this.e1 = e1;
		this.opm = opm;
		this.e2 = e2;
		if (opm.toString().equals("*")) {
			this.valor = e1.valor * e2.valor;
		} else if (opm.toString().equals("/")) {
			this.valor = e1.valor / e2.valor;
		}
		ArrayList<ID> lista = Tabela.lookup(Tabela.getKey());
		if (lista == null) {
			lista = new ArrayList<>();
		}
		lista.add(new ID(Tabela.getKey(), " a", this.valor));
		Tabela.set(Tabela.getKey(), lista);
	}

	public EDef(Token ife, EDef e3, OpRelDef opr, EDef e4, Token thene, EDef e5, Token elsee, EDef e6) {
		this.identifier = this.interger = null;
		this.ops = null;
		this.e1 = e2 = null;
		this.opm = null;
		this.identifier2 = null;
		this.leftparen = null;
		this.seq = null;
		this.rightparen = null;
		this.ife = ife.value;
		this.e3 = e3;
		this.opr = opr;
		this.e4 = e4;
		this.thene = thene.value;
		this.e5 = e5;
		this.elsee = elsee.value;
		this.e6 = e6;
		if (opr.toString().equals(">")) {
			if (e3.valor > e4.valor) {
				this.valor = e5.valor;
			} else {
				this.valor = e6.valor;
			}

		} else if (opr.toString().equals("<")) {
			if (e3.valor < e4.valor) {
				this.valor = e5.valor;
			} else {
				this.valor = e6.valor;
			}
		} else if (opr.toString().equals("=")) {
			if (e3.valor == e4.valor) {
				this.valor = e5.valor;
			} else {
				this.valor = e6.valor;
			}
		}
		ArrayList<ID> lista = Tabela.lookup(Tabela.getKey());
		if (lista == null) {
			lista = new ArrayList<>();
		}
		lista.add(new ID(Tabela.getKey(), " a", this.valor));
		// Tabela.set(Tabela.getKey(), lista);
	}

	public EDef(Token identifier2, Token leftparen, SeqDef seq, Token rightparen) {
		this.identifier = this.interger = null;
		this.e1 = e2 = null;
		this.ops = null;
		this.opm = null;
		this.ife = null;
		this.e3 = null;
		this.opr = null;
		this.e4 = null;
		this.thene = null;
		this.e5 = null;
		this.elsee = null;
		this.e6 = null;
		this.identifier2 = identifier2.value;
		this.leftparen = leftparen.value;
		this.seq = seq;
		this.rightparen = rightparen.value;
	}

	@Override
	public String toString() {
		if (this.identifier == null && this.interger == null && this.ops == null && this.e1 == null && this.e2 == null
				&& this.opm == null && this.identifier2 == null && this.leftparen == null && this.seq == null
				&& this.rightparen == null) {

			return this.ife + " " + this.e3.toString() + " " + this.opr + " " + this.e4.toString() + " " + this.thene
					+ " " + this.e5.toString() + " " + this.elsee + " " + this.e6.toString();

		} else if (this.identifier == null && this.interger == null && this.ops == null && this.e1 == null
				&& this.e2 == null && this.opm == null && this.ife == null && this.e3 == null && this.opr == null
				&& this.e4 == null && this.thene == null && this.e5 == null && this.elsee == null && this.e6 == null) {

			return this.identifier2 + this.leftparen + " " + this.seq.toString() + " " + this.rightparen;

		} else if (this.identifier == null && this.interger == null && this.ops == null && this.ife == null
				&& this.e3 == null && this.opr == null && this.e4 == null && this.thene == null && this.e5 == null
				&& this.elsee == null && this.e6 == null && this.identifier2 == null && this.leftparen == null
				&& this.seq == null && this.rightparen == null) {

			return this.e1.toString() + " " + this.opm + " " + this.e2.toString();

		} else if (this.identifier == null && this.interger == null && this.opm == null && this.ife == null
				&& this.e3 == null && this.opr == null && this.e4 == null && this.thene == null && this.e5 == null
				&& this.elsee == null && this.e6 == null && this.identifier2 == null && this.leftparen == null
				&& this.seq == null && this.rightparen == null) {

			return this.e1.toString() + " " + this.ops + " " + this.e2.toString();

		} else if (this.ops == null && this.ife == null && this.e3 == null && this.opr == null && this.e4 == null
				&& this.thene == null && this.e5 == null && this.elsee == null && this.e6 == null
				&& this.identifier2 == null && this.leftparen == null && this.seq == null && this.rightparen == null
				&& this.opm == null && this.e1 == null && this.e2 == null) {

			return this.identifier;

		} else {
			return null;
		}

	}

	@Override
	public Integer eval(Tabela e) {
		// TODO Auto-generated method stub
		return null;
	}
}
