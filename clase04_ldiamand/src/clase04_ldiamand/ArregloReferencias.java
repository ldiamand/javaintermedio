package clase04_ldiamand;

public class ArregloReferencias {

	public static void main(String[] args) {
		String [] arr = new String[3];
		
		arr[1] = "B";
		
		String s = "A";
		arr[2] = s;
		s = null;
		
		String [] arr2 = { "Luciano", "Daniel", "Diamand" };
		
//		String [] arr3;
//		arr3 = { "A", "C", "D", "C" }; // NC
		
		String [] arr3;
		arr3 = new String [] { "A", "C", "D", "C" };
		
		metodo(arr2);
		arr2[0] = "Cambio";
		// Arreglo anónimo
		
		metodo(new String[] { "a", "b", "c" });
	}
	
	private static void metodo (String [] a) {
		for (String valor : a) {
			System.out.println(valor);
		}
	}
	
}
