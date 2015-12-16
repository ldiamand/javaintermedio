package clase11_ldiamand;

import java.io.FileInputStream;
import java.io.IOException;

public class LecturaDeBytesDemo {

	public static void main(String[] args) {
		try (FileInputStream fs = 
				new FileInputStream("archivo")) {
			int dato;
			while ((dato = fs.read()) != -1) {
				System.out.print((char) dato);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
