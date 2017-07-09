
import java.util.HashMap;
import java.util.Map;

public class Tabela {
	public HashMap<String, Integer> map;
	
	public Tabela() {
		this.map = new HashMap<String, Integer>();
	}
	
	public int lookup(String id) {
		return map.get(id);
	}
	
	public void set(String id, int value) {
		map.put(id, value);
	}
	
	public void print() {
		for(Map.Entry<String,Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());;
		}
	}
}
