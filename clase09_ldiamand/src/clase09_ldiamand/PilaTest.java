package clase09_ldiamand;

public class PilaTest {

	public static void main(String[] args) {
		Pila<String> p1 = new Pila<>();
		p1.poner("Uno");
		p1.poner("Dos");
		p1.poner("Tres");
//		p1.poner(new Integer(5));
		System.out.println(p1.size());
		System.out.println(p1.sacar());
		System.out.println(p1.sacar());
	}
}
