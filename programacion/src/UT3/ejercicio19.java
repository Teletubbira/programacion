/**
 * 19. Pedir números al usuario hasta que introduzca un 0.
 *  Al finalizar el programa se mostrará la suma de todos los números. 
 */
package UT3;

import java.util.Scanner;

/**
 * @author Irasema
 *
 */
public class ejercicio19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce numeros hasta llegar a 0: ");
		int numero = 1;
		int aux = 0;
		while (numero != 0) {
			numero = sc.nextInt();
			aux = aux + numero;
		}
		System.out.println("El resultado es: " + aux);	
		sc.close();
	}
}
