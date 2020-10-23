/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Irasema
 *
 */
public class ejercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc= new Scanner(System.in);
		float importe;
		
		System.out.println("Introduzca el importe de su compra: ");
		importe = sc.nextFloat();
		
		if(importe>=200) {
			System.out.println("Tu importe es " +importe*0.8);
		}else if(importe>=100 && importe<200){
			System.out.println("Tu importe es " +importe*0.9);
		}else {
			System.out.println("Tu importe es " +importe);
		}
	}

}

