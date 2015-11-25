package inicializacion;

public class Inicializacion3 {

	private Integer i;
	
	public Integer getI() {
		// Lazy o incializacion perezosa
		if (i == null) {
			i = 3;
		}
		return i;
	}

}
