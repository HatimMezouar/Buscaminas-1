package mvc.model;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TableroPairwise {

	@Test
	void testObrirCasella() {
		TableroMock mockObject = Mockito.mock(TableroMock.class);
		System.out.println(mockObject.getNivel());
		
		
		assertTrue(mockObject.destaparCasilla(0,0));
		assertTrue(mockObject.destaparCasilla(0, 1));
		assertTrue(mockObject.destaparCasilla(0, 2));
		assertTrue(mockObject.destaparCasilla(1, 0));
		assertTrue(mockObject.destaparCasilla(1, 1));
		assertTrue(mockObject.destaparCasilla(1, 2));
		assertTrue(mockObject.destaparCasilla(2, 0));
		assertTrue(mockObject.destaparCasilla(2, 1));
		assertTrue(mockObject.destaparCasilla(2, 2));
	}

}
