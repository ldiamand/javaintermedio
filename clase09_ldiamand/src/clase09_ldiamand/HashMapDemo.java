package clase09_ldiamand;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> mapa = new HashMap<>();
		mapa.put("Uno", 1);
		mapa.put("Dos", 2);
		mapa.put("Tres", 3);
		
		mapa.put("Dos", 4);
		System.out.println(mapa.size());
		System.out.println(mapa.get("Dos"));
		
		Set<String> claves = mapa.keySet();
		for (String clave : claves) {
			System.out.println(mapa.get(clave));
		}
		
		System.out.println(mapa.get("Cinco"));
	}
}
