package mvc.model;

import java.util.Scanner;

public class Tablero {
	protected int nivel = 1, bombas = 0, medida = 0;
	protected Casilla[][] tablero;
	public int MAX_Valor_casilla = 8;
	protected int bombas_tablero=0;
    protected int casilla_destapada = 0;
    protected int minas_detectadas = 0;
    
	public Tablero(int nivel) {
		setNivel(nivel);
		setMedida(nivel);
		setBombas(nivel);
		this.tablero=iniciarTablero();
		//crearMinas();
		System.out.println("Bombas: " + getBombas());
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
	
	public boolean posCorrecta(int posX, int posY) {
		Casilla posXY = new Casilla();
		posXY.posiciones(posX, posY);
		if(posXY.dentroRango(medida)) {
			return true;
		}else {
			return false;
		}
	}
	
	public void marcarCasilla(int posX, int posY) {
		if(tablero[posX][posY].getAbierta()==false){
    		this.casilla_destapada++;
    		if(tablero[posX][posY].getMina()){
    			System.out.println("Mina detectada!");
    			this.minas_detectadas++;
    			tablero[posX][posY].setMarcado(true);
    		}else {
    			System.out.println("No hay mina!");
    		}	
    	}else {
    		System.out.println("Incorrecto!");
    	}
	}
	
	public void desmarcarCasilla(int posX, int posY) {
		if(tablero[posX][posY].getAbierta()==false&&!tablero[posX][posY].getMina()){
			tablero[posX][posY].setAbierta(false);
	    	this.casilla_destapada--;
	    	if(!tablero[posX][posY].getMina()){
	    		System.out.println("Casilla desmarcada!");
	    	}
    	} else {
    		if(tablero[posX][posY].getMina()){
    			System.out.println("No la desmarques, es una MINA!");
	    	}else{
	    		System.out.println( "Incorrecte!");
	    	}
    	}
	}
	
	public boolean destaparCasilla(int posX, int posY) {
		boolean enJuego = true;
    	int i, vecinos = 8;
    	System.out.println(posX + " - " +posY);
    	if(posX>=0 && posX < getMedida() && posY>=0 && posY < getMedida()) {
	    	if(tablero[posX][posY].getAbierta()==false) {
	    		tablero[posX][posY].setAbierta(true);
		    	this.casilla_destapada++;
		    	if(tablero[posX][posY].getMina()) {
		    		System.out.println("MINA!");
		    		enJuego = false;
		    	} else if(tablero[posX][posY].getValor()==0&&!tablero[posX][posY].getMina()){
			    	for(i=0;i<vecinos;i++){
			    		switch(i){
			    			case 0:
			    				if(posX-1>=0&&posY-1>=0){
			    					if(tablero[posX-1][posY-1].getAbierta()==false&&!(tablero[posX-1][posY-1].getMina())){
			    						enJuego = destaparCasilla(posX-1,posY-1);
			    					}
			    				}
			    				break;
			    		    case 1:
			    				if(posX-1>=0&&posY>=0){
			    					if(tablero[posX-1][posY].getAbierta()==false&&!(tablero[posX-1][posY].getMina())){
			    						enJuego = destaparCasilla(posX-1,posY);
			    					}
			    				}
			    				break;
			    			case 2:
			    				if(posX>=0&&posY-1>=0){
			    					if(tablero[posX][posY-1].getAbierta()==false&&!(tablero[posX][posY-1].getMina())){
			    						enJuego = destaparCasilla(posX,posY-1);
			    					}
			    				}
			    				break;				
			    			case 3:
			    				if(posX+1>=0&&posY+1>=0&&posX<medida-1&&posY<medida-1){
			    					if(tablero[posX+1][posY+1].getAbierta()==false&&!(tablero[posX+1][posY+1].getMina())){
			    						enJuego = destaparCasilla(posX+1,posY+1);
			    					}
			    				}
			    				break;
			    			case 4:
			    				if(posX+1>=0&&posY>=0&&posX<medida-1){
			    					if(tablero[posX+1][posY].getAbierta()==false&&!(tablero[posX+1][posY].getMina())){
			    						enJuego = destaparCasilla(posX+1,posY);
			    					}
			    				}
			    				break;
			    			case 5:
			    				if(posX>=0&&posY+1>=0&&posY<medida-1){
			    					if(tablero[posX][posY+1].getAbierta()==false&&!(tablero[posX][posY+1].getMina())){
			    						enJuego = destaparCasilla(posX,posY+1);
			    					}
			    				}
			    				break;
			    			case 6:
			    				if(posX-1>=0&&posY+1>=0&&posY<medida-1){
			    					if(tablero[posX-1][posY+1].getAbierta()==false&&!(tablero[posX-1][posY+1].getMina())){
			    						enJuego = destaparCasilla(posX-1,posY+1);
			    					}
			    				}
			    				break;
			    			case 7:
			    				if(posX+1>=0&&posY-1>=0&&posX<medida-1){
			    					if(tablero[posX+1][posY-1].getAbierta()==false&&!(tablero[posX+1][posY-1].getMina())) {
			    						enJuego = destaparCasilla(posX+1,posY-1);
			    					}
			    				}
			    				break;
		    			}
		    		}
		    	}
	    	} else {
	    		System.out.println("Casilla ya destapada");
	    	}
    	}
    	return enJuego;
	}
	
	public void crearMinas() {
		while(bombas_tablero<getBombas()){
			//Creacio aleatoria fil,col per insertar mina
			int fila = (int) Math.floor(Math.random()*getMedida());
			int columna= (int) Math.floor(Math.random()*getMedida());
			  
			//Si no hi hamina en la pos actual -> Posem mina
			if(this.tablero[fila][columna].getMina()==false){
				bombas_tablero++;
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
			}
		}
	}

	public Casilla[][] iniciarTablero() {
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
	public Casilla[][] getTablero() {
		return tablero;
	}

}
