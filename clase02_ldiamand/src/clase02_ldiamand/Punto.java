package clase02_ldiamand;

public class Punto {

	private int x;
	
	private int y;
	
	public void setX(int nx) {
		x = nx;
	}

	public void setY(int ny) {
		y = ny;
	}

	public String mostrar() {
		StringBuilder sb = new StringBuilder("");
		sb.append("[");
		sb.append(x);
		sb.append(", ");
		sb.append(y);
		sb.append("]");
		return sb.toString();
	}

}
