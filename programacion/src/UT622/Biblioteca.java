package UT622;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

	private ArrayList<Libro> biblioteca = new ArrayList<Libro>(); // creo arraylist vacio (arraylist de tipo libro)

	public Biblioteca() { // constructor vacio del objeto Biblioteca

	}

	private void dardeAlta(Libro libro) {

		biblioteca.add(libro); // al arraylist se le añade el objeto libro

	}

	private Libro leerLibro() { // pido datos al usuario sobre el libro y lo devuelvo

		Scanner sc = new Scanner(System.in);

		Libro nuevolibro = new Libro();

		System.out.println("Escribe el titulo del libro: \n");
		nuevolibro.setTitulo(sc.next());
		System.out.println("Escribe el autor del libro: \n");
		nuevolibro.setAutor(sc.next());
		System.out.println("Escribe el numero de ejemplares: \n");
		nuevolibro.setEjemplares(sc.nextInt());
		System.out.println("Escribe el numero de libros en prestamo: \n");
		nuevolibro.setPrestados(sc.nextInt());

		return nuevolibro;
	}

	private void consultarLibro() { // recorro el arraylist de biblioteca e imprimo su posicion +1 (para que no de
									// 0) y los datos que devuelve el metodo toString
		for (int i = 0; i < biblioteca.size(); i++) {
			System.out.println("\n El libro numero " + (i + 1));
			System.out.println(biblioteca.get(i).toString()); //
		}

	}

	private void dardeBaja(int libroborrado) { // elimina libro de la posicion elegida por el usuario
		biblioteca.remove(libroborrado);

	}

	private boolean prestarLibro(int libroPrestado) {
		boolean prestado = biblioteca.get(libroPrestado).prestamo(); // Realizamos la operacion prestamo(que devuelve
																		// true o false) del libro indicado por el
																		// usuario y guardamos el resultado en la
																		// variable prestado

		return prestado;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Biblioteca biblioteca = new Biblioteca();
		int opcion = 1;

		while (opcion != 0) {
			System.out.println("\nSelecciona una opcion: \n");
			System.out.println("1. Alta libro.");
			System.out.println("2. Consulta libro.");
			System.out.println("3. Baja libro.");
			System.out.println("4. Prestamo libro.");
			System.out.println("0. Salir \n");
			System.out.println("Introduzca su opcion: \n");
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:
				Libro nuevolibro = biblioteca.leerLibro(); // llamo al metodo leerLibro para generar un objeto de tipo
															// Libro por el usuario
				biblioteca.dardeAlta(nuevolibro); // añado libro a la biblioteca
				break;

			case 2:
				biblioteca.consultarLibro();
				break;

			case 3:
				System.out.println("Que libro quieres eliminar?");
				int libroBorrado = sc.nextInt();
				biblioteca.dardeBaja(libroBorrado - 1);
				break;

			case 4:
				System.out.println("Que libro quieres tomar prestado?");
				int libroPrestado = sc.nextInt();
				boolean prestarLibro = biblioteca.prestarLibro(libroPrestado - 1); // guardo resultado de la operacion
																					// en boolean
				if (prestarLibro) {
					System.out.println("Prestamo realizado con exito.");
				} else {
					System.out.println("Prestamo fallido.");
				}

				break;

			default:
				System.out.println("Opcion erronea, escoja otra.\n");
				break;

			}

		}

		System.out.println("Has elegido la opcion de salir.");

	}

}
