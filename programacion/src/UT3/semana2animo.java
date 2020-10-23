/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Irasema
 * 
 */
public class semana2animo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaro objeto de la clase Scanner para leer datos
		//pintamos menu
		//elige una opcion:
		//1.Necesito cafe
		//2.Paso de ir caminando
		//3.A tope con el insti
		//0.Salir
		//leo opcion elegida y la guardo en variable opcion
		//segun la opcion elegida, devuelvo frases
		//caso1: pinto frase1
		//caso2: pinto frase2
		//caso3: pinto frase3
		//caso0: pinto despedida
		//			salgo del programa
		//caso ninguno anterior: pinto aviso de error
		//vuelvo a pintar menu si opcion no es 0
		
	Scanner sc= new Scanner(System.in);
	int opcion;
	do {
	
		System.out.println("Bienvenido al menu de animos \n");
		System.out.println("Elige entre estas opciones: \n");
		System.out.println("1. Necesito un cafe\n");
		System.out.println("2. Paso de ir caminando\n");
		System.out.println("3. A tope con el insti\n");
		System.out.println("0. Salir\n");
	opcion = sc.nextInt();
		
		switch(opcion) {
			case 1: System.out.println("Pues compralo");
				break;
			case 2: System.out.println("Coge el metro");
				break;
			case 3: System.out.println("Eso es");
				break;
			case 0: System.out.println("Hasta luego");
				break;
			default: System.out.println("Opcion incorrecta");
				break;
		}
		}while (opcion != 0);
	}
}
