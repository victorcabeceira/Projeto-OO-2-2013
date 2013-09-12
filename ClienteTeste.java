/**
 * 
 */
package sistemadrogaria.testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClienteTeste {

	@Before
	public void setUp() throws Exception {
		System.out.println("Comecando o teste!");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finalizando o teste!");
	}
	
	@Test
	public void testSetCpf() {
		Cliente novoCliente = new Cliente("Teste 1","Teste 2", 123);
		assertEquals(novoCliente.getCpf(),123);
		
	}

}
	
