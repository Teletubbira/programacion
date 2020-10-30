/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author Irasema
 *
 */
public class semana3futbol {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		int minimoLargo = 90;
		int maximoLargo = 120;
		int minimoAncho = 45;
		int maximoAncho = 90;
		int minimoSuperficie = minimoLargo * minimoAncho;
		int maximoSuperficie = maximoLargo * maximoAncho;
		int superficie = 1; //distinto de 0 para entrar en while
		int campo;
		while (superficie != 0) {
			
		System.out.println("Introduzca la superficie en metros cuadrados: ");
		superficie = entrada.nextInt();
		if(superficie!=0) {
			
			System.out.println("Introduzca los campos de futbol estimados: ");
			campo = entrada.nextInt();
			if (superficie >= minimoSuperficie*campo && superficie <= maximoSuperficie*campo) {
				System.out.println("Si");
			}else {
				System.out.println("No");
			}
			}
		}
		entrada.close();
	}
}
