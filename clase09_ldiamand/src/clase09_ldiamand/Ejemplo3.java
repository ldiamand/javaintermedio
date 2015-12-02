package clase09_ldiamand;

public class Ejemplo3 {

	public static void main(String[] args) {
		try {
			int j = 1;
			int i = 0;
			int result = j / i;
			System.out.println("No paso por aca");
			System.out.println(result);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Fin");
	}
}
