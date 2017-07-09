

public class Integers extends Arvore{
	public int value;
	
	Integers(int value){
		this.value = value;
	}
	@Override
	public Integer eval(Tabela e) {
		return value;
	}


}
