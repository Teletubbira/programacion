/**
 * Escribe un programa que pida un número y 
 * luego muestre en pantalla todos los números primos que hay entre 0 y el número solicitado.
 */
package UT3;

import java.util.Scanner;

/**
 * @author Irasema
 *
 */
public class ejercicio26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int numero = 1;
		boolean primo = true;
		
		System.out.println("Pon un numero");
		numero = sc.nextInt();
		
		for (int i = 2; i <= numero; i++) {
			
			for (int j = 2; j < i; j++) {
				
				if (i%j == 0){
					primo = false;
				}
			}
			if (primo) {
				System.out.println(i);
			}		
			primo = true; //reset
		}
	}
}
