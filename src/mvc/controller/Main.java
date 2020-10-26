package mvc.controller;
import java.util.Scanner;

import mvc.view.Partida;

public class Main {

	public static void main(String[] args) {
		int opcion = 0;
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
				Partida partida = new Partida();
				partida.setNivel(opcion);
				partida.mostrarTablero();
				break;
			case 5:
				break;
			default:
				break;
		}
		
	}

}
