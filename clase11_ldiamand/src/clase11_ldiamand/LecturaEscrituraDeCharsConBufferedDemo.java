package clase11_ldiamand;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LecturaEscrituraDeCharsConBufferedDemo {

	public static void main(String[] args) {
		try (BufferedReader fs = new BufferedReader(new FileReader(
				"imagen.img"));
				BufferedWriter fw = new BufferedWriter(new FileWriter(
						"dest.img"))) {

			int cant;
			System.out.println("Inicio");
			while ((cant = fs.read()) != -1) {
				fw.write(cant);
			}
			System.out.println("Fin");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
