package clase13_ldiamand;

public class HiloJoin extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
			if (i % 1000 == 0) {
				System.out.println("Durmiendo");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
