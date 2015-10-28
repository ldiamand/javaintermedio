package clase03_ldiamand;

public class DoWhileDemo {

	public static void main(String[] args) {
//		do {
			// Cuerpo
//		} while (cond_boolean);
		
		int i = 0;
		do {
			System.out.println(i++);
		} while (i < 10);
		
		i = 0;
		do
			System.out.println(i++);
		while (i < 10);
		
	}
}
