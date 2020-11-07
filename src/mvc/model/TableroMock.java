package mvc.model;

public class TableroMock extends Tablero{
	private int nivel = 1, bombas = 0, medida = 0;
	protected Casilla[][] tablero;
	public int MAX_Valor_casilla = 8;
	protected int bombas_tablero=0;
    protected int casilla_destapada = 0;
    protected int minas_detectadas = 0;
    
	public TableroMock() {
		super(1);
		setNivel(nivel);
		setMedida(nivel);
		setBombas(nivel);
		this.tablero=inicializarMock();
		//crearMinas();
	}

	public Casilla[][] inicializarMock() {
		this.tablero = new Casilla[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				this.tablero[i][j] = new Casilla();
				this.tablero[i][j].setValor(1);
			}
		}
		this.tablero[1][1].setValor(-1);
		this.tablero[1][1].setMina(true);
		setMedida(3);
		setBombas(1);
		return this.tablero;
	}
	
}
