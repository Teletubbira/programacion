/**
 * 
 */
package UT3;

import java.util.Scanner;

/**Método llamado maximo que tenga como parámetros dos números,  

y que devuelva el máximo. 
 * @author Irasema
 *
 */
public class ejercicio80 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un numero entero: ");
		int n1 = sc.nextInt();
		System.out.println("Escribe otro numero entero: ");
		int n2 = sc.nextInt();
		
		int maxi = maximo(n1, n2);
		System.out.println("El maximo es " + maxi);
		
		sc.close();
		
	}

	//funcion que devuelve el maximo numero entero de dos
	private static int maximo(int num1, int num2) {
		int max = num1;
		
		if(num1 >= num2)
			max = num1;
		else
			max = num2;
		
		return max;
	}
}
