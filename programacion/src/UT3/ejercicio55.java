/**Pedir una frase al usuario y mostrar cada palabra en una línea  

distinta y numerada. 
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author Irasema
 *
 */
public class ejercicio55 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String texto = new String();
		int contador = 0;
		
		System.out.println("Dame una frase: " );
		texto = sc.nextLine();
		
		System.out.print(contador + ". "); // para que cuente la primera palabra 
		
		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) == 32) {
				contador = contador + 1;
				System.out.print("\n");
				System.out.print(contador + ". ");

			} else {
				System.out.print(texto.charAt(i));
			}
			
		}
		
	}

}
