package clase02_ldiamand;

import java.util.Scanner;

public class CajeroAutomaticoTecladoTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		CajeroAutomatico c1 = new CajeroAutomatico();
		int total = c1.consultar();
		System.out.println(total);
		System.out.println("Ingrese el total a cargar:");
		c1.cargar(s.nextInt());
		total = c1.consultar();
		System.out.println(total);
		int extraido = c1.extraer(5000);
		System.out.println(extraido);
		total = c1.consultar();
		System.out.println(total);
	}
	
}
