package mvc.view;
import mvc.model.Tablero;

public class Partida {
	
	public Tablero tablero;
	protected boolean enJuego;
	private int nivel;
	
	public Partida() {
		tablero = new Tablero(0);
		enJuego = true;
	}
	
	public int continuarJuego(String input) {
		switch (input) {
			case "S":
			case "s": return 0;
			case "N":
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
		
	}
	
	public void destaparCasilla() {
		
	}
	
	public void comprobar() {
		
	}
}
