/**
 * Mostrar la tabla de multiplicar de los n�meros del 1 al 10 (no pedir ning�n dato al usuario) 
 */
package UT3;

/**
 * @author Irasema
 *
 */
public class ejercicio35 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
				System.out.print(i*j + "\t");
			}
			System.out.print("\n");
		}
	}
}
