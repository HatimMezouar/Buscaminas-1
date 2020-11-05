package mvc.model;

public class TableroMock extends Tablero{

	public TableroMock() {
		super(4);
		tablero = new Casilla[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				tablero[i][j] = new Casilla();
				tablero[i][j].setValor(1);
			}
		}
		tablero[1][1].setValor(-1);
		tablero[1][1].setMina(true);
		setMedida(3);
		setBombas(1);
	}
	
}
