

public class Identifier extends Arvore{
	public String id;
		
	public Identifier(String id) {
		this.id = id;
	}
	@Override
	public Integer eval(Tabela e) {
		return e.lookup(id);
	}

}
