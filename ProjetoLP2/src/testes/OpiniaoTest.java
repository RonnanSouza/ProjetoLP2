package testes;

import exce��es.NotaInvalidaException;
import classes.Opiniao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class OpiniaoTest {

	Opiniao op;
	Opiniao op2;
	
	@Before
	public void criaObjetos() throws Exception {
		op = new Opiniao("Bom Hotel", 10.0);
	}
	
	@Test
	public void testConstrutor() throws Exception {
		try {
			op2 = new Opiniao("Belo hotel, grande acomoda��o", 11.0);
			Assert.fail("Esperava exce��o, nota inv�lida");
		} catch ( NotaInvalidaException e ) {
			Assert.assertEquals("Nota invalida", e.getMessage());
		}
	}
}
