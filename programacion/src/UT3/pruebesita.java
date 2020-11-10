package UT3;

import java.util.Scanner;

public class pruebesita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Pon un numero");
		numero = sc.nextInt();
		
		for (int i = 0; i < numero; i++ ) {
			System.out.println("Estamos en el numero: " +i);
			for (int j = 0; j <= i; j++) {
				System.out.println(j);
			}
		}
			
	}

}
