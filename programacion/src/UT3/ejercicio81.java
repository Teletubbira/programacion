/**Método al que se le pasan dos enteros y muestra todos los  

números comprendidos entre ellos, ellos inclusive. Llamad al metodo intervalo 
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author Irasema
 *
 */
public class ejercicio81 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe el primer numero: ");
		int num1 = sc.nextInt();
		System.out.println("Escribe el segundo numero: ");
		int num2 = sc.nextInt();
		System.out.println("Escribe el intervalo: ");
		int inte = sc.nextInt();

		int comprendido = intervalo(num1, num2);
		int resultado[] = intervalo1(num1, num2);
		int comprendido1[] = intervalo2(num1, num2, inte);
		
		for(int i = 0; i < resultado.length; i++) {
			System.out.println(resultado[i]);
		}
		
		System.out.println("Comprendido");
		for(int i = 0; i < comprendido1.length; i++) {
			System.out.println(comprendido1[i]);
		}
	}

	private static int intervalo(int num1, int num2) {
		
		int aux = num1;
		if (num1 > num2) {
			num1 = num2;
			num2 = aux;
		}
			for (int i = num1; i <= num2; i++) {
				System.out.println(num1);
				num1 = num1 + 1;
			}
		return num1;

	}
	// 81b
	private static int[] intervalo1(int num1, int num2) {

		int array1[] = new int[num2 - num1 + 1];
		
		for (int i = num1, j = 0; i <= num2; i++, j++) {
			array1[j] = i;
		}
		return array1;
}
	private static int[] intervalo2(int num1, int num2, int inte) {
		
		int array[] = new int[(num2 - num1) / inte +1];
		int contador = 0;
		for (int i = num1; i <= num2; i = i + inte) {
			array[contador] = i;
		}
		return array;
	}
	
	
	
	
	
	
	
	
	
	
}