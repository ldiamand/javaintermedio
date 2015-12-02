package clase09_ldiamand;

import java.util.ArrayList;

public class Pila <T> {

	private ArrayList<T> elementos;
	
	private final int limit;
	
	public Pila() {
		this(2);
	}

	public Pila(int limit) {
		elementos = new ArrayList<>(limit);
		this.limit = limit;
	}
	
	public void poner(T elemento) {
		elementos.add(elemento);
	}
	
	public T sacar() {
		return elementos.remove(elementos.size() - 1);
	}

	public int size() {
		return elementos.size();
	}
	
}
