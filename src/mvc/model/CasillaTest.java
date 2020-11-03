package mvc.model;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CasillaTest {

	@Test
	void testDentroRango() {
		Casilla cas1 = new Casilla();
		Casilla cas2 = new Casilla();
		
		cas1.posiciones(7,8);
		cas2.posiciones(1,3);
		
		assertTrue(cas1.dentroRango(9));
		assertTrue(cas1.dentroRango(10));
		assertTrue(cas1.dentroRango(12));
		assertFalse(cas1.dentroRango(5));
		assertFalse(cas1.dentroRango(3));
		assertFalse(cas1.dentroRango(1));
		
		assertTrue(cas2.dentroRango(8));
		assertTrue(cas2.dentroRango(10));
		assertTrue(cas2.dentroRango(12));
		assertFalse(!cas2.dentroRango(5));
		assertFalse(cas2.dentroRango(3));
		assertFalse(cas2.dentroRango(1));
	}

}
