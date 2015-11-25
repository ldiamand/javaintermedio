package clase08_ldiamand;

public class Cuadrado implements FG {

	private int lado;
	
	public Cuadrado(int lado) {
		this.lado = lado;
	}
	
	public double area() {
		return lado * lado;
	}
	
}
