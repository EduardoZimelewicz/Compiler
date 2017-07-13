import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Tabela {
	public static Map<Integer,ArrayList<ID>> map = new HashMap<>();
	public static int key = 0;
	
	
	public static ArrayList<ID> lookup(int valor) {
		return map.get(valor);
	}
	
	public static void increaseKey() {
		key++;
	}
	
	public static int getKey() {
		return key;
	}
	
	public static void set(int key,ArrayList<ID> escopo) {
		map.put(key, escopo);
	}
	
	
	public static void print() {
		for(Entry<Integer, ArrayList<ID>> entry: map.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());;
		}
	}
}
