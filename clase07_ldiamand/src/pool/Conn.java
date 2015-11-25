package pool;

public class Conn {

	private int id;

	private static int cont;

	Conn() {
		cont++;
		id = cont;
	}

	public int getId() {
		return id;
	}

	public void hacer() {
		System.out.println("Estoy haciendo algo con la conexion");
	}

}
