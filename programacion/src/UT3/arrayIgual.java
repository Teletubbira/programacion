package UT3;

import java.util.Scanner;

public class arrayIgual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dada un array de 5 posiciones detminar si todos sus valores son iguales
		
		Scanner sc = new Scanner(System.in);
		int posicion[] = new int[5];
		boolean igual = true;
		
		System.out.println("Dame 5 numeros: ");
		for (int i = 0; i < posicion.length; i++) {
			posicion[i] = sc.nextInt();
		}

		for (int i = 0; i < posicion.length-1; i++) {
			if (posicion[i]!=posicion[i+1]) {
				igual = false;
				
			}
		}
		if (igual) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
		}
	}
}
