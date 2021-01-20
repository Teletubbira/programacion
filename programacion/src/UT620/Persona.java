/**
 * 
 */
package UT620;

import java.util.Date;

/**
 * @author Irasema
 *
 */
public class Persona {

	private String nombre;
	private String apellidos;
	private int anioNacimiento;
	private int mesNacimiento;
	private int diaNacimiento;
	private char sexo;

	public Persona() {
		
	}

	public Persona(String nombre, String apellidos, int anio, int mes, int dia, char sexo) {
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setAnio(anio);
		this.setMes(mes);
		this.setDia(dia);
		this.setSexo(sexo);
	}
	
	public String getNombre() {
		return this.nombre;
	}

	// crear resto de getters
	public void setNombre(String nombre) {
		if(nombre.length() <= 4) {
			this.nombre = "Sin especificar";
		}
		else {
				char[] array = nombre.toCharArray(); // para modificar string
			if (nombre.charAt(0) >= 'a' && nombre.charAt(0) <= 'z') {
				array[0] = (char) (array[0]-32); //casteo hecho por el editor de codigo
			}
			this.nombre = new String(array);
		}
	}
	public String getApellidos() {
		return this.apellidos;
	}
	
	public void setApellidos(String apellidos){
		if (apellidos.charAt(0) >= 'a' && apellidos.charAt(0) <= 'z') {
			char[] array = apellidos.toCharArray(); // para modificar string
			array[0] = (char) (array[0]-32);
		}
		//https://stackoverflow.com/questions/38620201/indexof-to-find-all-occurrences-of-a-word-in-a-string/38620385
		char[] array = apellidos.toCharArray();
		int index = 0;
		while(index >= 0) {
		    index = apellidos.indexOf(" ", index+1);
			if (apellidos.charAt(index+1) >= 'a' && apellidos.charAt(index+1) <= 'z') {
				array[index+1] = (char) (array[index+1]-32);
			}
		}
		
		this.apellidos = new String(array);
	}
	// crear resto de setters
	
	public int getAnio() {
		return this.anioNacimiento;
	}

	// crear resto de getters
	public void setAnio(int anio) {
		if (anio >= 1900 && anio <= 2020) {
			this.anioNacimiento = anio;
		}
		else {
			this.anioNacimiento = 2000;
		}
	}
	
	public int getMes() {
		return this.mesNacimiento;
	}

	public void setMes(int mes) {
		if (mes >= 1 && mes <= 12) {
			this.mesNacimiento = mes;
		}
		else {
			this.mesNacimiento = 1;
		}
	}
	
	public int getDia() {
		return this.diaNacimiento;
	}
	
	public void setDia(int dia) {
		if (dia >= 1 && dia <= 31) {
			this.diaNacimiento = dia;
	}
		else {
			this.diaNacimiento = 1;
	}
	}
	public char getSexo() {
		return this.sexo;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public void saludar() {
		System.out.println("Hola soy " + this.getNombre() + " " + this.getApellidos() + " y naci el " + this.getDia() + "/" + this.getMes() + "/"+ this.getAnio());
	}
	public void mostrarEdad() {
		System.out.println("En la actualidad tengo " + this.getEdad() + " años");
	}
	public int getEdad() { 
		int diaActual = 19;
		int mesActual = 1;
		int anioActual = 2021;
		
		int edad = 0;
		
		if (mesActual > this.getMes()) {
			edad = anioActual - this.getAnio();
		}
		else {
		
		if (mesActual == this.getMes()) {
			if (diaActual >= this.getDia()) {
				edad = anioActual - this.getAnio();
			}
			else {
				edad = anioActual - this.getAnio() - 1;
			}
		}else {
			edad = anioActual - this.getAnio() - 1;
		}
		}
		
		return edad;
		
	}

	public static void main(String[] args) {
		Persona pepe = new Persona ("pepea", "pepito perez", 2003, 1 ,12, 'h');
		
		pepe.saludar();
		
		pepe.mostrarEdad();
	}

}
