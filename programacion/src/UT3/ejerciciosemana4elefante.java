/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author Irasema
 *
 */
public class ejerciciosemana4elefante {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int tela = 1;
		int elefante = 1;
		int peso_acumulado = 0;
		
		while (tela != 0) {

			System.out.println("Pon el peso que soporta la telaraña");
			tela = sc.nextInt();
			int contador = 1;	
			
			while (peso_acumulado < tela && elefante != 0) {
				
				System.out.println("Dame el peso del elefante numero: " + contador);
				contador++;
				elefante = sc.nextInt();
				peso_acumulado = peso_acumulado + elefante;
			}
			if (peso_acumulado >= tela) {
				System.out.println("Se ha roto");
			}	
			else {
				System.out.println("Ha aguantado");
			}
			peso_acumulado = 0; // Reset, se acumulaban antes. :(
			elefante = 1; //Todo parece necesitar reset para funcionar. >:(
		}		
		sc.close();
	}
}

