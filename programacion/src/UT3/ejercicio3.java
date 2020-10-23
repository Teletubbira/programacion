/**
 * 
 */
package UT3;
import java.util.Scanner;





/**
 * @author Irasema Pedrero
 * ejemplo pedir datos por pantalla
 */
public class ejercicio3 {
	public static void main(String[] args) {
		
		//para pedir datos al usuario necesito una variable de tipo scanner
		//en este caso la llamo "sc" pero podria llamarse de cualquier modo
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, introduce un numero");
		
		//guarda en la variable numero lo que el usuario introduzca
		
		int numero = entrada.nextInt();
		
		 System.out.print("El numero introducido es: ");
		 System.out.println(numero);
		 
		 entrada.close();
		
		// TODO Auto-generated method stub

	}

}
