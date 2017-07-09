
public class OpMDef extends Arvore {

	String mult, div;

	public OpMDef(Token valor) {
		this.mult = null;
		this.div = null;
		if (valor.value.equals("*")) {
			this.mult = valor.value;
		} else if (valor.value.equals("/")) {
			this.div = valor.value;
		}
	}

	@Override
	public Integer eval(Tabela e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		if (this.mult == null) {
			return this.div;
		} else if (this.div == null) {
			return this.mult;
		} else {
			return null;
		}

	}
}
