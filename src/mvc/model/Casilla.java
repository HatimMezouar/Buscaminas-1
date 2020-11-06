package mvc.model;

public class Casilla {
	
	private boolean abierta, mina, marcado;
	private int posicionX, posicionY, valor;
	
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
	
	public boolean getAbierta() {
		return abierta;
	}
	
	public String toString()
	{
		return "(" + posicionX + "," + posicionY + ")";
	}
}
