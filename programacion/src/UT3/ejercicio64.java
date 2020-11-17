/**Leer por teclado dos tablas de 5 números enteros y mezclarlas en una  
tercera de la forma:  
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author Irasema
 *
 */
public class ejercicio64 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int b[] = new int[5];
		int c[] = new int[10];
		
		System.out.println("Dame cinco(a) numeros");
		
		for(int i=0; i<a.length; i++) {
			System.out.println("Introduce el numero de la posicion " +i);
			a[i] = sc.nextInt();	
		}
		
		System.out.println("Dame cinco(b) numeros");
		
		for(int i=0; i<b.length; i++) {
			System.out.println("Introduce el numero de la posicion " +i);
			b[i] = sc.nextInt();	
		}
		
		for(int i= 0; i<5; i++) {
			c[i*2] = a[i];
			c[i*2 + 1] = b[i];
			
		}
		System.out.println("La tabla c queda asi: ");
		for (int i= 0; i<c.length; i++) {
			System.out.print(c[i] + " ");
		
		}
		sc.close();
	}
}
