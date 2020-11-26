/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author Irasema
 *
 */
public class ejercicio73 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[10];
		int numero;
		boolean repetido = false;
		
		System.out.println("Dame diez numeros: ");

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Dame el numero de la posicion " +i+ ":");
			numero = sc.nextInt();
			repetido = false;
			
			for (int j = 0; j < i; j++) {

				if (numero == numeros[j]) {
					repetido = true;
				}
			}
			if (repetido) {
				i--;
				System.out.println("El numero introducido ya estaba");

			} else {
				numeros[i]=numero;
			}
		}
	}
}
