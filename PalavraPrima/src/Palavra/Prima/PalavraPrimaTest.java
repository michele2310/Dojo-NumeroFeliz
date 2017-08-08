package Palavra.Prima;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalavraPrimaTest{
	
	@Test
	public void testConverteLetraAMinuscula(){
		int valor = PalavraPrima.converteEmNumero("a");
		 assertEquals(1,valor);
	}
	
	@Test
	public void testConverteLetraAMaiuscula(){
		int valor = PalavraPrima.converteEmNumero("A");
		 assertEquals(27,valor);
	}
	
	@Test
	public void testConverteLetraBMinuscula(){
		int valor = PalavraPrima.converteEmNumero("b");
		 assertEquals(2,valor);
	}
	
	@Test
	public void testConverteLetraBMaiuscula(){
		int valor = PalavraPrima.converteEmNumero("B");
		 assertEquals(28,valor);
	}
	
	@Test
	public void testConverteLetraZMinuscula(){
		int valor = PalavraPrima.converteEmNumero("z");
		 assertEquals(26,valor);
	}
	
	@Test
	public void testConverteLetraZMaiuscula(){
		int valor = PalavraPrima.converteEmNumero("Z");
		 assertEquals(52,valor);
	}
	
	@Test
	public void test2EhNumeroPrimo(){
		 boolean resultadoTeste = PalavraPrima.ehPrimo(2);
		 assertEquals(true, resultadoTeste);
	}
	
	@Test
	public void test26EhNumeroPrimo(){
		 boolean resultadoTeste = PalavraPrima.ehPrimo(26);
		 assertEquals(false, resultadoTeste);
	}
	
	
 
	
}
