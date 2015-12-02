package clase09_ldiamand;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// Lista sin generics
		ArrayList lista = new ArrayList();
		lista.add("Luciano");
		lista.add(new Integer(2));
		String s = (String) lista.get(0);
		
		// Lista con generics
		ArrayList<String> lista2 = new ArrayList<>();
		lista2.add("Luciano");
		String s2 = lista2.get(0);
		
		lista2.add("Luciano");
		System.out.println(lista2.size());
		
		lista2.add(1, "Jorge");
		System.out.println(lista2.size());
		
		for (int i = 0; i < lista2.size(); i++) {
			System.out.println(lista2.get(i));
		}
		
		for (String value : lista2) {
			System.out.println(value);
		}
		
		lista2.set(0, "Juana");
		
		for (String value : lista2) {
			System.out.println(value);
		}
		
		lista2.remove(2);
		
		for (String value : lista2) {
			System.out.println(value);
		}
		
		lista2.add("Sopa");
		lista2.add("Sopa");
		lista2.add("Sopa");
		lista2.add("Sopa");
		lista2.add("Sopa");
		lista2.add("Sopa");
		
		lista2.remove("Sopa");
		
		for (String value : lista2) {
			System.out.println(value);
		}
		
		Iterator<String> it = lista2.iterator();
		while (it.hasNext()) {
			String s3 = it.next();
			if (s3.equals("Sopa")) {
				it.remove();
			}
		}
		
		for (String value : lista2) {
			System.out.println(value);
		}
		
		// El 1000 no es un limite
		ArrayList<String> lista3 = new ArrayList<>(1000);
	}
}

