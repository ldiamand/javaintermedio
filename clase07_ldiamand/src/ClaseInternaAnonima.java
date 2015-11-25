
public class ClaseInternaAnonima {

	private class Interna {
		
		public void metodoInterno() {
			
		}
		
	}
	
	public void metodo() {
		metodo2(new Interna() {
			
			public void metodoInterno() {
				System.out.println("Hola");
			}
		});
	}
	
	public void metodo2(Interna i) {
		i.metodoInterno();
	}
}
