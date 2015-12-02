package clase09_ldiamand;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> lista = new HashSet<>();
		lista.add("Luciano");
		lista.add("Luciano");
		System.out.println(lista.size());
		
		lista.remove("Luciano");
		
		lista.add("Uno");
		lista.add("Dos");
		lista.add("Tres");
		lista.add("Cuatro");
		
		for (String value : lista) {
			System.out.println(value);
		}
	}
}

