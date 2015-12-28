package clase13_ldiamand;

public class HiloContadorTest {

	public static void main(String[] args) {
		Contador c = new Contador();
		System.out.println(c.getValor());
		HiloIncrementador hi = new HiloIncrementador(c);
		HiloDecrementador hd = new HiloDecrementador(c);
		hi.start();
		hd.start();
		
		try {
			hi.join();
			hd.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(c.getValor());
		
	}
	
}
