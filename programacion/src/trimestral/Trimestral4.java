package trimestral;

import java.util.Scanner;

public class Trimestral4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		Scanner sc = new Scanner(System.in);
		char[][] mapa = new char[10][10]; // X, H y puntos.
		char letra = 'P';
		boolean enemigo = false;
		int distancia = 0;

		for (int i = 0; i < mapa.length; i++) {
			for (int j = 0; j < mapa.length; j++) {
				int n = (int) (Math.random() * 2); // generador random entre 0 y 1

				switch (n) {

				case 1:
					mapa[i][j] = 'X';
					break;

				default:
					mapa[i][j] = '.';
					break;
				}
			}
		}
		System.out.println("Dame la posicion en fila del heroe: ");
		int fila = sc.nextInt();
		System.out.println("Dame la posicion en columna del heroe: ");
		int columna = sc.nextInt();
		mapa[fila][columna] = 'H';

		// pintar mapa
		for (int i = 0; i < mapa.length; i++) {
			for (int j = 0; j < mapa.length; j++) {
				System.out.print(mapa[i][j] + " ");
			}
			System.out.print("\n");
		}

		while (letra != 'X') { // condicion de salida
			enemigo = false;
			System.out.println("\nHacia que direccion mira? (R, L, U, D). X para salir.");
			letra = sc.next().charAt(0);

			switch (letra) {

			case 'R':
				for (int j = mapa[fila].length - 1; j > columna; j--) {
					if (mapa[fila][j] == 'X') {
						enemigo = true;
						distancia = j - columna;
					}
				}
				break;
			case 'L':
				for (int j = 0; j < columna; j++) {
					if (mapa[fila][j] == 'X') {
						enemigo = true;
						distancia = columna - j;
					}
				}
				break;
			case 'U':
				for (int i = 0; i < fila; i++) {
					if (mapa[i][columna] == 'X') {
						enemigo = true;
						distancia = fila - i;
					}
				}
				break;
			case 'D':
				for (int i = mapa.length - 1; i > fila; i--) {
					if (mapa[i][columna] == 'X') {
						enemigo = true;
						distancia = i - fila;
					}
				}
				break;
			case 'X':
				break;
			default:
				System.out.println("Letra erronea. Escribe otra: ");
				break;

			}
			if (enemigo) {
				System.out.println("El enemigo esta a una distancia de: " + distancia + ".\n");
			} else {
				if (letra != 'X')
				System.out.println("No hay enemigo en esa direccion.");
			}

		}
		System.out.println("Finalizando ejecucion.");
		sc.close();
	}

}
