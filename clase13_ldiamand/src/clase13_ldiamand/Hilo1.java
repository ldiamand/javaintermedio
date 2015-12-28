package clase13_ldiamand;

public class Hilo1 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			if (i == 5000) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("\t" + i);
		}
	}
	
}
