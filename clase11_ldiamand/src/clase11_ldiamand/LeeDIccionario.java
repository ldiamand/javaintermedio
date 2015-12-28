package clase11_ldiamand;

import java.io.FileReader;
import java.util.Scanner;

public class LeeDIccionario {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(new FileReader("spanish"))) {
			int azar = (int) (Math.random() * 86000);
			int cont = 0;
			while (s.hasNextLine()) {
				String linea = s.nextLine();
				if (azar == cont++) {
					System.out.println(linea);
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
