package clase11_ldiamand;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LecturaEscrituraDeCharsDemo {

	public static void main(String[] args) {
		try (FileReader fs = new FileReader("imagen.img");
				FileWriter fw = new FileWriter("dest.img")) {
			int dato;
			System.out.println("Inicio");
			while ((dato = fs.read()) != -1) {
				fw.write(dato);
			}
			System.out.println("Fin");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
