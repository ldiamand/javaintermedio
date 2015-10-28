package clase04_ldiamand;

import java.util.Scanner;

public class ContadorVocales {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese la frase: ");
		String linea = s.nextLine();
		linea = linea.toLowerCase();
		int vocales = 0;
		for (int i = 0; i < linea.length(); i++) {
			char c = linea.charAt(i);
			switch (c) {
			case 'a': case 'e': case 'i': 
			case 'o': case 'u':
				vocales++;
			}
		}
		System.out.println("La cantidad de vocales es: "
				+ vocales);
	}

}
