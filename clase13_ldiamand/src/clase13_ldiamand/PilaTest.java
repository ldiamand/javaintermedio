package clase13_ldiamand;

public class PilaTest {

	public static void main(String[] args) {
		Pila p1 = new Pila();
		p1.poner('A');
		p1.poner('B');
		p1.poner('C');
		p1.poner('D');
		p1.poner('E');
		
		System.out.println(p1.sacar());
		System.out.println(p1.sacar());
		System.out.println(p1.sacar());
		System.out.println(p1.sacar());
		System.out.println(p1.sacar());
	}
}
