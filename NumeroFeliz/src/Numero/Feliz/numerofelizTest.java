package Numero.Feliz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class numerofelizTest {

	@Test
	public void testN�oehFeliz() {
		boolean ehFeliz = numerofeliz.ehFeliz(0);
		assertEquals(false, ehFeliz);
	}
}
