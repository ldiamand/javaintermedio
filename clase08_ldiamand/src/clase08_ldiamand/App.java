package clase08_ldiamand;

public class App {

	public static void main(String[] args) {
		Cuadrado cua1 = new Cuadrado(2);
		Circulo cir1 = new Circulo();
		Triangulo tri1 = new Triangulo();
		
		//-----------------------------
		
		FG [] figuras = new FG[3];
		figuras[0] = cua1;
		figuras[1] = cir1;
		figuras[2] = tri1;
		for (FG fg : figuras) {
			if (fg != null) {
				System.out.println(fg.area());
			}
		}
		
//		FG f = new FG();
		
	}
}
