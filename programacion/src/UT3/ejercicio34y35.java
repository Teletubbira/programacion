package UT3;

import java.util.Scanner;

public class ejercicio34y35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for (int i = 0; i < 5; i++) 
		 * 3{ for (int j = 0; j < 5; j++) {
		 * System.out.println(i + " " + j); } }
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
