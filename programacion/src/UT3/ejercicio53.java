/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author Irasema
 *
 */
public class ejercicio53 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		char letra = ' ';
		
		System.out.println("Introduce una letra: ");
		letra = sc.nextLine().charAt(0);
	
		while (!((letra >= 'A' && letra <= 'Z') || (letra >= 'a' && letra <= 'z'))) {
			System.out.println("Valor incorrecto, dame otra letra: ");
			letra = sc.nextLine().charAt(0);
		}

		if (letra >= 'A' && letra <= 'Z') {
			letra += 32;
			System.out.println("Es mayuscula, su minuscula es: " + letra);
		} else {
			if (letra >= 'a' && letra <= 'z') {
				letra -= 32;
				System.out.println("Es minuscula, su mayuscula es: " + letra);
			}

		}
		sc.close();
	}

}
