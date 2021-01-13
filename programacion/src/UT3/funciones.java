/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author Irasema
 *
 */
public class funciones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in); 

        int dni; 
        System.out.println("Escribe tu numero del DNI y te digo la letra que tiene"); 
        dni=sc.nextInt(); 
        System.out.println("La letra de tu DNI es " + letraDNI(dni)); 
        sc.close(); 
	}
	
	private static char letraDNI(int dni) {
		char resultado;
		char letra[]= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'}; 
		int resto;
		resto=dni%23;
		resultado=letra[resto];
		return resultado;
	}

}
