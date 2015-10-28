package clase04_ldiamand;

public class ArreglosTP {

	public static void main(String[] args) {
		int [] arr = new int[3];
		
		arr[1] = 1;
		
		int valor = arr[0];
		System.out.println(valor);
		
		int cant = arr.length;
		System.out.println(cant);
		
//		arr.length = 5; // NO

//		int valor2 = arr[3]; // ETE
//		System.out.println(valor2);
		
		char [] arr2 = { 'a', 'b', 'c' };
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		for (char c : arr2) {
			System.out.println(c);
		}
		
	}
}
