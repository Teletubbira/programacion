package UT3;

import java.util.Scanner;

public class ejercicio34y35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int filas = numero;

		for (int i = 0; i < numero; i++) {
			for (int j = 0; j < filas; j++) {
				System.out.print("#");
			}
			System.out.print("\n");
		}
	}
}
