package clase11_ldiamand;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaPorLineaDemo {

	public static void main(String[] args) {
		try (BufferedReader fs = new BufferedReader( 
				new FileReader("archivo"))) {
			String linea;
			while ((linea = fs.readLine()) != null) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
