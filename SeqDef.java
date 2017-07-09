 
public class SeqDef extends Arvore{
	SeqDef s;
	String c;
	EDef e;
	
	public SeqDef(SeqDef s, Token c, EDef e) {
		this.s = s;
		this.c =c.value;
		this.e = e;
	}
	public SeqDef(EDef e) {
		this.s = null;
		this.c = null;
		this.e = e;
	}
	@Override
	public Integer eval(Tabela e) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		if(s == null) {
			return e.toString();
		}else {
			return s.toString()+c+e.toString();
		}
	}

}
