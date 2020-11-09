package mvc.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TableroPairwise {

	@Test
	void testObrirCasella() {
		int nivel=1;
		TableroMock mockObject = new TableroMock(nivel);
		System.out.println(mockObject.getNivel());
		assertTrue(mockObject.destaparCasilla(0,0));
		assertTrue(mockObject.destaparCasilla(0,1));
		assertTrue(mockObject.destaparCasilla(0, 2));
		assertTrue(mockObject.destaparCasilla(0, 3));
		assertTrue(mockObject.destaparCasilla(0, 4));
		assertTrue(mockObject.destaparCasilla(1, 0));
		assertTrue(mockObject.destaparCasilla(1, 1));
		assertTrue(mockObject.destaparCasilla(1, 2));
		assertTrue(mockObject.destaparCasilla(1, 3));
		assertTrue(mockObject.destaparCasilla(1, 4));		
		assertTrue(mockObject.destaparCasilla(2, 0));
		assertTrue(mockObject.destaparCasilla(2, 1));
		assertTrue(mockObject.destaparCasilla(2, 2));
		assertTrue(mockObject.destaparCasilla(2, 3));
		assertTrue(mockObject.destaparCasilla(2, 4));
		assertTrue(mockObject.destaparCasilla(3, 0));
		assertTrue(mockObject.destaparCasilla(3, 1));
		assertTrue(mockObject.destaparCasilla(3, 2));
		assertTrue(mockObject.destaparCasilla(3, 3));
		assertTrue(mockObject.destaparCasilla(3, 4));
		assertTrue(mockObject.destaparCasilla(4, 0));
		assertTrue(mockObject.destaparCasilla(4, 1));
		assertTrue(mockObject.destaparCasilla(4, 2));
		assertTrue(mockObject.destaparCasilla(4, 3));
		assertTrue(mockObject.destaparCasilla(4, 4));
		assertEquals(-1,mockObject.tablero[0][0].getValor());
		assertEquals(1,mockObject.tablero[0][1].getValor());
		assertEquals(0,mockObject.tablero[0][2].getValor());
		assertEquals(0,mockObject.tablero[0][3].getValor());
		assertEquals(0,mockObject.tablero[0][4].getValor());
		assertEquals(1,mockObject.tablero[1][0].getValor());
		assertEquals(1,mockObject.tablero[1][1].getValor());
		assertEquals(1,mockObject.tablero[1][2].getValor());
		assertEquals(1,mockObject.tablero[1][3].getValor());
		assertEquals(1,mockObject.tablero[1][4].getValor());
		assertEquals(0,mockObject.tablero[2][0].getValor());
		assertEquals(1,mockObject.tablero[2][1].getValor());
		assertEquals(3,mockObject.tablero[2][2].getValor());
		assertEquals(-1,mockObject.tablero[2][3].getValor());
		assertEquals(2,mockObject.tablero[2][4].getValor());
		assertEquals(0,mockObject.tablero[3][0].getValor());
		assertEquals(1,mockObject.tablero[3][1].getValor());
		assertEquals(-1,mockObject.tablero[3][2].getValor());
		assertEquals(-1,mockObject.tablero[3][3].getValor());
		assertEquals(2,mockObject.tablero[3][4].getValor());
		assertEquals(0,mockObject.tablero[4][0].getValor());
		assertEquals(1,mockObject.tablero[4][1].getValor());
		assertEquals(2,mockObject.tablero[4][2].getValor());
		assertEquals(2,mockObject.tablero[4][3].getValor());
		assertEquals(1,mockObject.tablero[4][4].getValor());
		mockObject.mostrar();
	}

}
