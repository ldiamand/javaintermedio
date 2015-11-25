package clase08_ldiamand;

public class LamparaTest {

	public static void main(String[] args) {
		Lampara l1 = new Lampara();
		l1.on();
		System.out.println(l1.isPrendida());
		l1.off();
		System.out.println(l1.isPrendida());
	}
}
