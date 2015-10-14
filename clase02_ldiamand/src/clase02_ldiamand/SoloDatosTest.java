package clase02_ldiamand;

public class SoloDatosTest {

	public static void main(String[] args) {
		SoloDatos s1 = new SoloDatos();
		s1.setI(1);
		System.out.println(s1.getI());
		
		SoloDatos s2 = new SoloDatos();
		s2.setI(5);
		System.out.println(s2.getI());
	
		s1 = s2;
		
		System.out.println(s1.getI());
		System.out.println(s2.getI());
		
		s2.setI(100);
		System.out.println(s1.getI());
		
		s2 = null;
		
	}
}
