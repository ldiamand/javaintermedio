package clase02_ldiamand;

public class CajeroAutomatico {

	private int cantidadDinero;
	
	public int extraer(int cantidad) {
		cantidadDinero = cantidadDinero - cantidad;
		return cantidad;
	}
	
	public void cargar(int cantidad) {
		cantidadDinero = cantidadDinero + cantidad;
	}
	
	public int consultar() {
		return cantidadDinero;
	}
	
}
