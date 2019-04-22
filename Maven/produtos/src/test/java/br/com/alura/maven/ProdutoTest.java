package br.com.alura.maven;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProdutoTest {

	@Test
	public void verificaPrecoComImposto() {
		Produto bala = new Produto("Push", 0.10);

		assertEquals(0.11, bala.getPrecoComImposto(), 0.001);
	}
	
}
