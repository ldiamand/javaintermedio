package clase02_ldiamand;

import java.util.Scanner;

public class ErrorComun {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String linea = s.nextLine();
		if (linea == "hola") {
			System.out.println(" == ");
		} else if (linea.equals("hola")) {
			System.out.println(" equals ");
		}
		
		String cadena = "hola";
		if (cadena == "hola") {
			System.out.println(" == ");
		} else if (cadena.equals("hola")) {
			System.out.println(" equals ");
		}
		
		
 	}
}
