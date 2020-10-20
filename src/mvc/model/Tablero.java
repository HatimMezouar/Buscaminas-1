package mvc.model;

public class Tablero {
	private int nivel = 1, bombas = 0, medida = 0;
	protected Casilla[][] tablero;
	
	public Tablero(int nivel) {
		setNivel(nivel);
	}
	
	public void mostrar() {
		
	}
	
	public void crearMinas() {
		
	}
	
	public void inicializar() {
		
	}
	public Casilla[][] getTablero() {
		return tablero;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	public void setBombas(int bombas) {
		this.bombas = bombas;
	}
	
	public void setMedida(int medida) {
		this.medida = medida;
	}
	
	public int getNivel() {
		return nivel;
	}
	
	public int getBombas() {
		return bombas;
	}
	
	public int getMedida() {
		return medida;
	}
}
