package Entornos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ComplexTest {

	@Test
	@DisplayName(value = "Suma de complejos")
	void testSumar() {
		Complex sumando1 = new Complex(10, 15);
		Complex sumando2 = new Complex(15, 10);
		Complex resultado = sumando1.sumar(sumando2);

		assertEquals(resultado.getReal(), 25);
		assertEquals(resultado.getImag(), 25);

	}

	@Test
	@DisplayName(value = "Resta de complejos")
	void testRestar() {

		Complex minuendo = new Complex(30, 10);
		Complex sustraendo = new Complex(10, 30);
		Complex resultado = minuendo.restar(sustraendo);

		assertEquals(resultado.getReal(), 20);
		assertEquals(resultado.getImag(), -20);
	}

	@Test
	@DisplayName (value="Multiplicacion de complejos")
	void testMultiplicarComplex() {
		Complex factor1 = new Complex(3, 2);
		Complex factor2 = new Complex(4, 5);
		Complex resultado = factor1.multiplicar(factor2);
		
		// el orden de los productos no altera el resultado:
		Complex resultado2 = factor2.multiplicar(factor1);
		
		assertEquals(resultado.getReal(), 2);
		assertEquals(resultado.getImag(), 23);
		
		assertEquals(resultado2, resultado);
	}

	@Test
	@DisplayName (value="Multiplicando con double")
	void testMultiplicarDouble() {
		Complex multi = new Complex(3, 5);
		Complex resultado = multi.multiplicar(2);
		Complex resultado2 = multi.multiplicar(0);
		Complex resultado3 = multi.multiplicar(0.5);
		
		assertEquals(resultado.getReal(), 6);
		assertEquals(resultado.getImag(), 10);
		
		assertEquals(resultado2.getReal(), 0);
		assertEquals(resultado2.getImag(), 0);
		
		assertEquals(resultado3.getReal(), 1.5);
		assertEquals(resultado3.getImag(), 2.5);
	}

	@Test
	@DisplayName(value="Dividir y dividir entre numeros negativos")
	void testDividir() {
		Complex dividendo = new Complex(8, 4);
		Complex divisor = new Complex(3, 2);
		
		Complex dividendo2 = new Complex(8, 4);  //con limite
		Complex divisor2 = new Complex(-7, -1);
		
		//(a, b) / (c, d) = ((a*c + b*d) / (c^2 + d^2) , (b*c – a*d) / (c^2 + d^2))
		
		double real = (8*3+4*2) / (9.0 + 4.0);
		double imag = (4*3-8*2) / (9.0 + 4.0);
		
		
		Complex resultado = dividendo.dividir(divisor);
		
		assertEquals(resultado.getReal(), real);
		assertEquals(resultado.getImag(), imag);
		
		assertEquals (dividendo2.dividir(divisor2).getReal(), -1.2);   // con limite
		assertEquals (dividendo2.dividir(divisor2).getImag(), -0.4);
	}
	

	@Test
	void testToString() {
		Complex complejo = new Complex (3, 6);
		String complejoToString = complejo.toString();
		
		assertEquals(complejoToString, "(3.0, 6.0)");
	}

	@Test
	void testEqualsObject() {
	Complex complejo1 = new Complex(1, 2);
	Complex complejo2 = new Complex(1, 2);
	Complex complejo3 = new Complex(3, 4);
	
	assertTrue(complejo1.equals(complejo2));
	assertFalse(complejo1.equals(complejo3));
	
	
	
	
	
	
	
	
	}

}
