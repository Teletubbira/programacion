package UT725;

import java.util.ArrayList;
import java.util.Iterator;

public class Playlist {

	private ArrayList<Cancion> canciones;
	private String nombre;

	public Playlist() {
		canciones = new ArrayList<Cancion>();
	}

	public Playlist(String nombre) {
		canciones = new ArrayList<Cancion>();
		this.nombre = nombre;
	}

	public void anyadirCancion(Cancion cancion) {
		canciones.add(cancion);
	}

	public Cancion obtieneCancion(int posicion) {
		return canciones.get(posicion);
	}

	public int obtieneTotalCanciones() {
		return canciones.size();
	}

	public String mostrarPlaylist() { // Declaro variable respuesta para guardar el nombre de la playlist con sus
										// canciones en sus respectivas posiciones de i.
		String respuesta = "";
		respuesta = "El nombre de la playlist es " + this.nombre + "\n";
		for (int i = 0; i < canciones.size(); i++) {
			respuesta = respuesta + (i + 1) + "- " + canciones.get(i).getTitulo() + "\n";
		}
		return respuesta;
	}

	public int totalDuracionPlaylist() {
		int contador = 0;
		for (Cancion cancion : canciones) {   // Recorro el arraylist de canciones (cada cancion de la lista se guarda en la variable cancion)

			contador = contador + cancion.getDuracion();    // almaceno la duracion de cada cancion en la variable contador
		}
		return contador;
	}

	public String reproducirPlaylist() { // declaramos variable respuesta para guardar los posibles resultados
		String respuesta = "";
		if (canciones.isEmpty()) {    // si la lista de canciones esta vacia, devolvemos que no tiene canciones
			respuesta = "La playlist no tiene canciones. ";
		} else {
			for (int i = 0; i < canciones.size(); i++) {
				respuesta = respuesta + canciones.get(i).reproducir();
			}
		}
		return respuesta;
	}

	public String reproducirCancion(int posicion) { //
		return canciones.get(posicion).reproducir();
	}

	public String limpiarPlaylist() {
		canciones = new ArrayList<Cancion>();
		return "Lista vacia. ";
	}

	public boolean eliminarCancion(int posicion) {
		if (canciones.isEmpty() || posicion > canciones.size() || posicion < 0) {
			return false;
		} else {
			canciones.remove(posicion);
			return true;
		}
	}

	public Cancion encontrarCancionPorTitulo(String nombre) {

		Iterator<Cancion> iter = canciones.iterator(); // creamos un iterador de canciones a partid del arraylist del
														// atributo canciones.

		while (iter.hasNext()) { // mientras haya un elemento siguiente, cancion es igual al siguiente elemento
			Cancion cancion = iter.next();
			if (cancion.getTitulo().equals(nombre)) { // si cancion con x titulo es igual al nombre que recibe el
														// metodo, devuelve esa cancion
				return cancion;
			}
		}
		return null; // en caso de no encontrarse, se devuelve nulo
	}

	public ArrayList<Cancion> encontrarCancionesPorArtista(String artista) {

		ArrayList<Cancion> cancionesEncontradas = new ArrayList<Cancion>(); // creamos un arraylist de canciones para
																			// guardar las canciones encontradas

		Iterator<Cancion> iter = canciones.iterator();

		while (iter.hasNext()) {
			Cancion cancion = iter.next();
			if (cancion.getArtista().equals(artista)) { // si el artista de la cancion es igual al artista recibido por
														// parametro
				cancionesEncontradas.add(cancion); // se añade esa cancion a la lista
			}
		}
		return cancionesEncontradas; // se devuelve una lista de canciones

	}

	// bateria de pruebas con main

	public static void main(String[] args) {

		Cancion cancion1 = new Cancion("11 razones", "Aitana", 3);
		Cancion cancion2 = new Cancion("Vas a quedarte", "Aitana", 4);
		Cancion cancion3 = new Cancion("Dia del platano", "Mermelada", 2);

		Playlist temazos = new Playlist("Aitemazos");

		temazos.anyadirCancion(cancion1);
		temazos.anyadirCancion(cancion2);
		temazos.anyadirCancion(cancion3);

		
		System.out.println("El numero total de canciones en la playlist es: " + temazos.obtieneTotalCanciones());
		System.out.println("La duracion total en minutos: " + temazos.totalDuracionPlaylist());
		System.out.println("\nVamos a mostrar la playlist:");
		System.out.println(temazos.mostrarPlaylist());
		System.out.println("Esta playlist suena asi: ");
		System.out.println(temazos.reproducirPlaylist());

		ArrayList<Cancion> aitanabff = temazos.encontrarCancionesPorArtista("Aitana");
		System.out.println("Estamos eliminando la primera cancion");
		if (temazos.eliminarCancion(0)) {
			System.out.println("Borrado con exito");
		} else {
			System.out.println("No se ha podido borrar");
		}
		System.out.println("Estamos eliminando la octava cancion");
		if (temazos.eliminarCancion(8)) {
			System.out.println("Borrado con exito");
		} else {
			System.out.println("No se ha podido borrar");
		}
		System.out.println("Esta playlist suena asi: ");
		System.out.println(temazos.reproducirPlaylist());
		System.out.println("Recuperando cancion");
		Cancion cancion4 = temazos.encontrarCancionPorTitulo("Dia del platano");
		System.out.println(cancion4.reproducir());

		System.out.println("\nReproducimos cancion");
		System.out.println(temazos.reproducirCancion(1));

		System.out.println(temazos.limpiarPlaylist());
		System.out.println(temazos.reproducirPlaylist());
		System.out.println("Reproducimos cancion ");

	}
}
