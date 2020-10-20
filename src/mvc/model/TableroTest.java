package mvc.model;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

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

	}
	//Mitjançant un Mock testejem un Tablero (simulant una partida)
	@Test
	void testabrirCasilla() {

	}

}