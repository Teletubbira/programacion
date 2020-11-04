/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author irape
 * 20. Repetir el ejercicio anterior, 
 * pero mostrar al finalizar también la media de los números introducidos. 
 */
public class ejercicio20mio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce numeros hasta llegar a 0: ");
		int numero = 1;
		int suma = 0;
		int contador = -1;
		int media;
		while (numero != 0) {
			numero = sc.nextInt();
			suma = suma + numero;
		}
		System.out.println("El resultado de la suma es: " + suma);	
		sc.close();
		
		contador = contador + 1;
		media = suma / contador;
		System.out.println("El resultado de la media es: " + media);	
		sc.close();
		
	}
}
