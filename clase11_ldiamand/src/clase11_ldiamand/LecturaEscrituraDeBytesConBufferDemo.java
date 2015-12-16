package clase11_ldiamand;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LecturaEscrituraDeBytesConBufferDemo {

	public static void main(String[] args) {
		try (FileInputStream fs = new FileInputStream("corejava-io.pdf");
				FileOutputStream fw = new FileOutputStream("dest.pdf")) {
			byte [] buffer = new byte[8192];
			int cant;
			System.out.println("Inicio");
			while ((cant = fs.read(buffer)) != -1) {
				fw.write(buffer, 0, cant);
			}
			System.out.println("Fin");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
