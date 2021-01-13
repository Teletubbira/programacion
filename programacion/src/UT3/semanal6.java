/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author Irasema
 *
 */
public class semanal6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int contador[] = new int [26];
		boolean anagrama = true;
		
		System.out.println("Dame la primera frase: ");
		char f1[] = sc.nextLine().toCharArray();
		System.out.println("Dame la segunda frase: ");
		char f2[] = sc.nextLine().toCharArray();
		
		
		//para pasar las mayusculas a minusculas
		for (int i = 0; i < f1.length; i++) {
			if (f1[i] >= 'A' && f1[i] <= 'Z') {
				f1[i] += 32;
			}
		}
		for (int i = 0; i < f2.length; i++) {
			if (f2[i] >= 'A' && f2[i] <= 'Z') {
				f2[i] += 32;
			}
		}
		// suma 1 al contador en posicion correspondiente a la letra
		for(int i = 0; i < f1.length; i++) {
			if(f1[i] >= 'a' && f1[i] <= 'z') {	
				int valor = f1[i];
				contador[valor - 97] += 1;
			}
		}
		// resta 1 al contador en posicion correspondiente a la letra
		for(int i = 0; i < f2.length; i++) {
			if(f2[i] >= 'a' && f2[i] <= 'z') {	
				int valor = f2[i];
				contador[valor - 97] -= 1;
			}
		}
		for (int i = 0; i < contador.length; i++) {
			if(contador[i] != 0) {
				anagrama = false;
			}
		}
		
		if (anagrama) {
			System.out.println("Es un anagrama");
		} else {
			System.out.println("No es un anagrama");
		}
	}
}
