public class IDef extends Arvore{
	Define valor1;
	IDef valor2;
	
	public IDef(Define valor1) {
		this.valor1 = valor1;
		this.valor2 = null;
	}
	
	public IDef(Define valor1, IDef valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}
	
	@Override
	public Integer eval(Tabela e) {
		// TODO Auto-generated method stub
		
		return null;
	}
	
	@Override
	public String toString() {
		String retorno = "";
		if(valor2==null) {
			retorno = valor1.toString();
		}else {
			retorno = valor1.toString() + " " + valor2.toString();
		}
		return retorno;
		
	}
}
