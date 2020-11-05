package mvc.model;

import org.mockito.*;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class TableroTest {
	//Test per la inicialitzacio de taulell
	@Test
	void testInicializarTablero() {
		int nivel=5;
		Tablero partida=new Tablero(nivel);
		partida.setNivel(5);
		partida.setMedida(nivel);
		assertEquals(partida.getMedida()*5, 20);
		nivel=4;
		partida.setNivel(5);
		partida.setMedida(nivel);
		assertEquals(partida.getMedida()*5, 20);
		nivel=3;
		partida.setNivel(5);
		partida.setMedida(nivel);
		assertEquals(partida.getMedida()*5, 15);
		nivel=2;
		partida.setNivel(5);
		partida.setMedida(nivel);
		assertEquals(partida.getMedida()*5, 10);
		nivel=1;
		partida.setNivel(5);
		partida.setMedida(nivel);
		assertEquals(partida.getMedida()*5, 5);
		nivel=0;
		partida.setNivel(5);
		partida.setMedida(nivel);
		assertEquals(partida.getMedida()*5, 5);
	}
	//Test per comprovar que l'assignacio de mines segons el nivel es correcte
	@Test
	void testCrearMines() {
		int nivell = 5;
		int mines = 0;
		Tablero partida = new Tablero(nivell);
		Casilla[][] Tablero = partida.getTablero();
		for(int i=0; i<partida.getMedida(); i++) {
    		for(int j=0; j<partida.getMedida(); j++) {
    			if (Tablero[i][j].getMina()) {
					mines++;
				}
    		}
		}
		assertEquals(20, mines);
		nivell = 4;
		mines = 0;
		partida = new Tablero(nivell);
		Tablero = partida.getTablero();
		for(int i=0; i<partida.getMedida(); i++) {
    		for(int j=0; j<partida.getMedida(); j++) {
    			if (Tablero[i][j].getMina()) {
					mines++;
				}
    		}
		}
		assertEquals(20, mines);
		nivell = 3;
		mines = 0;
		partida = new Tablero(nivell);
		Tablero = partida.getTablero();
		for(int i=0; i<partida.getMedida(); i++) {
    		for(int j=0; j<partida.getMedida(); j++) {
    			if (Tablero[i][j].getMina()) {
					mines++;
				}
    		}
		}
		assertEquals(15, mines);
		nivell = 0;
		mines = 0;
		partida = new Tablero(nivell);
		Tablero = partida.getTablero();
		for(int i=0; i<partida.getMedida(); i++) {
    		for(int j=0; j<partida.getMedida(); j++) {
    			if (Tablero[i][j].getMina()) {
					mines++;
				}
    		}
		}
		assertEquals(5, mines);
		nivell = 1;
		mines = 0;
		partida = new Tablero(nivell);
		Tablero = partida.getTablero();
		for(int i=0; i<partida.getMedida(); i++) {
    		for(int j=0; j<partida.getMedida(); j++) {
    			if (Tablero[i][j].getMina()) {
					mines++;
				}
    		}
		}
		assertEquals(5, mines);
		nivell = 2;
		mines = 0;
		partida = new Tablero(nivell);
		Tablero = partida.getTablero();
		for(int i=0; i<partida.getMedida(); i++) {
    		for(int j=0; j<partida.getMedida(); j++) {
    			if (Tablero[i][j].getMina()) {
					mines++;
				}
    		}
		}
		assertEquals(10, mines);
	}
	//Mitjançant un Mock testejem un Tablero (simulant una partida)
	@Test
	void testabrirCasilla() {
		int nivell = 4;
		TableroMock mockObject = Mockito.mock(TableroMock.class);
		int col = 0;
		int row = 0;
		Casilla[][] tablero = mockObject.getTablero();
		Casilla Casilla = tablero[row][col];
		assertTrue(mockObject.destaparCasilla(row, col));
		assertTrue(Casilla.getAbierta());
		col = -1;
		row = -1;
		assertTrue(mockObject.destaparCasilla(row, col));
		col = 3;
		row = 3;
		assertTrue(mockObject.destaparCasilla(row, col));
		col = 2;
		row = 2;
		Casilla = tablero[row][col];
		assertTrue(mockObject.destaparCasilla(row, col));
		assertTrue(Casilla.getAbierta());
	}

}