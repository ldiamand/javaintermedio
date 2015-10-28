package clase03_ldiamand;

public class IfElseDemo {

	public static void main(String[] args) {
//		if (cond_boolean) {
			// true
//		}
		int a = 10;
		if (a < 20) {
			System.out.println("Menor a veinte");
		}
		
		if (a < 20) 
			System.out.println("Menor a veinte");
		
//		if (cond_boolean) {
			// true
//		} else {
			// false
//		}
		
		if (a < 20) {
			System.out.println("Menor a veinte");
		} else {
			System.out.println("Mayor o igual a veinte");
		}
		
		if (a < 20) {
			// todo
		} else if (a > 30) {
			// todo
		} else {
			
		}
		
		if (a > 15)
			if (a < 30)
				System.out.println("Menor a treinta");
		else
			System.out.println("Menor o igual a 15");
		
	}
}


