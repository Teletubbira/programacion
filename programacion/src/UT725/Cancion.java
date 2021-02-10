package UT725;

public class Cancion {

	private String titulo;
	private String artista;
	private int duracionMinutos;

	public Cancion() {

	}

	public Cancion(String titulo, String artista, int duracionMinutos) {
		
		setTitulo(titulo);
		setArtista(artista);
		setDuracion(duracionMinutos);
	}

	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
		
	}
	public String getArtista() {
		return this.artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
		
	}
	public int getDuracion() {
		return this.duracionMinutos;
	}
	public void setDuracion(int duracionMinutos) {
		this.duracionMinutos = duracionMinutos;
		
	}
	public String reproducir() {
		return "Reproduciendo... " + getTitulo() + "\n";
	}

	public String toString() {
		
		return  titulo + " - " + artista + " (" + duracionMinutos + ")";


	}
}