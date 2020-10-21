package mvc.view;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PartidaTest {

	@Test
	void testContinuarJuego() {
		String input;
		Partida partida = new Partida();
		input = "S";
		assertEquals(0, partida.continuarJuego(input));
		assertNotEquals(1, partida.continuarJuego(input));
		
		input = "s";
		assertEquals(0, partida.continuarJuego(input));
		assertNotEquals(1, partida.continuarJuego(input));
		
		input = "N";
		assertEquals(1, partida.continuarJuego(input));
		assertNotEquals(0, partida.continuarJuego(input));
		
		input = "n";
		assertEquals(1, partida.continuarJuego(input));
		assertNotEquals(0, partida.continuarJuego(input));
		
		input = "No";
		assertEquals(-1, partida.continuarJuego(input));
		assertNotEquals(0, partida.continuarJuego(input));
		
		input = "Si";
		assertEquals(-1, partida.continuarJuego(input));
		assertNotEquals(0, partida.continuarJuego(input));
	}
	
	@Test
	void testSetNivel() {
		Partida partida = new Partida();
		
		int nivel = 0;
		partida.setNivel(nivel);
		assertEquals(1, partida.getNivel());
		assertNotEquals(0, partida.getNivel());
		
		nivel = 1;
		partida.setNivel(nivel);
		assertEquals(1, partida.getNivel());
		assertNotEquals(0, partida.getNivel());
		
		nivel = 2;
		partida.setNivel(nivel);
		assertEquals(2, partida.getNivel());
		assertNotEquals(1, partida.getNivel());
		
		nivel = 3;
		partida.setNivel(nivel);
		assertEquals(3, partida.getNivel());
		assertNotEquals(2, partida.getNivel());
		
		nivel = 4;
		partida.setNivel(nivel);
		assertEquals(4, partida.getNivel());
		assertNotEquals(3, partida.getNivel());

		nivel = 5;
		partida.setNivel(nivel);
		assertEquals(4, partida.getNivel());
		assertNotEquals(5, partida.getNivel());
	}
}
