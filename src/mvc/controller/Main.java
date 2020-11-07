package mvc.controller;
import java.io.IOException;
import java.util.Scanner;

import mvc.model.Puntuaciones;
import mvc.view.Partida;

public class Main {

	public static void main(String[] args) throws IOException {
		int opcion = 0, posX = 0, posY = 0;
		boolean posValida = false;
		
		Partida partida = new Partida();
		Scanner sc = new Scanner(System.in);
		
		while (opcion < 1 || opcion > 5){
			System.out.println("Selecciona un nivel:");
			System.out.println("Pulsa 1: Nivel Facil");
			System.out.println("Pulsa 2: Nivel Medio");
			System.out.println("Pulsa 3: Nivel Dificil");
			System.out.println("Pulsa 4: Nivel Muy Dificil");
			System.out.println("Pulsa 5: Salir");
			opcion = sc.nextInt();
		}

		switch(opcion) {
			case 1:
			case 2:
			case 3:
			case 4:
				partida.setNivel(opcion);
				partida.mostrarTablero();
				break;
			case 5:
				System.out.println("�Vuelve pronto!");
				sc.close();	
				break;
			default:
				break;
		}
		
		while (partida.getEnJuego()) {
			opcion = 0;
			while (opcion < 1 || opcion > 4){
				System.out.println("Que quieres hacer? :");
				System.out.println("Pulsa 1: Marcar casilla");
				System.out.println("Pulsa 2: Desmarcar casilla");
				System.out.println("Pulsa 3: Destapar casilla");
				System.out.println("Pulsa 4: Salir");
				opcion = sc.nextInt();
			}
			if(opcion>0 || opcion <5) {
				switch(opcion) {
					case 1: 
						while(!posValida) {
							System.out.println("Elige una fila:");
							posX = sc.nextInt();
							System.out.println("Elige una columna:");
							posY = sc.nextInt();
							posValida = partida.posCorrecta(posX-1, posY-1);
							if(!posValida) {
								System.out.println("Numeros incorrectos\n");
							}
						}
						partida.marcarCasilla(posX-1, posY-1);
						break;
					case 2:
						while(!posValida) {
							System.out.println("Elige una fila:\n");
							posX = sc.nextInt();
							System.out.println("Elige una columna:\n");
							posY = sc.nextInt();
							posValida = partida.posCorrecta(posX-1, posY-1);
							if(!posValida) {
								System.out.println("Numeros incorrectos");
							}
						}
						partida.desmarcarCasilla(posX-1, posY-1);
						break;
					case 3:
						while(!posValida) {
							System.out.println("Elige una fila:");
							posX = sc.nextInt();
							System.out.println("Elige una columna:");
							posY = sc.nextInt();
							posValida = partida.posCorrecta(posX-1, posY-1);
							if(!posValida) {
								System.out.println("Numeros incorrectos");
							}
						}
						partida.destaparCasilla(posX-1, posY-1);
						if(!partida.getEnJuego()) {
							System.out.println("------------");
							System.out.println("Has perdido!");
							System.out.println("------------");
						}
						break;
					case 4: 
						partida.setEnJuego(false);
						break;
				}
				
				partida.mostrarTablero();
				posValida = false;
			}
			
		}
		System.out.println("Nom del jugador?\n");
		int punts=partida.getPuntuacion();
		String nom = null; 
		nom = sc.next();
		Puntuaciones puntuacion = new Puntuaciones(nom, punts, partida.getNivel());
		//escrivim puntuacions i mostrem per nivell
		puntuacion.escrivir_Puntuaciones(punts,partida.getNivel(),nom);
		puntuacion.mostrar_Puntuaciones(partida.getNivel());
		sc.close();
	}
	
}
