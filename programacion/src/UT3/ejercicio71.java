/** Crear y cargar dos matrices de tamaño 3x3, 
 * sumarlas en un  tercer array y mostrarlo. 
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author irape
 *
 */
public class ejercicio71 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int tabla1[][] = new int[3][3];
		int tabla2[][] = new int[3][3];
		int tabla3[][] = new int[3][3];


		for (int i = 1; i < tabla1.length + 1; i++) {
			for (int j = 1; j < tabla1[i].length + 1; j++) {
				System.out.println(tabla1[i][j] + " ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");

		for (int i = 1; i < tabla2.length + 1; i++) {
			for (int j = 1; j < tabla2[i].length + 1; j++) {
				System.out.println(tabla2[i][j] + " ");
			}
			System.out.print("\n");
		}

		System.out.print("\n");
		
		for(int i = 0; i < tabla3.length; i++) {
			for (int j = 1; j < tabla3[i].length + 1; j++) {
			tabla3[i][j] = tabla1[i][j] + tabla2[i][j];
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		
		for (int i= 0; i<tabla3.length; i++) {
			for (int j = 1; j < tabla3[i].length + 1; j++) {
			System.out.print(tabla3[i][j] + " ");
			}
		}
		sc.close();
	}
}
