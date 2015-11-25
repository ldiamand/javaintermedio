package clase08_ldiamand;

public class OrdenableTest {

	public static void main(String[] args) {
		Pelicula p1 = new Pelicula("Volver al futuro", 1985);
		Pelicula p2 = new Pelicula("El señor de los anillos", 2000);
		
		int i = p1.compareTo(p2);
		
	}
}
