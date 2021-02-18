package UT725;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PlaylistTest {

	@Test
	@DisplayName (value="Test de añadir cancion")
	void testAnyadirCancion() {
		Playlist playlist = new Playlist ("test");
		Cancion cancion = new Cancion ("TestTitle", "Marta", 3);
		playlist.anyadirCancion(cancion);
		
		assertEquals(playlist.obtieneTotalCanciones(), 1);
		
		Cancion cancion2 = new Cancion ("TestTitulo", "Maria", 2);
		playlist.anyadirCancion(cancion2);
		
		assertEquals(playlist.obtieneTotalCanciones(), 2);
	}


	@Test
	@DisplayName (value="Test de total de duracion en la playlist")
	void testTotalDuracionPlaylist() {
		Playlist playlist = new Playlist ("test");
		Cancion cancion = new Cancion ("TestTitle", "Marta", 3);
		playlist.anyadirCancion(cancion);
		
		assertEquals(playlist.totalDuracionPlaylist(), 3);
		
		Cancion cancion2 = new Cancion ("TestTitulo", "Maria", 2);
		playlist.anyadirCancion(cancion2);
		
		assertEquals(playlist.totalDuracionPlaylist(), 5);
	}

	@Test
	@DisplayName (value= "Test de reproducir playlist")
	void testReproducirPlaylist() {
		Playlist playlist = new Playlist ("test");
		
		assertEquals(playlist.reproducirPlaylist(), "La playlist no tiene canciones. ");
		
		Cancion cancion = new Cancion ("TestTitle", "Marta", 3);
		playlist.anyadirCancion(cancion);
		
		assertEquals(playlist.reproducirPlaylist(), "Reproduciendo... " + "TestTitle" + "\n");
	}

	@Test
	@DisplayName (value="Test de limpiar playlist")
	void testLimpiarPlaylist() {
		Playlist playlist = new Playlist ("test");
		Cancion cancion = new Cancion ("TestTitle", "Marta", 3);
		playlist.anyadirCancion(cancion);
		
		assertEquals(playlist.obtieneTotalCanciones(), 1);
		
		assertEquals(playlist.limpiarPlaylist(), "Lista vacia. ");
		
		assertEquals(playlist.obtieneTotalCanciones(), 0);
		
	}

	@Test
	@DisplayName (value="Test de eliminar cancion")
	void testEliminarCancion() {
		Playlist playlist = new Playlist ("test");
		
		assertEquals(playlist.eliminarCancion(0), false);
		
		Cancion cancion = new Cancion ("TestTitle", "Marta", 3);
		playlist.anyadirCancion(cancion);
		
		assertEquals(playlist.obtieneTotalCanciones(), 1);
		
		assertEquals(playlist.eliminarCancion(5), false);
		
		assertEquals(playlist.eliminarCancion(-5), false);
		
		assertEquals(playlist.eliminarCancion(0), true);
		
		assertEquals(playlist.obtieneTotalCanciones(), 0);
	}

	@Test
	@DisplayName (value="Test de encontrar cancion por titulo")
	void testEncontrarCancionPorTitulo() {
		Playlist playlist = new Playlist ("test");
		
		Cancion cancion = new Cancion ("TestTitle", "Marta", 3);
		playlist.anyadirCancion(cancion);
		Cancion cancion2 = new Cancion ("TestTitle2", "Marta", 3);
		playlist.anyadirCancion(cancion2);
		Cancion cancion3 = new Cancion ("TestTitle3", "Marta", 3);
		playlist.anyadirCancion(cancion3);
		
		assertEquals(playlist.encontrarCancionPorTitulo("titulonull"), null);
		
		assertEquals(playlist.encontrarCancionPorTitulo("TestTitle"), cancion);
		
	}

}
