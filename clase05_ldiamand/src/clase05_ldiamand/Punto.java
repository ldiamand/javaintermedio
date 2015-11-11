package clase05_ldiamand;

public class Punto {

	private int x;

	private int y;
	
	public Punto(int xy) {
		this(xy, xy);
	}

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Punto() {
		this(azar(), azar());
	}

	private static int azar() {
		return (int) ((Math.random() - Math.random()) * 11);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String getCoordenadas() {
		return "[" + x + ", " + y + "]";
	}

	public double distancia(Punto p) {
		return Math.sqrt(Math.pow(x - p.x, 2) + 
				Math.pow(y - p.y, 2));
	}

}
