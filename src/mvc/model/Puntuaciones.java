package mvc.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Puntuaciones{
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
	public int getPuntuacionesTamaño() {
		int tamaño=Puntuaciones.size();
		return tamaño;
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
	
	void escrivir_Puntuaciones(int puntuacion,int nivel, String Nom) {

	}
	
	void leer_Puntuaciones() throws IOException
	{

		
	}
	//Mostra les Puntuaciones ordenades per punts i nivel amb un maxim de 10 elements
	void mostrar_Puntuaciones(int nivel) throws IOException {

	}

}
