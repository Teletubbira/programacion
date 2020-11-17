/**Leer por teclado una serie de 10 números enteros. La aplicación 
debe indicarnos si los números están ordenados de forma creciente,  
decreciente, o si están desordenados. 
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author Irasema
 *
 */
public class ejercicio65 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int numeros[] = new int [10];
		boolean creciente= true;
		boolean decreciente = true;
		System.out.println("Dame diez numeros");
		
		for (int i= 0; i<numeros.length; i++) {
			numeros [i]= sc.nextInt();
		}
		
		//Bucle que compara el elemento i, con el elemento i+1, se pone 9 para no salirse del bucle
		for (int i= 0; i<numeros.length - 1; i++) { //-1 para que sea de 0 a 9.
			
			if(numeros[i]<numeros[i+1]) {
				decreciente = false;
			}
			if(numeros[i]>numeros[i+1]) {
				creciente = false;
			}
		}
		if (creciente) {
			System.out.println("Es creciente");
		} else {
			if (decreciente) {
				System.out.println("Es decreciente");
			} else {
				System.out.println("Es desordenado");
			}
		}
	}
}












