package clase02_ldiamand;

import static org.junit.Assert.*;

import org.junit.Test;

public class CajeroAutomaticoUnitTest {

	@Test
	public void testExtraer() {
		CajeroAutomatico c1 = new CajeroAutomatico();
		int result = c1.extraer(1000);
		assertEquals(1000, result);
		assertEquals(-1000, c1.consultar());
	}

	@Test
	public void testCargar() {
		CajeroAutomatico c1 = new CajeroAutomatico();
		c1.cargar(100000);
		assertEquals(100000, c1.consultar());
	}

	@Test
	public void testConsultar() {
		CajeroAutomatico c1 = new CajeroAutomatico();
		assertEquals(0, c1.consultar());
	}

}
