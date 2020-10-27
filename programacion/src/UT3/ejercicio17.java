/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author Irasema
 *
 */
public class ejercicio17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduzca el primer numero: ");
		int n1 = sc.nextInt();
		System.out.println("Introduzca el segundo numero: ");
		int n2 = sc.nextInt();
		System.out.println("Introduzca el intervalo: ");
		int intervalo = sc.nextInt();
		int aux;
		if (n2<n1) {
			aux = n1;
			n1 = n2;
			n2 = aux;
		}
		int resultado = n1;
		while (resultado >= n1 && resultado <= n2 ) {
		System.out.println(resultado);
		resultado = resultado + intervalo;
		
	}
		sc.close();
	}
}
