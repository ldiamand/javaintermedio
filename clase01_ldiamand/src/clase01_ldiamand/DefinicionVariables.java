package clase01_ldiamand;

public class DefinicionVariables {

	static int campo1;
	
	public static void main(String[] args) {
		int var1; // Declaración de la variable var1
		var1 = 1;
		System.out.println(var1);
		
		int var2 = 5; // Declaro e inicializo
		
		// Los campos se inicializan por defecto
		System.out.println(campo1);
		
		String mensaje = "  Mensaje secreto  ";
		System.out.println(mensaje);
		
		char c1 = mensaje.charAt(1);
		System.out.println(c1);

		int e1 = mensaje.length();
		System.out.println(e1);
		
		String todoMayusculas = mensaje.toUpperCase();
		
		System.out.println(todoMayusculas);
		
		String s1 = "Hola";
		String s2 = "Chaus";
		
		System.out.println(s2.compareTo(s1));
		
	}
}
