/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author Irasema
 *
 */
public class ejercicio69 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[10];
		int num = 0;
		int pos = 0;

		for (int i = 0; i < 8; i++) {
			System.out.println("Introduce un numero para la posicion " + i + ": ");
			num = sc.nextInt();
			numeros[i] = num;
		}
		System.out.println("Asi quedaria el array: ");
		for (int i = 0; i <numeros.length; i++) {
			System.out.print("[" + numeros[i] + "]");
		}
		
		for (int i = 0; i < 2; i++) {
			System.out.println("Introduce un numero: ");
			num = sc.nextInt();
			System.out.println("Introduce la posicion: ");
			pos = sc.nextInt();
			// Movemos numeros a la derecha hasta llegar a la posicion que dice el usuario
			// Despues guardo en la posicion el numero

			for (int j = numeros.length - 1; j > pos; i--) {
				numeros[j] = numeros[j - 1];
			}
			numeros[pos] = num;
		}
		System.out.println("Asi quedaria el array: ");
		for (int i = 0; i <numeros.length; i++) {
			System.out.print("[" + numeros[i] + "]");
		}
	}
}
