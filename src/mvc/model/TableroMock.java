package mvc.model;

public class TableroMock extends Tablero{
	//protected Casilla[][] tablero;
    
	public TableroMock(int nivel) {
		super(1);
		setNivel(nivel);
		setMedida(nivel);
		setBombas(1);
		tablero = inicializarMock();
		//this.tablero=inicializarMock();
		//crearMinas();
	}

	public Casilla[][] inicializarMock() {
		this.tablero = new Casilla[getMedida()][getMedida()];
		for(int i = 0; i < getMedida(); i++) {
			for(int j = 0; j < getMedida(); j++) {
				tablero[i][j] = new Casilla();
				tablero[i][j].setValor(1);
			}
		}
		tablero[1][1].setValor(-1);
		tablero[1][1].setMina(true);
		return tablero;
	}
	
	public Casilla[][] getTablero() {
		return tablero;
	}
}
