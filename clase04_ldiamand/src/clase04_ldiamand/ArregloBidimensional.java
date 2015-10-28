package clase04_ldiamand;

public class ArregloBidimensional {

	public static void main(String[] args) {
		int [][] arr = new int[2][3];
		int cant = arr.length;
		System.out.println(cant);
		System.out.println(arr[0].length);
		
		arr[1][2] = 10;
		
		int [][] arr2 = new int[2][];
		arr2[0] = new int[2];
		System.out.println(arr2.length);
		System.out.println(arr2[0].length);
		arr2[1] = new int[4];
		System.out.println(arr2.length);
		System.out.println(arr2[1].length);
		
		
	}
}
