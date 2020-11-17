/**Crear un array de enteros de 10 posiciones, pedir números al usuario hasta rellenarlo. 
Mostrar a continuación la media de los numeros del array y cuál es el mayor y el menor. 
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author Irasema
 *
 */
public class ejercicio63 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int enteros [];
		enteros = new int[10];
		int suma = 0;
		int menor = 0;
		int mayor = 0;
		
		System.out.println("Dame diez numeros");
		
		for(int i=0; i<enteros.length; i++) {
			System.out.println("Introduce el numero de la posicion " +i);
			enteros[i] = sc.nextInt();	
		}
		
		mayor = enteros[0];
		menor = enteros[0];
		
		for(int j=0; j<enteros.length; j++) {
			suma= suma + enteros[j];
			
			

		}
		
		System.out.println("La media es " + suma/10);
		
		sc.close();
	}

}
