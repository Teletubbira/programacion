/**
 * 21. Repetir el ejercicio anterior, 
 * pero mostrar al finalizar el mayor y el menor de los números introducidos (sin contar el 0) 
 */
package UT3;

import java.util.Scanner;

/**
 * @author Irasema
 * Repetir el ejercicio anterior, 
 * pero mostrar al finalizar el mayor y el menor de los números introducidos (sin contar el 0)
 */
public class ejercicio21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce numeros hasta llegar a 0: ");
		int numero = sc.nextInt();
		int mayor = numero;
		int menor = numero;
		
		while (numero != 0) { 
			
			if (mayor<numero) {
				mayor=numero;
			}
			
			if (menor>numero) {
				menor=numero;
			}
			numero = sc.nextInt();
			
		}
		System.out.println("El mayor numero introducido es: " +mayor);
		System.out.println("El menor numero introducido es: " +menor);
		sc.close();
	

	}
}
