package clase02_ldiamand;

public class EjemploStrings {

	public static void main(String[] args) {
		String s1 = "Hola";
		String s2 = new String("Hola");
		String s3 = "Hola";
		String s4 = "Chau";
		boolean b1 = s1.equals(s2);
		System.out.println(b1);
		boolean b2 = s3.equals(s4);
		System.out.println(b2);
		boolean b3 = s1 == s2;
		System.out.println(b3);
		boolean b4 = s1 == s3;
		System.out.println(b4);
	}
	
}
