package mvc.model;


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
		partida.setNivel(nivel);
		partida.setMedida(nivel);
		assertEquals(partida.getMedida(), 20);
		nivel=4;
		partida.setNivel(nivel);
		partida.setMedida(nivel);
		assertEquals(partida.getMedida(), 20);
		nivel=3;
		partida.setNivel(nivel);
		partida.setMedida(nivel);
		assertEquals(partida.getMedida(), 15);
		nivel=2;
		partida.setNivel(nivel);
		partida.setMedida(nivel);
		assertEquals(partida.getMedida(), 10);
		nivel=1;
		partida.setNivel(nivel);
		partida.setMedida(nivel);
		assertEquals(partida.getMedida(), 5);
		nivel=0;
		partida.setNivel(nivel);
		partida.setMedida(nivel);
		assertEquals(partida.getMedida(), 5);

	}
	//Test per comprovar que l'assignacio de mines segons el nivel es correcte
	@Test
	void testCrearMines() {
		int nivell = 4;
		int mines = 0;
		Tablero partida = new Tablero(nivell);
		Casilla[][] Tablero = partida.getTablero();
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
		
		nivell = 5;
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
		
	}
	//Mitjançant un Mock testejem un Tablero (simulant una partida)
	@Test
	void testdestaparCasilla() {
		int nivell = 1;
		//TableroMock mockObject = Mockito.mock(TableroMock.class);
		TableroMock mockObject = new TableroMock(nivell);

		
		System.out.println(mockObject.tablero[0][0].getValor());
		assertTrue(!mockObject.destaparCasilla(0, 0));
		assertTrue(mockObject.tablero[0][0].getAbierta());
		
	
		assertTrue(mockObject.destaparCasilla(0, 0));
		assertTrue(mockObject.tablero[0][0].getAbierta());

		assertTrue(!mockObject.tablero[2][2].getAbierta());
		assertTrue(mockObject.destaparCasilla(2, 2));
		assertTrue(mockObject.tablero[2][2].getAbierta());
	}
	
	@Test
	void testposCorrecta() {
		//Nivel 1
		Tablero tab = new Tablero(1);
		//valores frontera
		assertTrue(tab.posCorrecta(4, 4));
		assertTrue(tab.posCorrecta(0, 0));
		assertTrue(tab.posCorrecta(0, 4));
		assertTrue(tab.posCorrecta(4, 0));
		
		//valores limite
		assertTrue(!tab.posCorrecta(-1, -1));
		assertTrue(!tab.posCorrecta(5, 5));
		assertTrue(!tab.posCorrecta(-1, 5));
		assertTrue(!tab.posCorrecta(5, -1));
		
		//Nivel 2
		Tablero tab2 = new Tablero(2);
		//valores frontera
		assertTrue(tab2.posCorrecta(9, 9));
		assertTrue(tab2.posCorrecta(0, 0));
		assertTrue(tab2.posCorrecta(0, 9));
		assertTrue(tab2.posCorrecta(9, 0));
		
		//valores limite
		assertTrue(!tab2.posCorrecta(-1, -1));
		assertTrue(!tab2.posCorrecta(10, 10));
		assertTrue(!tab2.posCorrecta(-1, 10));
		assertTrue(!tab2.posCorrecta(10, -1));
		
		//Nivel 3
		Tablero tab3 = new Tablero(3);
		//valores frontera
		assertTrue(tab3.posCorrecta(14, 14));
		assertTrue(tab3.posCorrecta(0, 0));
		assertTrue(tab3.posCorrecta(14, 0));
		assertTrue(tab3.posCorrecta(0, 14));
		
		//valores limite
		assertTrue(!tab3.posCorrecta(-1, -1));
		assertTrue(!tab3.posCorrecta(15, 15));
		assertTrue(!tab3.posCorrecta(-1, 15));
		assertTrue(!tab3.posCorrecta(15, -1));
		
		//Nivel 4
		Tablero tab4 = new Tablero(4);
		//valores frontera
		assertTrue(tab4.posCorrecta(19, 19));
		assertTrue(tab4.posCorrecta(0, 0));
		assertTrue(tab4.posCorrecta(19, 0));
		assertTrue(tab4.posCorrecta(0, 19));
		
		//valores limite
		assertTrue(!tab4.posCorrecta(-1, -1));
		assertTrue(!tab4.posCorrecta(20, 20));
		assertTrue(!tab4.posCorrecta(20, -1));
		assertTrue(!tab4.posCorrecta(-1, 20));
	}
	//Mitjançant un Mock testejem un Tablero (simulant una partida)
	@Test
	void testComprovarVecionsTablero() {
		int nivell = 1;
		//TableroMock mockObject = Mockito.mock(TableroMock.class);
		TableroMock mockObject = new TableroMock(nivell);

		mockObject.destaparCasilla(0,4);
		assertTrue(!mockObject.tablero[0][0].getAbierta());
		assertTrue(mockObject.tablero[0][1].getAbierta());
		assertTrue(mockObject.tablero[0][2].getAbierta());
		assertTrue(mockObject.tablero[0][3].getAbierta());
		assertTrue(mockObject.tablero[0][4].getAbierta());
		assertTrue(!mockObject.tablero[1][0].getAbierta());
		assertTrue(mockObject.tablero[1][1].getAbierta());
		assertTrue(mockObject.tablero[1][2].getAbierta());
		assertTrue(mockObject.tablero[1][3].getAbierta());
		assertTrue(mockObject.tablero[1][4].getAbierta());
		assertTrue(!mockObject.tablero[2][0].getAbierta());
		assertTrue(!mockObject.tablero[2][1].getAbierta());
		assertTrue(!mockObject.tablero[2][2].getAbierta());
		assertTrue(!mockObject.tablero[2][3].getAbierta());
		assertTrue(!mockObject.tablero[2][4].getAbierta());
		assertTrue(!mockObject.tablero[3][0].getAbierta());
		assertTrue(!mockObject.tablero[3][1].getAbierta());
		assertTrue(!mockObject.tablero[3][2].getAbierta());
		assertTrue(!mockObject.tablero[3][3].getAbierta());
		assertTrue(!mockObject.tablero[3][4].getAbierta());
		assertTrue(!mockObject.tablero[4][0].getAbierta());
		assertTrue(!mockObject.tablero[4][1].getAbierta());
		assertTrue(!mockObject.tablero[4][2].getAbierta());
		assertTrue(!mockObject.tablero[4][3].getAbierta());
		assertTrue(!mockObject.tablero[4][4].getAbierta());
		
		mockObject.destaparCasilla(4,3);
		mockObject.destaparCasilla(4,0);
		assertTrue(!mockObject.tablero[0][0].getAbierta());
		assertTrue(mockObject.tablero[0][1].getAbierta());
		assertTrue(mockObject.tablero[0][2].getAbierta());
		assertTrue(mockObject.tablero[0][3].getAbierta());
		assertTrue(mockObject.tablero[0][4].getAbierta());
		assertTrue(mockObject.tablero[1][0].getAbierta());
		assertTrue(mockObject.tablero[1][1].getAbierta());
		assertTrue(mockObject.tablero[1][2].getAbierta());
		assertTrue(mockObject.tablero[1][3].getAbierta());
		assertTrue(mockObject.tablero[1][4].getAbierta());
		assertTrue(mockObject.tablero[2][0].getAbierta());
		assertTrue(mockObject.tablero[2][1].getAbierta());
		assertTrue(!mockObject.tablero[2][2].getAbierta());
		assertTrue(!mockObject.tablero[2][3].getAbierta());
		assertTrue(!mockObject.tablero[2][4].getAbierta());
		assertTrue(mockObject.tablero[3][0].getAbierta());
		assertTrue(mockObject.tablero[3][1].getAbierta());
		assertTrue(!mockObject.tablero[3][2].getAbierta());
		assertTrue(!mockObject.tablero[3][3].getAbierta());
		assertTrue(!mockObject.tablero[3][4].getAbierta());
		assertTrue(mockObject.tablero[4][0].getAbierta());
		assertTrue(mockObject.tablero[4][1].getAbierta());
		assertTrue(!mockObject.tablero[4][2].getAbierta());
		assertTrue(mockObject.tablero[4][3].getAbierta());
		assertTrue(!mockObject.tablero[4][4].getAbierta());
		
		mockObject.destaparCasilla(4,4);
		mockObject.destaparCasilla(2,4);
		assertTrue(!mockObject.tablero[0][0].getAbierta());
		assertTrue(mockObject.tablero[0][1].getAbierta());
		assertTrue(mockObject.tablero[0][2].getAbierta());
		assertTrue(mockObject.tablero[0][3].getAbierta());
		assertTrue(mockObject.tablero[0][4].getAbierta());
		assertTrue(mockObject.tablero[1][0].getAbierta());
		assertTrue(mockObject.tablero[1][1].getAbierta());
		assertTrue(mockObject.tablero[1][2].getAbierta());
		assertTrue(mockObject.tablero[1][3].getAbierta());
		assertTrue(mockObject.tablero[1][4].getAbierta());
		assertTrue(mockObject.tablero[2][0].getAbierta());
		assertTrue(mockObject.tablero[2][1].getAbierta());
		assertTrue(!mockObject.tablero[2][2].getAbierta());
		assertTrue(!mockObject.tablero[2][3].getAbierta());
		assertTrue(mockObject.tablero[2][4].getAbierta());
		assertTrue(mockObject.tablero[3][0].getAbierta());
		assertTrue(mockObject.tablero[3][1].getAbierta());
		assertTrue(!mockObject.tablero[3][2].getAbierta());
		assertTrue(!mockObject.tablero[3][3].getAbierta());
		assertTrue(!mockObject.tablero[3][4].getAbierta());
		assertTrue(mockObject.tablero[4][0].getAbierta());
		assertTrue(mockObject.tablero[4][1].getAbierta());
		assertTrue(!mockObject.tablero[4][2].getAbierta());
		assertTrue(mockObject.tablero[4][3].getAbierta());
		assertTrue(mockObject.tablero[4][4].getAbierta());
		
		mockObject.destaparCasilla(4,2);
		mockObject.destaparCasilla(3,4);
		mockObject.destaparCasilla(2,2);
		assertTrue(!mockObject.tablero[0][0].getAbierta());
		assertTrue(mockObject.tablero[0][1].getAbierta());
		assertTrue(mockObject.tablero[0][2].getAbierta());
		assertTrue(mockObject.tablero[0][3].getAbierta());
		assertTrue(mockObject.tablero[0][4].getAbierta());
		assertTrue(mockObject.tablero[1][0].getAbierta());
		assertTrue(mockObject.tablero[1][1].getAbierta());
		assertTrue(mockObject.tablero[1][2].getAbierta());
		assertTrue(mockObject.tablero[1][3].getAbierta());
		assertTrue(mockObject.tablero[1][4].getAbierta());
		assertTrue(mockObject.tablero[2][0].getAbierta());
		assertTrue(mockObject.tablero[2][1].getAbierta());
		assertTrue(mockObject.tablero[2][2].getAbierta());
		assertTrue(!mockObject.tablero[2][3].getAbierta());
		assertTrue(mockObject.tablero[2][4].getAbierta());
		assertTrue(mockObject.tablero[3][0].getAbierta());
		assertTrue(mockObject.tablero[3][1].getAbierta());
		assertTrue(!mockObject.tablero[3][2].getAbierta());
		assertTrue(!mockObject.tablero[3][3].getAbierta());
		assertTrue(mockObject.tablero[3][4].getAbierta());
		assertTrue(mockObject.tablero[4][0].getAbierta());
		assertTrue(mockObject.tablero[4][1].getAbierta());
		assertTrue(mockObject.tablero[4][2].getAbierta());
		assertTrue(mockObject.tablero[4][3].getAbierta());
		assertTrue(mockObject.tablero[4][4].getAbierta());
		mockObject.mostrar();

	}
}