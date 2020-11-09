package mvc.model;

public class Casilla {
	
	private boolean abierta, mina, marcado;
	private int posicionX, posicionY;
	protected int valor;
	
	public Casilla() {
		valor = 0;
		mina = false;
		abierta = false;
		marcado = false;
	}
	
	public void posiciones(int x, int y) {
		setPosX(x);
		setPosY(y);
	}
	
	public boolean dentroRango(int rango)
	{
		return (posicionX >= 0 && posicionX < rango) && (posicionY >= 0 && posicionY < rango);
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
	
	public void setValor(int nuevo_valor) {
		if(!(this.valor==-1))
		{
	    	if(nuevo_valor == -1 || nuevo_valor == 1) {
		        if(nuevo_valor>-1) {
		        	if(valor < 8) valor=valor+nuevo_valor;
		        	else valor=8;
		        }
		        else {
		        	valor=-1;
		        }
	    	}
		}
	}
	
	public void setMina(boolean nueva_mina) {
        if(mina==true) {
        	nueva_mina = true;
    	}
    	if(valor==-1) {
    		nueva_mina=true;
    		this.valor=-1;
    	}
    	else {
    		nueva_mina=false;
    	}
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
	
	public boolean getAbierta() {
		return abierta;
	}
	
	public String toString()
	{
		return "(" + posicionX + "," + posicionY + ")";
	}
}
