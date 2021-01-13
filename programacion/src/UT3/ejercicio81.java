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
		int n1 = sc.nextInt();
		System.out.println("Escribe el segundo numero: ");
		int n2 = sc.nextInt();
		System.out.println("Escribe el intervalo: ");
		int inte = sc.nextInt();

		int comprendido = intervalo(n1, n2);
		int comprendido2 = intervalo(n1, n2);
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
	
	private static int intervalo1(int num1, int num2, int inter) {

		int resultado = num1;
		
		while (resultado >= num1 && resultado <= num2) {
			System.out.println(resultado);
			resultado = resultado + inter;
		}
		return num1;
}
}