package clase11_ldiamand;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class LecturaPorLineaScannerDemo {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(
				new FileInputStream("archivo"))) {
			
			while (s.hasNextLine()) {
				System.out.println(s.nextLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
