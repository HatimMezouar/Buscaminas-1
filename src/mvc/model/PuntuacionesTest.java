package mvc.model;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PuntuacionesTest {
	
	//Clase per testejar les puntuacions mitjançant el Mock 
	//ja que hem de veure si es capaç  de llegir un archiu encara que no existexi i fer el que pertoca
    @Test
    void testEscriurePuntuacions() {
    	
        String ruta = "puntuacionesMock.txt";
        String nombre = "nombre";
        int puntuacio = 100;
        int nivel = 1;
        PuntuacionesMock mockObject = Mockito.mock(PuntuacionesMock.class);
        mockObject.setPuntuacionesMock(nombre, puntuacio, nivel);
        mockObject.escrivir_Puntuaciones(puntuacio, nivel, nombre);
        try {
	        File file = new File(ruta);
	        // L'arxiu ha d'existir
	        assertTrue(file.exists());
	        
	        BufferedReader br = new BufferedReader(new FileReader(file));
	        // Agafem l'ultima linia afegida
	        String line = br.readLine();
	        String bLine;
	        while ((bLine = br.readLine()) != null) {
	            line = bLine;
	        }
	        br.close();
	        // La separem en cada espai
	        String[] separacions = line.split(" ");
	        
	        // Comprovem que s'ha escrit el que toca
	        assertEquals(nombre, separacions[0]);
	        assertEquals(String.valueOf(puntuacio), separacions[1]);
	        assertEquals(String.valueOf(nivel), separacions[2]);
        } catch (Exception e) {
        	e.printStackTrace();
        }
        mockObject.esborrarMock();
    }
    //Test llegir_puntuacions
    //Per comprovar que les puntuacions son llegides correctament
    @Test
    void testLlegirPuntuacions() {
        String nombre = "nombre";
        int puntuacio = 100;
        int nivel = 1;
        PuntuacionesMock mockObject = Mockito.mock(PuntuacionesMock.class);
        mockObject.setPuntuacionesMock(nombre, puntuacio, nivel);
        mockObject.escrivir_Puntuaciones(puntuacio, nivel, nombre);
        try {
        	mockObject.leer_Puntuaciones();
			assertEquals(0, mockObject.getPuntuacionesTamaño());
			System.out.println(mockObject.getPuntuacionesTamaño());
		} catch (IOException e) {
			assertThrows(FileNotFoundException.class, () -> {e.printStackTrace();});
		}
        mockObject.escrivir_Puntuaciones(puntuacio, nivel, nombre);
        mockObject.escrivir_Puntuaciones(puntuacio, nivel, nombre);
        try {
        	mockObject.leer_Puntuaciones();
			assertEquals(2, mockObject.getPuntuacionesTamaño());
		} catch (IOException e) {
			e.printStackTrace();
		}
        mockObject.esborrarMock();
    }
    //Test mostrar_puntuacions
    //Per comprovar que les puntuacions es mostren correctament (nivel i puntuacio)
    @Test
    void testMostrarPuntuacions() {
    	String nombre = "nombre1";
        int puntuacion = 100;
        int nivel = 1;
        PuntuacionesMock mockObject = Mockito.mock(PuntuacionesMock.class);
        mockObject.setPuntuacionesMock(nombre, puntuacion, nivel);
        mockObject.escrivir_Puntuaciones(puntuacion, nivel, nombre);
        nombre = "nombre2";
        puntuacion = 200;
        nivel = 2;
        mockObject.escrivir_Puntuaciones(puntuacion, nivel, nombre);
        try {
        	mockObject.mostrar_Puntuaciones(1);
        	mockObject.mostrar_Puntuaciones(2);
			assertEquals(nombre, mockObject.getPuntuaciones().get(0).getNombre());
			assertEquals(puntuacion, mockObject.getPuntuaciones().get(0).getPuntuacion());
			assertEquals(nivel, mockObject.getPuntuaciones().get(0).getnivel());
		} catch (IOException e) {
			e.printStackTrace();
		}
        mockObject.esborrarMock();
    }
}