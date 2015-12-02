package clase09_ldiamand;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ejemplo5 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("texto.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
