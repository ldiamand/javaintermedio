package clase03_ldiamand;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		byte b1 = 1; // conversión implícita
//		byte b2 = 128; // NC
		
		byte b3 = 1, b4 = 2, b5;
		b5 = (byte) (b3 + b4); // operador cast
		
		byte b6 = 1 + 2;
		
		double d1 = 1.1;
		
//		float f1 = 1.1; // NC
		
		float f2 = (float) 1.1;
		float f3 = 1.1F;
		
		char c1 = 'a';
		c1 = (char) (c1 + 1);
		System.out.println(c1);
		
		int i1 = c1;
		System.out.println(i1);
		
		int i2 = 5 / 2;
		System.out.println(i2);
		
		double d2 = 5.0 / 2;
		System.out.println(d2);
		
		int i3 = 5 % 2;
		System.out.println(i3);
		
		int i4 = 1;
		System.out.println(i4);
		System.out.println(i4++);
		System.out.println(i4);
		System.out.println(++i4);
		System.out.println(i4);
		
	}
	
}
