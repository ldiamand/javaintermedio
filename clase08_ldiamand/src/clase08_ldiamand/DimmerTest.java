package clase08_ldiamand;

public class DimmerTest {

	public static void main(String[] args) {
		Dimmer d1 = new Dimmer();
		d1.on();
		System.out.println(d1.isPrendida());
		d1.off();
		System.out.println(d1.isPrendida());
		
		Dimmer d2 = new Dimmer();
		d2.on();
		d2.inc();
		d2.inc();
		System.out.println(d2.getNivel());
		
		Dimmer d3 = new Dimmer();
		d3.inc();
		System.out.println(d3.isPrendida());
		System.out.println(d3.getNivel());
		
		Dimmer d4 = new Dimmer();
		d4.on();
		System.out.println(d4.isPrendida());
		System.out.println(d4.getNivel());
	}
	
}
