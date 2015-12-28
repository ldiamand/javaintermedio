package clase13_ldiamand;

public class Pila {

	private char [] elements;
	
	private int size;
	
	public Pila () {
		this(10);
	}
	
	public Pila (int cant) {
		elements = new char[cant];
	}
	
	public void poner(char c) {
		elements[size] = c;
		size = size + 1;
	}
	
	public char sacar() {
		size = size -1;
		return elements[size];
	}

}
