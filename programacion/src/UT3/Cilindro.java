/**
 * 
 */
package UT3;

/**
 * @author Irasema
 *
 */
public class Cilindro {

	double altura;
	double radio;

	public Cilindro (double altura, double radio) {
		this.altura = altura;
		this.radio = radio;
	}

	public double area() {

		double area = 2 * Math.PI * radio * (radio + altura);
		return area;
	}

	public double volumen() {
		double areabase = Math.PI * radio * radio;
		return areabase * altura;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cilindro cilindro = new Cilindro (10.0, 5.0);
		
		cilindro.area();
		System.out.println(cilindro.area());
		
		cilindro.volumen();
		System.out.println(cilindro.volumen());
	}

}