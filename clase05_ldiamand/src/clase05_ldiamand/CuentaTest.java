package clase05_ldiamand;

public class CuentaTest {

	public static void main(String[] args) {
		Cuenta c1 = new Cuenta();
		c1.depositar(100000);
		Cuenta.setDolar(9.5);
		c1.extraerDolares(200);
		System.out.println(c1.consultar());
		
		Cuenta c2 = new Cuenta();
		Cuenta.setDolar(9.6);
		
		System.out.println(Cuenta.getDolar());
		System.out.println(Cuenta.getDolar());
		
		Cuenta.setDolar(9.7);
		System.out.println(Cuenta.getDolar());
		System.out.println(Cuenta.getDolar());
	}
}
