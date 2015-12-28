package clase13_ldiamand;

public class HiloIncrementador extends Thread {

	private Contador contador;
	
	public HiloIncrementador(Contador contador) {
		this.contador = contador;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			contador.inc();
		}
	}
}
