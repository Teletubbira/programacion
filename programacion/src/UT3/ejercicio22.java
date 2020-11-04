/**
 * 
 */
package UT3;

import java.util.Scanner;


/**
 * @author irape
 * Repetir el ejercicio anterior, 
 * pero mostrar al finalizar el mayor y el menor de los números introducidos (sin contar el 0)
 */
public class ejercicio22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el numero: ");
		int numero = sc.nextInt();
		System.out.println("Introduzca el exponente: ");
		int exponente = sc.nextInt();
		
		int resultado = 1;
		int aux;
		
			for (aux = 1; aux <= exponente; aux++) {
				resultado = resultado * numero;
				}	
		System.out.println("El resultado es: " + resultado);
		
		sc.close();
	}
}
