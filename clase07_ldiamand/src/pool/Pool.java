package pool;


public class Pool {

	private Conn [] conns;
	
	private boolean [] prestadas;
	
	public Pool () {
		conns = new Conn[2];
		prestadas = new boolean[2];
		for (int i = 0; i < conns.length; i++) {
			conns[i] = new Conn();
		}
	}
	
	public Conn obtener() {
		for (int i = 0; i < conns.length; i++) {
			if (!prestadas[i]) {
				prestadas[i] = true;
				return conns[i];
			}
		}
		return null;
	}

	public void devolver(Conn c) {
		for (int i = 0; i < conns.length; i++) {
			if (!prestadas[i]) {
				continue;
			}
			if (c == conns[i]) {
				prestadas[i] = false;
			}
		}
	}

}
