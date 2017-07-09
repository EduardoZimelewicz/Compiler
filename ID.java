
public class ID {
	public int key;
	public String identificador;
	public int valor;
	
	public ID(int key, String identificador, int valor) {
		this.key = key;
		this.identificador = identificador;
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return this.identificador + " " + this.valor;
	}
}
