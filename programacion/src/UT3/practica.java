/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * Leer un entero
 * 
 * @author Irasema
 *
 */
public class practica {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int valor1 = 5;
		int valor2 = 10;
		
		System.out.println("La suma es " + suma(valor1, valor2));
	}
	
	private static int suma (int valor1, int valor2) {
		
		int suma = valor1 + valor2;
		
		return suma;
		
	}
}