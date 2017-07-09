
public class OpRelDef extends Arvore {
	String lessthan, morethen, assignment;

	public OpRelDef(Token valor) {
		this.lessthan = null;
		this.morethen = null;
		this.assignment = null;
		if (valor.value.equals(">")) {
			this.morethen = valor.value;
		} else if (valor.value.equals("<")) {
			this.lessthan = valor.value;
		} else if (valor.value.equals("=")) {
			this.assignment = valor.value;
		}
	}

	@Override
	public Integer eval(Tabela e) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public String toString() {
		if(this.lessthan == null && this.morethen == null) {
			return this.assignment;
		}else if(this.lessthan == null && this.assignment == null) {
			return this.morethen;
		}else if(this.morethen == null && this.assignment == null) {
			return this.lessthan;
		}else {
			return " ";
		}
	}
}
