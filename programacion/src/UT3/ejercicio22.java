/**
 * 
 */
package UT3;

import java.util.Scanner;


/**
 * @author irape

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
		
		for (int i = 0; i < exponente ; i++) {
			resultado = resultado * numero;
		}
		System.out.println("El resultado es: " + resultado);
		sc.close();
	}
}
