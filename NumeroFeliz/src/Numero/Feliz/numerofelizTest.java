package Numero.Feliz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class numerofelizTest {

	@Test
	public void testNãoehFeliz() {
		boolean ehFeliz = numerofeliz.ehFeliz(0);
		assertEquals(false, ehFeliz);
	}
}
