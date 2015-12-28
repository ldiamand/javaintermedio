package clase13_ldiamand;

public class HiloDecrementador extends Thread {

	private Contador contador;
	
	public HiloDecrementador(Contador contador) {
		this.contador = contador;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			contador.dec();
		}
	}
}
