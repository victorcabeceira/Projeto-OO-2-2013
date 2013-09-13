/**
 * 
 */
package sistemadrogaria.testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sistemadrogaria.entidades.Cliente;


public class TesteCliente {

	@Before
	public void setUp() throws Exception {
		System.out.println("Comecando o teste!");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finalizando o teste!");
	}
	
	//Teste de idade.
	@Test
	public void testSetIdade() {
		Cliente novoCliente = new Cliente("Teste 1","Teste 2", 50);
		assertEquals(novoCliente.getIdade(),50);
		
	}

}
	
