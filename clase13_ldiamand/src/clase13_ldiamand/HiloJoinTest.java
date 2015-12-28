package clase13_ldiamand;

public class HiloJoinTest {

	public static void main(String[] args) {
		HiloJoin hj = new HiloJoin();
		hj.start();
		try {
			hj.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Fin");
	}
}
