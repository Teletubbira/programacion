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

	public String mostrarPlaylist() {  // Declaro variable respuesta para guardar el nombre de la playlist con sus canciones en sus respectivas posiciones de i.
		String respuesta= "";
		respuesta = "El nombre de la playlist es " + this.nombre + "\n";
		for(int i = 0; i < canciones.size(); i++) {
			respuesta = respuesta + i + "- " + canciones.get(i).getTitulo() + "\n";
		}
		return respuesta;
	}

	public int totalDuracionPlaylist() {
		int contador = 0;
		for (Cancion cancion : canciones) {

			contador = cancion.getDuracion() + contador;
		}
		return contador;
	}

	public String reproducirPlaylist() {  // declaramos variable respuesta para guardar los posibles resultados
		String respuesta = "";
		if (canciones.isEmpty()) {
			respuesta =  "La playlist no tiene canciones. ";
		} else {
			for (int i = 0; i < canciones.size(); i++) {
				respuesta = respuesta + canciones.get(i).reproducir();
			}
		}
		return respuesta;
	}

	public void reproducirCancion(int posicion) {
		canciones.get(posicion).reproducir();
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

		Iterator<Cancion> iter = canciones.iterator();

		while (iter.hasNext()) {
			Cancion cancion = iter.next();
			if (cancion.getTitulo().equals(nombre)) {
				return cancion;
			}
		}
		return null;
	}
	public ArrayList<Cancion> encontrarCancionesPorArtista(String artista){
		
		ArrayList<Cancion> cancionesEncontradas = new ArrayList<Cancion>();
		
		Iterator<Cancion> iter = canciones.iterator();

		while (iter.hasNext()) {
			Cancion cancion = iter.next();
			if (cancion.getArtista().equals(artista)) {
				cancionesEncontradas.add(cancion);
			}
		}
		return cancionesEncontradas;

	}

	// bateria de pruebas con main
	
	 public static void main(String[] args) {
		
		Cancion cancion1 = new Cancion ("11 razones", "Aitana", 3);
		Cancion cancion2 = new Cancion ("Vas a quedarte", "Aitana", 4);
		Cancion cancion3 = new Cancion ("Dia del platano", "Mermelada", 2);
		
		Playlist temazos = new Playlist ("Aitemazos");
		temazos.anyadirCancion(cancion1);
		temazos.anyadirCancion(cancion2);
		temazos.anyadirCancion(cancion3);
		
		System.out.println("El numero total de canciones en la playlist es: " + temazos.obtieneTotalCanciones());
		System.out.println("La duracion total en minutos: " + temazos.totalDuracionPlaylist());
		System.out.println("\n Vamos a mostrar la playlist:");
		System.out.println(temazos.mostrarPlaylist());
		System.out.println("Esta playlist suena asi: ");
		System.out.println(temazos.reproducirPlaylist());
		
		ArrayList<Cancion> aitanabff = temazos.encontrarCancionesPorArtista("Aitana");
		System.out.println("Estamos eliminando la primera cancion");
		if (temazos.eliminarCancion(0)) {
			System.out.println("Borrado con exito");
		}
		else {
			System.out.println("No se ha podido borrar");
		}
		System.out.println("Estamos eliminando la octava cancion");
		if (temazos.eliminarCancion(8)) {
			System.out.println("Borrado con exito");
		}
		else {
			System.out.println("No se ha podido borrar");
		}
		System.out.println("Esta playlist suena asi: ");
		System.out.println(temazos.reproducirPlaylist());
		System.out.println("Recuperando cancion");
		Cancion cancion4 = temazos.encontrarCancionPorTitulo("Dia del platano");
		System.out.println(cancion4.reproducir());
		
		System.out.println("\nReproducimos cancion\n ");
		temazos.reproducirCancion(1);
		
		System.out.println(temazos.limpiarPlaylist());
		System.out.println(temazos.reproducirPlaylist());
		System.out.println("Reproducimos cancion ");

	}
}
