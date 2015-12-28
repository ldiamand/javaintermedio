package clase13_ldiamand;

public class Hilo1RunnableTest {

	public static void main(String[] args) {
		Hilo1Runnable h1 = new Hilo1Runnable();
		Thread t1 = new Thread(h1);
		t1.start();
	}
}
