package clase03_ldiamand;

public class OperadoresRealcionales {

	public static void main(String[] args) {
		boolean b1 = 5 > 1;
		boolean b2 = 1 > 6;
		boolean b3 = b1 == b2;
		String s1 = "Hola";
		String s2 = new String("Hola");
		boolean b4 = s1 == s2;
		System.out.println(b4);
		boolean b5 = s1.equals(s2);
		System.out.println(b5);
		boolean b6 = s1 != s2;
		System.out.println(b6);
	}
}
