package clase05_ldiamand;

public class PuntoTest {

	public static void main(String[] args) {
		Punto p1 = new Punto();
		System.out.println(p1.getCoordenadas());
		
		Punto p2 = new Punto(0);
		System.out.println(p2.getCoordenadas());
		
		Punto p3 = new Punto(1, 1);
		System.out.println(p3.getCoordenadas());
		
		double distancia = p2.distancia(p3);

		System.out.println(distancia);
	}

}
