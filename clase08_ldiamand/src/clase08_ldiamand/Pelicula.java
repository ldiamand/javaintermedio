package clase08_ldiamand;

public class Pelicula implements Ordenable {

	private int anio;
	
	private String titulo;
	
	public Pelicula (String titulo, int anio) {
		this.anio = anio;
		this.titulo = titulo;
	}
	
	public int getAnio() {
		return anio;
	}
	
	public String getTitulo() {
		return titulo;
	}

	@Override
	public int compareTo(Ordenable ord) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
