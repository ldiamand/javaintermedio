package clase03_ldiamand;

public class ForDemo {

	public static void main(String[] args) {
//		for (init; cond; paso) {
			// cuerpo
//		}
		for (;;) {
			// bucle infinito
			break;
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
		
		cualquiera: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				if (i == j && i != 0) {
					break cualquiera;
				}
			}
		}
		
		for (int i = 0, j = 9; i != j; i++, j--) {
			System.out.println(i + " " + j);
		}	
	}
	
}

