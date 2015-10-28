package clase04_ldiamand;

import java.util.Scanner;

public class DudasDeLaPractica {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String linea = s.nextLine();
		int entero = s.nextInt();
		
		String numero = "1";
		int numeroE = Integer.parseInt(numero);
		
		int azar = (int) (Math.random() * 9) + 1;
		
		String var = linea.substring(3);
		String var2 = linea.substring(3, 4);
		System.out.println(var);
		System.out.println(var2);
		
		System.out.println(linea == "A");
		System.out.println(linea.equals("A"));
		
		double d = 1.1;
		int i = (int) d;
		
		if (i == 1) {
			System.exit(-1); // Salgo del programa
		}
		
	}
}
