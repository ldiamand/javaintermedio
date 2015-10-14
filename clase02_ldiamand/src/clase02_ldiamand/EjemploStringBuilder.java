package clase02_ldiamand;

public class EjemploStringBuilder {

	public static void main(String[] args) {
		String cadena = "";
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			cadena += "Luciano" + i;
		}
		long end = System.currentTimeMillis();
		System.out.println("Tiempo: " + (end - start));
		
		StringBuilder cadenaBuilder = new StringBuilder("");
		start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			cadenaBuilder.append("Luciano");
			cadenaBuilder.append(i);
		}
		String cadenaFinal = cadenaBuilder.toString();
		end = System.currentTimeMillis();
		System.out.println("Tiempo: " + (end - start));
		System.out.println(cadena.equals(cadenaFinal));
	}
}
