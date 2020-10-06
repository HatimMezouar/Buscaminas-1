
public class Casilla {
	
	private boolean abierta, mina, marcado;
	private int posicionX, posicionY, valor;
	
	public Casilla(int x, int y) {
		valor = 0;
		mina = false;
		abierta = false;
		marcado = false;
		setPosX(x);
		setPosY(y);
	}
	
	
	public boolean dentroRango(int rango)
	{
		return (posicionX > 0 && posicionX <= rango) && (posicionY > 0 && posicionY <= rango);
	}
	
	public boolean equals (Object o) 
	{
		if (o instanceof Casilla) {
			Casilla pos = (Casilla) o;
	        if(posicionX == pos.posicionX && posicionY == pos.posicionY) {
	        	return true;
	        }
	        else 
	        	return false;        
	    } 
		else
			return false;
	}
	
	public void setPosX(int x) {
		this.posicionX = x;
	}
	
	public void setPosY(int y) {
		this.posicionY = y;
	}
	
	public void setAbierta(boolean abierta) {
		this.abierta = abierta;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public void setMina(boolean mina) {
		this.mina = mina;
	}
	
	public void setMarcado(boolean marcado) {
		this.marcado = marcado;
	}
	
	public boolean getMarcado() {
		return marcado;
	}
	
	public boolean getMina() {
		return mina;
	}
	
	public int getValor() {
		return valor;
	}
		
	public int getX()
	{
		return posicionX;
	}

	public int getY()
	{
		return posicionY;
	}
}
