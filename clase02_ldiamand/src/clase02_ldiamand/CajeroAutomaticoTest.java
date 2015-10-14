package clase02_ldiamand;

public class CajeroAutomaticoTest {

	public static void main(String[] args) {
		CajeroAutomatico c1 = new CajeroAutomatico();
		int total = c1.consultar();
		System.out.println(total);
		c1.cargar(100000);
		total = c1.consultar();
		System.out.println(total);
		int extraido = c1.extraer(5000);
		System.out.println(extraido);
		total = c1.consultar();
		System.out.println(total);
	}
	
}
