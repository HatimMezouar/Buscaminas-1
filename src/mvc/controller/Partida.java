package mvc.controller;
import mvc.model.Tablero;

public class Partida {
	
	public Tablero tablero;
	public boolean enJuego;
	private int nivel;
	
	public Partida() {
		enJuego = true;
	}
	
	public int continuarJuego(String input) {
		switch (input.toLowerCase()) {
			case "s": return 0;
			case "n": return 1;
			default: return -1;
		}
	}
	
	public boolean getEnJuego() {
		return enJuego;
	}
	
	public void setEnJuego(boolean enJuego) {
		this.enJuego = enJuego;
	}
	
	public void setNivel(int nivel) {
		if(nivel > 4) {
			this.nivel = 4;
		}else if(nivel<1) {
			this.nivel = 1;
		}else {
			this.nivel = nivel;
		}
		tablero = new Tablero(this.nivel);
	}
	
	public int getNivel() {
		return this.nivel;
	}
	
	public void mostrarTablero() {
		tablero.mostrar();
	}
	
	public void destaparCasilla(int posX, int posY) {
		setEnJuego(tablero.destaparCasilla(posX, posY));
	}
	
	public boolean posCorrecta(int posX, int posY) {
		return tablero.posCorrecta(posX, posY);
	}
	
	public void marcarCasilla(int posX, int posY) {
		tablero.marcarCasilla(posX, posY);
	}
	
	public void desmarcarCasilla(int posX, int posY) {
		tablero.desmarcarCasilla(posX, posY);
	}
	
	public void comprobar() {
		
	}
	public int getPuntuacion() {
		return tablero.getCasillasDestapadas();
	}
}
