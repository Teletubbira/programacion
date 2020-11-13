
/**Dibujar un cuadrado con * pidiendole al usuario el numero de * por lado,  
	pero solo pintando los * pares en las lineas pares y los impares en las impares 
 */
package UT3;

import java.util.Scanner;

/**
 * @author Irasema
 *
 */
public class ejercicio38 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int numero = 1;
		System.out.println("Escribe el numero de * por lado");
		numero = sc.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			for (int j = 1; j <= numero; j++) {
				
				if(i%2 == 0) {
					if(j%2 == 0)
						System.out.print("* ");
					else
					System.out.print("  ");
		
				} else {
					if(j%2 == 0) 
					System.out.print("  ");
				
					else
					System.out.print("* ");
				}	
			}
			System.out.print("\n");
		}
		sc.close();
	}
}
	


