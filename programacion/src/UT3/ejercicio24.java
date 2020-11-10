/**
 * Pedir números al usuario hasta que introduzca un 0. 
 * Sumar en un acumulador solo aquellos que sean pares.
 */
package UT3;

import java.util.Scanner;

/**
 * @author Irasema
 *
 */
public class ejercicio24 {

	/**Pedir números al usuario hasta que introduzca un 0. 
	 * Sumar en un acumulador solo aquellos que sean pares.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce numeros, pon 0 para terminar");
		int numero =  sc.nextInt();
		int suma = 0;

		while (numero != 0) {

			if (numero % 2 == 0) {	
				suma = suma + numero;
			}
			System.out.println("He recogido el numero: " +numero);
			numero = sc.nextInt();
		
		}
		System.out.println("La suma de los numeros pares es: " + suma);
		
		sc.close();
	}
}
