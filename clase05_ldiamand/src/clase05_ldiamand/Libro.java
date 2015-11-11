package clase05_ldiamand;

public class Libro {

	private int codigo;
	
	private String editorial;
	
	private String titulo;
	
	public Libro() {
		editorial = "O'Reilly";
	}
	
	public Libro(String edit) {
		editorial = edit;
	}
	
	public Libro(int ncodigo) {
		codigo = ncodigo;
	}
	
	public Libro(String ntitulo, int ncodigo) {
		titulo = ntitulo;
		codigo = ncodigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getEditorial() {
		return editorial;
	}

}
