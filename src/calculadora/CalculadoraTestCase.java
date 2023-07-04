package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class CalculadoraTestCase {

	@Test
	void testSumar() {
		int resultado = Calculadora.sumar(2, 3);
		
		//Para esta prueba, espero que la suma me de 5 (3+2)
		Assert.assertEquals(5, resultado); //lo que espero, y lo que tengo 
	} //testSumar 
	
	@Test
	void testMultiplicas() {
		int resultado = Calculadora.multiplicar(2, 3);
		Assert.assertEquals(6, resultado); //lo que espero, y lo que tengo 
	} //testmultiplicar 
	
	
//	@Test(expected = AritmeticException.class)
//	void testDividir() {
//		float resultado = Calculadora.dividir(6.0f, 0.0f);
//		assertEquals(6, resultado); //lo que espero, y lo que tengo 
//	} //testDividir 
	
	

}



