package clase03_ldiamand;

public class OperadoresLogicos {

	public static void main(String[] args) {
		int a = 5;
		int b = 1;
		int c = 3;
		int d = 2;
				
		boolean b1 = a > b && c < d;
		boolean b2 = c < d && a < b;
		
		String s1 = null;
		if (s1 != null && s1.equals("Hola")) {
			System.out.println("Son iguales");
		}
		
		boolean b3 = metodo1() & metodo2();
		
		boolean b4 = 4 < 10 | 5 == 1;
		boolean b5 = 4 < 10 || 5 == 1;

	}
	
	private static boolean metodo1() {
		System.out.println("Estoy en metodo 1");
		return false;
	}
	
	private static boolean metodo2() {
		System.out.println("Estoy en metodo 2");
		return true;
	}

}
