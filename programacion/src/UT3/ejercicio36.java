/**
 * dibujar un cuadrado con * pidiendole al usuario el numero de * por lado. 
 */
package UT3;

import java.util.Scanner;

/**
 * @author Irasema
 *
 */
public class ejercicio36 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int numero = 1;
		System.out.println("Escribe el numero de * por lado");
		numero = sc.nextInt();
		
		for (int i = 1; i < numero; i++) {
			for (int j = 1; j < numero; j++) {
				System.out.print("* ");
		}
			System.out.print("\n");
		}
		sc.close();
	}
}
