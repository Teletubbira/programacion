/**
 * 
 */
package UT3;

/**
 * @author Irasema
 *
 */
public class ejercicio71funciones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int[][] c = new int[3][3];

		// Cargar tabla a con numeros aleatorios

		fillrandomTable(a);

		// Cargar tabla b con numeros aleatorios

		fillrandomTable(b);

		// Hacer suma (que se mete en tabla c)

		c = sumaMatrices(a, b);

		// pintar tabla a
		pintaTabla(a);

		// pintar tabla b
		pintaTabla(b);

		// pintar tabla c (tercer array, la suma)
		System.out.println("\nEste es el tercer array (la suma de los dos primeros arrays)");

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print("P." + i + "." + j + "| " + a[i][j] + " + " + b[i][j] + " = ");
				System.out.print(c[i][j] + " \t");
			}
			System.out.print("\n");

		}

	}

	private static void pintaTabla(int[][] a) {
		// TODO Auto-generated method stub

	}

	private static int[][] sumaMatrices(int[][] a, int[][] b) {
		// TODO Auto-generated method stub
		return null;
	}

	// funcion que carga una tabla con numeros aleatorios

	private static int[][] fillrandomTable(int[][] tabla) {

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; i < tabla.length; j++) {
				tabla[i][j] = (int) (Math.random() * 10);
			}
		}
	}

	// funcion suma matrices, le paso dos matrices y me devuelte una tercera

	private static int[][] sumaMatrices(int[][] matriz1, int[][] matriz2) {
		int[][] suma = new int[matriz1.length][matriz1.length];
		for (int i = 0; i < suma.length; i++) {
			for (int j = 0; j < suma[i].length; j++) {
				suma[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}

		return suma;
	}

	// funcion que pinta en pantalla una tabla o array bidimensional

	private static void pintaTabla(int[][] tabla) {
		System.out.println("\nEsta es una tabla: ");
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print("P." + i + "." + j + "| ");
				System.out.print(tabla[i][j] + " \t");
			}
			System.out.print("\n");
		}
	}
}
