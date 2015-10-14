package clase01_ldiamand;

public class EjemploCamposYMetodos {

	// Campos
	// visibilidad | tipo   | identificador;
	   private       int      campo1;

	   private       char     ch1, ch2;
	   
	   private       String   campo2;
	   
	// Metodos
	// visibilidad | <static> | tipo retorno | identificador (tipo iden1, tipo iden2, ...) {
	   
	   public                   void           mostrar       () {
		   System.out.println("Hola");
	   }
	                               
	   public                   int            sumar         (int a, int b) {
		   return a + b;
	   }
}
