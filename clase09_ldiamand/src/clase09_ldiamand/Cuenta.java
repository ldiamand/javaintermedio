package clase09_ldiamand;

public class Cuenta {

	private double saldo = 100;
	
	public double extraer (double cant) 
			throws SinSaldoException {
		if (cant > saldo) {
			throw new SinSaldoException();
		}
		saldo -= cant;
		return cant;
	}
}
