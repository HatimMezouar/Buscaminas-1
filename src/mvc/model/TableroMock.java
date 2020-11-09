package mvc.model;

public class TableroMock extends Tablero{
	//protected Casilla[][] tablero;
    
	public TableroMock(int nivel) {
		super(1);
		setNivel(nivel);
		setMedida(nivel);
		this.bombas=4;
		this.bombas_tablero=0;
		this.tablero = inicializarMock();
		//this.tablero=inicializarMock();
		int[] i ={0,0,3,2,3,3,2,2};
		MockcrearMinas(i);

	}

	public Casilla[][] inicializarMock() {
		this.tablero = new Casilla[getMedida()][getMedida()];
		for(int i = 0; i < getMedida(); i++) {
			for(int j = 0; j < getMedida(); j++) {
				tablero[i][j] = new Casilla();
				
			}
		}
		//tablero[1][1].setValor(-1);
		//tablero[1][1].setMina(true);
		return tablero;
		
	}
	public void MockcrearMinas(int []valores) {
	    int fila =valores[bombas_tablero];
		int columna=valores[bombas_tablero];
		while(bombas_tablero<getBombas()){
			//Creacio aleatoria fil,col per insertar mina
			
			
			//Si no hi hamina en la pos actual -> Posem mina
			if(this.tablero[fila][columna].getMina()==false){
				
				setBombasPartida(1);
				this.tablero[fila][columna].setValor(-1);
				this.tablero[fila][columna].setMina(true);
				//Modificar vecinas con 0, 1 o 2 segun cuantas haya cerca de minas
				for(int i=0;i<MAX_Valor_casilla;i++){
				switch(i){
					case 0:
						if(fila-1>=0&&columna-1>=0){
							if(this.tablero[fila-1][columna-1].getMina()==false)
							this.tablero[fila-1][columna-1].setValor(1);
						}
						break;
				    case 1:
						if(fila-1>=0&&columna>=0){
							if(this.tablero[fila-1][columna].getMina()==false)
							this.tablero[fila-1][columna].setValor(1);
						}
						break;
					case 2:
						if(fila>=0&&columna-1>=0){
							if(this.tablero[fila][columna-1].getMina()==false)
							this.tablero[fila][columna-1].setValor(1);
						}
						break;				
					case 3:
						if(fila+1>=0&&columna+1>=0&&fila<medida-1&&columna<medida-1){
							if(this.tablero[fila+1][columna+1].getMina()==false)
							this.tablero[fila+1][columna+1].setValor(1);
						}
						break;
					case 4:
						if(fila+1>=0&&columna>=0&&fila<medida-1){
							if(this.tablero[fila+1][columna].getMina()==false)
							this.tablero[fila+1][columna].setValor(1);
						}
						break;
					case 5:
						if(fila>=0&&columna+1>=0&&columna<medida-1){
							if(this.tablero[fila][columna+1].getMina()==false)
							this.tablero[fila][columna+1].setValor(1);
						}
						break;
					case 6:
						if(fila-1>=0&&columna+1>=0&&columna<medida-1){
							if(this.tablero[fila-1][columna+1].getMina()==false)
							this.tablero[fila-1][columna+1].setValor(1);
						}
						break;
					case 7:
						if(fila+1>=0&&columna-1>=0&&fila<medida-1){
							if(this.tablero[fila+1][columna-1].getMina()==false)
							this.tablero[fila+1][columna-1].setValor(1);
							
						}
						break;
					}
				}
				fila =valores[bombas_tablero+1];
				columna=valores[bombas_tablero+2];
			}
		}
	}
	
	public Casilla[][] getTablero() {
		return tablero;
	}
}
