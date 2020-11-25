/** 
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author Irasema
 *
 */
public class semana5escalera {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int carta[] = new int[4]; // las 4 cartas del usuario
		char palos[] = new char[4]; // los 4 palos
		int max = 0;
		int min = 0;
		boolean igual = true;
		int faltante = 0;
		boolean finalizar = false;

		while (!finalizar) {
			
		// Lectura de cartas
		for (int i = 0; i < carta.length; i++) {
			System.out.println("Introduce el numero de tu carta " + (i + 1));
			carta[i] = sc.nextInt();
			System.out.println("Introduce el palo de tu carta (T, P, C, D) " + (i + 1));
			palos[i] = sc.next().charAt(0); // para recoger Char
		}
		// Comprobacion colores
		for (int i = 0; i < palos.length - 1; i++) {
			if (palos[i] != palos[i + 1]) {
				igual = false;
			}
		}
		if (igual) {
			min = carta[0];
			max = carta[0];

			for (int i = 1; i < carta.length; i++) {
				if (carta[i] > max) {
					max = carta[i];
				}
				if (carta[i] < min) {
					min = carta[i];
				}
			}
			if (max - min == 3 || max - min == 4) {
				if (max - min ==3) {
					if (max == 14) {
						System.out.println("La carta que te falta es: " + (min-1) + palos[0]); //se le da un valor cualquiera a palo porque ya se da por hecho que coinciden
					}else {
						System.out.println("La carta que te falta es: " + (max+1) + palos[0]);					
					}
				}
				else {
					boolean encontrado = false; 
					
					for (int i = min; i < max; i++) {
						encontrado = false;
						for (int j = 0; j < 4; j++) {
							if (i == carta[j]) {  //buscar la carta que falta
								encontrado = true;
							}				
						}
						if (!encontrado) {
							faltante = i;
						}
					}
					System.out.println("La carta que te falta es: " + faltante + palos[0]);
				}
			}
		} else {
			System.out.println("Son diferentes palos.");
		}	
		System.out.println("Desea seguir jugando? y/n");
		char option = sc.next().charAt(0);
		
		if (option == 'n') 
			finalizar = true;
		}
		sc.close();
	}
}
