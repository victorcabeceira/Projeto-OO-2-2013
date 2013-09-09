package sistemadrogaria.testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sistemadrogaria.entidades.Funcionarios;

public class TesteEntidades {

	@Before
	public void setUp() throws Exception {
		System.out.println("Comecando o teste!");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finalizando o teste!");
	}

	@Test
	public void testSetDigitoCpf() {
		Funcionarios funcionarioDrogaria = new Funcionarios(99,4444,3232,15,5,"Teste 1","Teste 2");
		assertEquals(funcionarioDrogaria.getDigitoCpf(),99);
	}

	@Test
	public void testSetSenha() {
		Funcionarios funcionarioDrogaria = new Funcionarios(2,15000,3232,15,5,"Teste 1","Teste 2");
		assertEquals(funcionarioDrogaria.getSenha(),15000);
	}

	@Test
	public void testSetSenhaFarmaciaPopular() {
		Funcionarios funcionarioDrogaria = new Funcionarios(2,4444,2432,15,5,"Teste 1","Teste 2");
		assertEquals(funcionarioDrogaria.getSenhaFarmaciaPopular(),2432);
	}

	@Test
	public void testGetCodigo() {
		Funcionarios funcionarioDrogaria = new Funcionarios(2,4444,3232,20,5,"Teste 1","Teste 2");
		assertEquals(funcionarioDrogaria.getCodigo(),20);
	}

	@Test
	public void testGetFatorComissao() {
		Funcionarios funcionarioDrogaria = new Funcionarios(2,4444,3232,15,15,"Teste 1","Teste 2");
		assertEquals(funcionarioDrogaria.getFatorComissao(),15);
	}

}
