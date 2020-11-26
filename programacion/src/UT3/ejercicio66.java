/**Cargar un array con 10 numeros que introduzca el usuario 
y comprobar si alguno de esos numeros se repite. 
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author Irasema
 *
 */
public class ejercicio66 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int numeros[] = new int [10];
		boolean repetido = false;
		
		System.out.println("Dame diez numeros");
		
		for (int i= 0; i<numeros.length; i++) {
			numeros [i]= sc.nextInt();
		}
		System.out.println("Asi quedaria el array: ");
		for (int i = 0; i <numeros.length; i++) {
			System.out.print("[" + numeros[i] + "]");
		}
		for(int i= 0; i<numeros.length-1; i++) {
			for(int j = i+1; j<numeros.length; j++) {
				
				if(numeros[i] == numeros[j] ) {
					System.out.println("Se ha repetido: " + numeros[i]);
					repetido = true;
				}
			}	
		}
		
		if (repetido) {
			System.out.println("Es repetido");
		} else {
			System.out.println("No es repetido");
		}	
	}
}

































