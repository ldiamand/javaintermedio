package clase03_ldiamand;

public class SwitchDemo {

	public static void main(String[] args) {
		
		// byte, short, int, char, enum >=1.5, String >=1.7
//		switch (exp_int) {
//		case CONST_1:
//			// todo
//		case CONST_2:
//			//todo
//		...
//		}
		
		int a = 2;
		switch (a) {
		case 1: 
			System.out.println("Uno");
		case 2: 
			System.out.println("Dos");
		case 3:
			System.out.println("Tres");
		}
		
		switch (a) {
		case 1: 
			System.out.println("Uno");
			break;
		case 2: 
			System.out.println("Dos");
			break;
		case 3:
			System.out.println("Tres");
			break;
		}
		
		a = 4;
		switch (a) {
		case 1: 
			System.out.println("Uno");
			break;
		case 2: 
			System.out.println("Dos");
			break;
		case 3:
			System.out.println("Tres");
			break;
		default:
			System.out.println("Ni uno ni dos ni tres");
		}
		
		switch (a) {
		case 1: 
			System.out.println("Uno");
			break;
		default:
			System.out.println("Ni uno ni dos ni tres");
		case 2: 
			System.out.println("Dos");
			break;
		case 3:
			System.out.println("Tres");
			break;
		}
		
		char c1 = 'a', c2 = 'b' ;
		switch (c1) {
//		case c2:
//			break;
		case 'A':
		case 66:
		default:
			break;
		}	
	}

}
