package mvc.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Puntuaciones implements Comparable<Puntuaciones>{
	ArrayList<Puntuaciones> Puntuaciones = new ArrayList<>();
	String name;
	String ruta;
	int puntuacion;
	int nivel;

	public Puntuaciones(String name, int puntuacion, int nivel) {
		this.name = name;
		this.puntuacion = puntuacion;
		this.nivel=nivel;
		ruta = "Puntuaciones.txt";
	}

	public String getNombre() {
		return name;
	}
	
	public int getPuntuacion() {
		return puntuacion;
	}
	public int getPuntuacionesTamano() {
		int tamano=Puntuaciones.size();
		return tamano;
	}
	public ArrayList<Puntuaciones> getPuntuaciones() {
		return Puntuaciones;
	}
	public int getnivel() {
		return nivel;
	}
	
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	public void setNombre(String name) {
		this.name = name;
	}
	
	public void escribirPuntuaciones(int puntuacion,int nivel, String Nom) {
        try {
        	
            String contenido = Nom+" "+puntuacion+" "+nivel;
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido+"\n");
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	void leer_Puntuaciones() throws IOException
	{
		String cadena;
		String[] c;
		FileReader f = new FileReader(ruta);
		Puntuaciones.clear();
	    BufferedReader b = new BufferedReader(f);
	    while((cadena = b.readLine())!=null) {
	    	c=cadena.split(" ");
	    	Puntuaciones.add(new Puntuaciones(c[0],Integer.parseInt(c[1]),Integer.parseInt(c[2])));

	    }
	    b.close();
		
	}
	//Mostrar les Puntuaciones ordenades por puntos
	public void mostrar_Puntuaciones(int nivel) throws IOException {
		leer_Puntuaciones();
		Collections.sort(Puntuaciones);
		int i=1;
		for (Puntuaciones aux:Puntuaciones)
		{
			if(nivel==aux.getnivel()) {
				System.out.println(i+" "+aux.getNombre()+" "+aux.getPuntuacion()+" "+aux.getnivel()+" ");
				i++;
			}
		  
			
			if(i>10) {
				break;
			}
		}
	}
	//Funcion per fer ordenament de Puntuaciones
	@Override
	public int compareTo(Puntuaciones o) {
        if (puntuacion > o.getPuntuacion()) {
            return -1;
        }
        if (puntuacion < o.getPuntuacion()) {
            return 1;
        }
        return 0;
    }
}
