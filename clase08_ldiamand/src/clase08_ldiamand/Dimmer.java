package clase08_ldiamand;

public class Dimmer extends Lampara {

	private int nivel;
	
	public void inc() {
		nivel++;
		if(!isPrendida()) {
			super.on();
		}
	}
	
	@Override
	public void on() {
		nivel++;
		super.on();
	}
	
	public void dec() {
		
	}

	public int getNivel() {
		return nivel;
	}
	
}
