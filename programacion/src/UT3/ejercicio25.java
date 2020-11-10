/**
 * Escribe un programa que pida un número y nos diga si es o no un número primo.
 */
package UT3;

import java.util.Scanner;

/**
 * @author Irasema
 *
 */
public class ejercicio25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		boolean esprimo = true;
		
			for(int i = 2; i<numero; i++) {
				
				if (numero%i == 0){
					esprimo = false;
				}
			}
			if (esprimo) {
				System.out.println("Si, es primo");
			}
			else {
				System.out.println("No es primo");
			}
	}
}
