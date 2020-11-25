package UT3;



public class numerorestante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		int posicion[] = {9, 7, 6, 5};
		int faltante = 0;
		boolean encontrado = false;
		int min = 5;
		int max = 9;

		
		for (int i = min; i < max; i++) {
			encontrado = false;
			for (int j = 0; j < 4; j++) {
				if (i == posicion[j]) {
					encontrado = true;
				}
				
			}
			if (!encontrado) {
				faltante = i;
			}
		}
		System.out.println(faltante);
		}


	}

