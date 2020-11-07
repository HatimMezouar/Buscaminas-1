package mvc.model;

import java.io.File;

public class PuntuacionesMock extends Puntuaciones {

	public PuntuacionesMock(String name, int puntuacion, int nivel) {
		super(name, puntuacion, nivel);
		// TODO Auto-generated constructor stub
	}

	public void setPuntuacionesMock(String nombre, int puntuacion, int nivell) {
		setNombre(nombre);
		setPuntuacion(puntuacion);
		setNivel(nivel);
		ruta = "puntuacionsMock.txt";
		
	}
	
	public void esborrarMock() {
		File file = new File(ruta);
		
		file.delete();
	}

}
