package clase13_ldiamand;

public class Contador {

	private int valor;
	
	public synchronized void inc() {
		valor++;
	}
	
	public void dec() {
		synchronized(this) {
			valor--;
		}
	}
	
	public int getValor() {
		return valor;
	}
}
