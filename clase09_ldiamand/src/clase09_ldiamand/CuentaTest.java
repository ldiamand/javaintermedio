package clase09_ldiamand;

public class CuentaTest {

	public static void main(String[] args) {
		Cuenta c = new Cuenta();
		try {
			System.out.println(c.extraer(110));
		} catch (SinSaldoException e) {
			System.out.println("No es posible realizar "
				+ "la transaccion por falta de fondos");
		}
	}
}
