package Numero.Feliz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class numerofelizTest {

	@Test
	public void testNãoehFeliz() {
		boolean ehFeliz = numerofeliz.ehFeliz(0);
		assertEquals(false, ehFeliz);
	}
	
	@Test
	public void testNumeroFeliz5() {
		boolean ehFeliz = numerofeliz.ehFeliz(5);
		assertEquals(false, ehFeliz);
	}
	
	@Test
	public void testNumeroFeliz10() {
		boolean soma = numerofeliz.ehFeliz(10);
		assertEquals(true, soma);
	}
	
	@Test
	public void testNumeroFeliz11() {
		boolean ehFeliz = numerofeliz.ehFeliz(11);
		assertEquals(false, ehFeliz);
	}
	
	@Test
	public void testNumeroFeliz111() {
		boolean ehFeliz = numerofeliz.ehFeliz(111);
		assertEquals(false, ehFeliz);
	}
	
	@Test
	public void testNumeroFeliz203() {
		boolean ehFeliz = numerofeliz.ehFeliz(203);
		assertEquals(false, ehFeliz);
	}
	
}