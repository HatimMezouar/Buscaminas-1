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
		setMedida(nivel);
		setBombas(nivel);
		this.tablero=IniciarTablero();
	}
	
	public void mostrar() {
		for(int i=0;i<getMedida();i++){
    		for(int j=0;j<getMedida();j++){
    			if(tablero[i][j].getAbierta() && !tablero[i][j].getMina()){
    				System.out.print(" "+tablero[i][j].getValor()+" ");
    			} else {
	    			if(!tablero[i][j].getAbierta()){
	    				if(tablero[i][j].getMarcado()) {
    						System.out.print(" B ");
    					} else {
    						System.out.print("[ ]");
    					}
	    			}else{
	    				System.out.print(" "+tablero[i][j].getValor()+" ");
	    			}
    			}
    		}
    		System.out.println("\n");
    	}
	}
	
	public void inicializar() {
		
	}
	
	public void crearMinas() {
		
	}

	public Casilla[][] IniciarTablero() {
		this.tablero = new Casilla[medida][medida];
		for(int i=0; i<this.tablero.length; i++) {
    		for(int j=0; j<this.tablero.length; j++) {
    			this.tablero[i][j] = new Casilla();
    		}
    	}
		return this.tablero;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	public void setBombas(int bombas) {
		this.bombas = bombas*5;
	}
	
	public void setMedida(int medida) {
		this.medida = medida*5;
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
