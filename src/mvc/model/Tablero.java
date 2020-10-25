package mvc.model;

public class Tablero {
	private int nivel = 1, bombas = 0, medida = 0;
	protected Casilla[][] tablero;
	public int MAX_Valor_casilla;
	protected int bombas_tablero=0;
    protected int casilla_destapada = 0;
    protected int minas_detectadas = 0;
    
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
	public void setBombasPartida(int bombas_tablero) {
		this.bombas_tablero = bombas_tablero;
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
	public int getBombasPartida() {
		return bombas_tablero;
	}
    public int getCasillasDestapadas() {
        return casilla_destapada;
    }
    
    public int getMinasDetectadas() {
    	return minas_detectadas;
    }

}
