package clase11_ldiamand;

import java.io.FileReader;
import java.io.IOException;

public class LecturaDeCharsDemo {

	public static void main(String[] args) {
		try (FileReader fs = 
				new FileReader("archivo")) {
			int dato;
			while ((dato = fs.read()) != -1) {
				System.out.print((char) dato);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
