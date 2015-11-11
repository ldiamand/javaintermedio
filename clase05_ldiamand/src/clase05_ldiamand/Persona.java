package clase05_ldiamand;

public class Persona {

	private String nombre;
	
	private String apellido;
	
	private int edad;
	
	private char sexo;
	
	public Persona (String nnombre, String napellido) {
		nombre = nnombre;
		apellido = napellido;
	}

	public Persona (String nnombre, String napellido,
			int nedad) {
		this(nnombre, napellido);
		edad = nedad;
	}
	
	public Persona (String nnombre, String napellido,
			int nedad, char nsexo) {
		this(nnombre, napellido, nedad);
		sexo = nsexo;
	}
	
	public String getNombre() {
//		this("Luciano", "Diamand"); // no puedo llamar 
		// al constructor
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

	public char getSexo() {
		return sexo;
	}
	
}
