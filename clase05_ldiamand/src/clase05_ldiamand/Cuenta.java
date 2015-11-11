package clase05_ldiamand;

public class Cuenta {

	private double saldo;
	
	private static double dolar;

	public static double getDolar() {
		return dolar;
	}

	public static void setDolar(double dolar) {
		Cuenta.dolar = dolar;
	}

	public void depositar (double cantidad) {
		saldo += cantidad;
	}
	
	public double extraer (double cantidad) {
		saldo -= cantidad;
		return cantidad;
	}
	
	public double extraerDolares (double cantidadDolares) {
		saldo -= cantidadDolares * dolar;
		return cantidadDolares;
	}
	
	public double consultar () {
		return saldo;
	}
	
}
