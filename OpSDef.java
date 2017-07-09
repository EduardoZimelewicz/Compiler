
public class OpSDef extends Arvore {

	String plus, minus;

	public OpSDef(Token valor) {
		this.plus = null;
		this.minus = null;
		if (valor.value.equals("+")) {
			this.plus = valor.value;
		} else if (valor.value.equals("-")) {
			this.minus = valor.value;
		}
	}

	@Override
	public Integer eval(Tabela e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		if (this.plus == null) {
			return this.minus;
		} else if (this.minus == null) {
			return this.plus;
		} else {
			return null;
		}

	}
}
