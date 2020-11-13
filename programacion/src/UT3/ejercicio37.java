/**
 * dibujar un cuadrado con * pidiendole al usuario el numero de * por lado. 
 */
package UT3;

import java.util.Scanner;

/**
 * @author Irasema
 *
 */
public class ejercicio37 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int fila = 1;
		int columna = 1;
		System.out.println("Introduce el numero de filas");
		fila = sc.nextInt();
		System.out.println("Introduce el numero de columnas");
		columna = sc.nextInt();
				
		for (int i = 1; i < fila; i++) {
			System.out.print("* ");
		
			for (int j = 1; j < columna; j++) {
				System.out.print("* ");
			
			
			}
			System.out.print("\n");
		}
		sc.close();
	}
}