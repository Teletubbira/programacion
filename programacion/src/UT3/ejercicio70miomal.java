/**Crear y mostrar un array bidimensional de 10 x 10.  
En cada posición se guardará (fila*columna).
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author irape
 *
 */
public class ejercicio70miomal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int numeros[] = new int[10];

		for (int i = 1; i < numeros.length+1; i++) {
			for (int j = 1; j < numeros.length+1; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.print("\n");
		}
		sc.close();
	}
}
