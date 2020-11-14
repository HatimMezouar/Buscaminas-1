package mvc.controller;

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
		System.out.print("[Nivel 0 ]\n");
		partida.setNivel(nivel);
		assertEquals(1, partida.getNivel());
		assertNotEquals(0, partida.getNivel());
		partida.mostrar();
		System.out.print("[Nivel 1 ]\n");
		nivel = 1;
		partida.setNivel(nivel);
		assertEquals(1, partida.getNivel());
		assertNotEquals(0, partida.getNivel());
		partida.mostrar();
		System.out.print("[Nivel 2 ]\n");
		nivel = 2;
		partida.setNivel(nivel);
		assertEquals(2, partida.getNivel());
		assertNotEquals(1, partida.getNivel());
		partida.mostrar();
		System.out.print("[Nivel 3 ]\n");
		nivel = 3;
		partida.setNivel(nivel);
		assertEquals(3, partida.getNivel());
		assertNotEquals(2, partida.getNivel());
		partida.mostrar();
		System.out.print("[Nivel 4 ]\n");
		nivel = 4;
		partida.setNivel(nivel);
		assertEquals(4, partida.getNivel());
		assertNotEquals(3, partida.getNivel());
		partida.mostrar();
		System.out.print("[Nivel 5 ]\n");
		nivel = 5;
		partida.setNivel(nivel);
		assertEquals(4, partida.getNivel());
		assertNotEquals(5, partida.getNivel());
		partida.mostrar();
	}
	//Per realitzar diferents test de coverage amb la clase partidaGanada()
	//(s'ha de desmarcar/marcar la rama que volem observar)
	@Test
	void testPComprovarPartidaCoverage() {
		int nivell = 1;
		Partida partida = new Partida();
		partida.setNivel(nivell);
		//partida.enJuego=true;
		
		//primer if false
		partida.setEnJuego(false);;
		partida.partidaGanada();
		//primer if true resta false
		partida.enJuego=true;
		partida.partidaGanada();
		//segon if true ultim false
		partida.tablero.bombas=0;
		partida.tablero.medida=0;
		partida.enJuego=true;
		partida.partidaGanada();
		//segon if true ultim true
		partida.tablero.bombas=1;
		partida.tablero.medida=0;
		partida.partidaGanada();
		//segon if not or
		partida.enJuego=true;
		partida.tablero.bombas=2;
		partida.tablero.medida=2;
		partida.tablero.minas_detectadas=2;
		partida.tablero.casilla_destapada=2;
		partida.partidaGanada();	
		//segon if or true
		partida.enJuego=true;
		partida.tablero.bombas=20;
		partida.tablero.medida=0;
		partida.tablero.minas_detectadas=20;
		partida.tablero.casilla_destapada=1;
		partida.partidaGanada();	
	}
	 //Loop testing para ver tablero
		@Test
		void testLoopMostrarTaulellv0() {
			Partida tablero = new Partida();
			tablero.setNivel(0);
			tablero.marcarCasilla(1, 1);
			tablero.destaparCasilla(0, 0);
			tablero.mostrar();
		}
		@Test
		void testLoopInteriorMostrarTaulellv1() {
			Partida tablero = new Partida();
			tablero.setNivel(1);
			tablero.mostrar();
		}
		@Test
		void testLoopMostrarTaulellv2() {
			Partida tablero = new Partida();
			tablero.setNivel(2);
			tablero.mostrar();
		}
		@Test
		void testLoopMostrarTaulellv3() {
			Partida tablero = new Partida();
			tablero.setNivel(3);
			tablero.mostrar();
		}
		@Test
		void testLoopMostrarTaulellv4() {
			Partida tablero = new Partida();
			tablero.setNivel(4);

			tablero.mostrar();
		}
		@Test
		void testLoopMostrarTaulellv5() {
			Partida tablero = new Partida();
			tablero.setNivel(5);
			tablero.destaparCasilla(0, 1);
			tablero.marcarCasilla(0, 0);
			tablero.desmarcarCasilla(0, 0);
			tablero.destaparCasilla(0, 4);
			tablero.mostrar();
		}
		@Test
		void testLoopMostrarTaulelldesmarcat() {
			Partida tablero = new Partida();
			tablero.setNivel(5);
			tablero.destaparCasilla(0, 1);
			tablero.marcarCasilla(0, 0);
			tablero.destaparCasilla(1, 1);
			tablero.destaparCasilla(0, 1);
			tablero.marcarCasilla(3, 3);
			tablero.destaparCasilla(5, 4);
			tablero.mostrar();
		}
}
