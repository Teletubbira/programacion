package UT622;

import java.util.Scanner;

public class Libro {

	// La clase debe guardar el título del libro(titulo), autor(autor), número de
	// ejemplares(ejemplares) del libro y número de ejemplares prestados(prestados).

	private String titulo;
	private String autor;
	private int ejemplares;
	private int prestados;

	public Libro() {

	}

	public Libro(String titulo, String autor, int ejemplares, int prestados) {

		setTitulo(titulo);
		setAutor(autor);
		setEjemplares(ejemplares);
		setPrestados(prestados);  

	}

	public String getTitulo() {
		return this.titulo;

	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEjemplares() {
		return this.ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int getPrestados() {
		return this.prestados;

	}

	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}

	/**
	 * Método préstamo que incremente el atributo correspondiente cada vez que se
	 * realice un préstamo del libro. No se podrán prestar libros de los que no
	 * queden ejemplares disponibles para prestar. Devuelve true si se ha podido
	 * realizar la operación y false en caso contrario.
	 */

	public boolean prestamo() {
		if (getEjemplares() - getPrestados() > 0) {
			setPrestados(getPrestados() + 1);
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Método devolución que decremente el atributo correspondiente cuando se
	 * produzca la devolución de un libro. No se podrán devolver libros que no se
	 * hayan prestado. Devuelve true si se ha podido realizar la operación y false
	 * en caso contrario.
	 */

	public boolean devolucion() {
		if (getPrestados() > 0) { // si he prestado algun libro, llamo al metodo set y establezco que pierdo un
									// prestado.
			setPrestados(getPrestados() - 1);
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Método toString para mostrar los datos de los libros. Este método se heredada
	 * de Object y lo debemos modificar (override) para adaptarlo a la clase Libro.
	 */

	@Override
	public String toString() {
		String titulo = "Mi titulo es: " + getTitulo();
		String autor = "Mi autor es: " + getAutor();
		String ejemplares = "Tengo " + getEjemplares() + " ejemplares";
		String prestados = "Tengo " + getPrestados() + " prestados";

		return titulo + "\n" + autor + "\n" + ejemplares + "\n" + prestados;

	}

	public static void main(String[] args) {
		// 1 y 2

		Libro libro1 = new Libro("la casa de la pradera", "Chiquito de la calzada", 10, 9);

		Libro libro2 = new Libro("el ultimo mohicano", "kiko rivera", 5, 4);

		// 3 y 4
		System.out.println("Tenemos " + libro1.getPrestados() + " prestados.");
		if (libro1.prestamo()) {
			System.out.println("Prestamo realizado.");
		}

		System.out.println("Tenemos " + libro1.getPrestados() + " prestados.");

		// 5-. Simula otro alquiler del libro 1 y vuelve a mostrar los ejemplares
		// prestados

		libro1.prestamo();
		System.out.println("Tenemos " + libro1.getPrestados() + " prestados.");

		// 6-. Realiza una devolucion de un ejemplar del libro1.
		libro1.devolucion();

		// 7-. Pon (set) el numero de ejemplares prestados del libro1 a 0.
		libro1.setPrestados(0);

		// 8-. Haz la devolucion de un ejemplar de libro1 y muestra el numero de
		// ejemplares prestados.

		libro1.devolucion();
		System.out.println("Tenemos " + libro1.getPrestados() + " prestados.");

		// 9-. Muestra el contenido de libro2 (tostring)
		libro2.toString();
		System.out.println("Libro2: ");
		System.out.println(libro2.toString());

		// 10-. Pide al usuario que introduzca los datos de un tercer libro (libro3) y
		// muestralo despues.

		Scanner sc = new Scanner(System.in);
		String titulo;
		String autor;
		int ejemplares;
		int prestados;
		System.out.println("Dame el titulo del libro");
		titulo = sc.next();
		System.out.println("Dame el autor del libro");
		autor = sc.next();
		System.out.println("Dame los ejemplares del libro");
		ejemplares = sc.nextInt();
		System.out.println("Dame los ejemplares prestados");
		prestados = sc.nextInt();

		Libro libro3 = new Libro(titulo, autor, ejemplares, prestados);

		System.out.println(libro3.toString());

	}
}
