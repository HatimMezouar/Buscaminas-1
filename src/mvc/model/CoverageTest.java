package mvc.model;


import org.junit.jupiter.api.Test;

import mvc.controller.Partida;

public class CoverageTest {
	//Per realitzar diferents test de coverage amb el valor de la casilla
	//(s'ha de jugar amb els valors)
	@Test
	void testCcasillaCoverage() {
		Casilla casilla=new Casilla();
		casilla.posiciones(0,0);
		casilla.setValor(2);
		casilla.setValor(-1);
		casilla.setValor(1);
		casilla.setValor(8);
		casilla.setValor(1);
		
	}
	//Per realitzar diferents test de coverage amb l'atribut esmina de la casilla
	//(s'ha de jugar amb els valors)
	@Test
	void testCEsminaCoverage() {
		Casilla casilla=new Casilla();
		casilla.posiciones(0,0);
		casilla.setValor(1);
		casilla.setMina(false);
		casilla.setMina(true);
		casilla.setValor(-1);
		casilla.setMina(false);
		casilla.setMina(true);
	}
	//Per realitzar diferents test de coverage amb la clase comprobar()
	//(s'ha de desmarcar/marcar la rama que volem observar)
	@Test
	void testPcomprobarCoverage() {
		int nivell = 1;
		Partida partida = new Partida();
		partida.setNivel(nivell);
		//partida.setEnJuego()=true;
		
		//primer if false
		partida.setEnJuego(false);
		//partida.comprobar();
		//primer if true resta false
		partida.setEnJuego(true);
		//partida.comprobar();
		//segon if true ultim false
		partida.tablero.setBombas(0);
		partida.tablero.setMedida(0);
		partida.setEnJuego(true);
		//partida.comprobar();
		//segon if true ultim true
		partida.tablero.setBombas(1);
		partida.tablero.setMedida(0);
		//partida.comprobar();
		//segon if not or
		partida.setEnJuego(true);
		partida.tablero.setBombas(2);
		partida.tablero.setMedida(2);
		partida.tablero.minas_detectadas=2;
		partida.tablero.casilla_destapada=2;
		//partida.comprobar();	
		//segon if or true
		partida.setEnJuego(true);
		partida.tablero.setBombas(20);
		partida.tablero.setMedida(0);
		partida.tablero.minas_detectadas=20;
		partida.tablero.casilla_destapada=1;
		//partida.comprobar();	
	}
//Test per veure com funcionen bucles interns, loop testing 
//S'ha separat cada "loop" per poder veure el seu comportament
  //Primer loop testing aniuat de la clase crearMinas
	//¡¡Per realitzar el test s'ha de comentar la funcio crearMinas del constructor del taulell!!
	@Test
	void testLoopInteriorv0() {
		int nivell = 1;
		Partida partida = new Partida();
		partida.setNivel(nivell);
		partida.tablero.setBombas(1);
		partida.tablero.setBombasPartida(0);
		partida.tablero.MAX_Valor_casilla=0;
		partida.tablero.iniciarTablero();
		partida.tablero.crearMinas();
	}
	@Test
	void testLoopInteriorv1() {
		int nivell = 1;
		Partida partida = new Partida();
		partida.setNivel(nivell);
		partida.tablero.setBombas(1);
		partida.tablero.setBombasPartida(0);
		partida.tablero.MAX_Valor_casilla=1;
		partida.tablero.iniciarTablero();
		partida.tablero.crearMinas();
	}
	@Test
	void testLoopInteriorv2() {
		int nivell = 1;
		Partida partida = new Partida();
		partida.setNivel(nivell);
		partida.tablero.setBombas(1);
		partida.tablero.setBombasPartida(0);
		partida.tablero.MAX_Valor_casilla=2;
		partida.tablero.iniciarTablero();
		partida.tablero.crearMinas();
	}
	@Test
	void testLoopSimpleInteriorv8() {
		int nivell = 1;
		Partida partida = new Partida();
		partida.setNivel(nivell);
		partida.tablero.setBombas(1);
		partida.tablero.setBombasPartida(0);
		partida.tablero.MAX_Valor_casilla=8;
		partida.tablero.iniciarTablero();
		partida.tablero.crearMinas();
	}
	@Test
	void testLoopInteriorv7() {
		int nivell = 1;
		Partida partida = new Partida();
		partida.setNivel(nivell);
		partida.tablero.setBombas(1);
		partida.tablero.setBombasPartida(0);
		partida.tablero.MAX_Valor_casilla=7;//partint que valor max=8 n=max-1
		partida.tablero.iniciarTablero();
		partida.tablero.crearMinas();
	}
	@Test
	void testLoopInteriorvn() {
		int nivell = 1;
		Partida partida = new Partida();
		partida.setNivel(nivell);
		partida.tablero.setBombas(1);
		partida.tablero.setBombasPartida(0);
		partida.tablero.MAX_Valor_casilla=5;//partint que valor max=8 n<max-1
		partida.tablero.iniciarTablero();
		partida.tablero.crearMinas();
	}
	@Test
	void testLoopExteriorv0() {
		int nivell = 1;
		Partida partida = new Partida();
		partida.setNivel(nivell);
		partida.tablero.setBombas(0);
		partida.tablero.setBombasPartida(0);
		partida.tablero.MAX_Valor_casilla=8;
		partida.tablero.iniciarTablero();
		partida.tablero.crearMinas();
	}
	@Test
	void testLoopExteriorv1() {
		int nivell = 1;
		Partida partida = new Partida();
		partida.setNivel(nivell);
		partida.tablero.setBombas(1);
		partida.tablero.setBombasPartida(0);
		partida.tablero.MAX_Valor_casilla=8;
		partida.tablero.iniciarTablero();
		partida.tablero.crearMinas();
	}

	@Test
	void testLoopExteriorv2() {
		int nivell = 1;
		Partida partida = new Partida();
		partida.setNivel(nivell);
		partida.tablero.setBombas(2);
		partida.tablero.setBombasPartida(0);
		partida.tablero.MAX_Valor_casilla=8;
		partida.tablero.iniciarTablero();
		partida.tablero.crearMinas();
	}
	@Test
	void testLoopExteriorv5() {
		int nivell = 1;
		Partida partida = new Partida();
		partida.setNivel(nivell);
		partida.tablero.setBombas(5);
		partida.tablero.setBombasPartida(0);
		partida.tablero.MAX_Valor_casilla=8;
		partida.tablero.iniciarTablero();
		partida.tablero.crearMinas();
	}
	@Test
	void testLoopExteriorv4() {
		int nivell = 1;
		Partida partida = new Partida();
		partida.setNivel(nivell);
		partida.tablero.setBombas(4);//partint que valor max=4 n=max-1
		partida.tablero.setBombasPartida(0);
		partida.tablero.MAX_Valor_casilla=8;
		partida.tablero.iniciarTablero();
		partida.tablero.crearMinas();
	}
	@Test
	void testLoopExteriorvn() {
		int nivell = 1;
		Partida partida = new Partida();
		partida.setNivel(nivell);
		partida.tablero.setBombas(3);//partint que valor max=4 n<max-1
		partida.tablero.setBombasPartida(0);
		partida.tablero.MAX_Valor_casilla=8;
		partida.tablero.iniciarTablero();
		partida.tablero.crearMinas();
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
  //Fi loop testing mostrarTaulell
}