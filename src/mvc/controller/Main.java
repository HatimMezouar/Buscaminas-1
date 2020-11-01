package mvc.controller;
import java.util.Scanner;

import mvc.view.Partida;

public class Main {

	public static void main(String[] args) {
		int opcion = 0;
		
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
				System.out.println("¡Vuelve pronto!");
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
					partida.marcarCasilla();
					partida.mostrarTablero();
					break;
				case 2: 
					partida.desmarcarCasilla();
					partida.mostrarTablero();
					break;
				case 3: 
					partida.destaparCasilla();
					partida.mostrarTablero();
					break;
				case 4: 
					partida.setEnJuego(false);
					break;
				}
			
				
			}
			
		}
		
	}
	
}
