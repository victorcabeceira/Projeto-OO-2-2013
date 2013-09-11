package sistemadrogaria.testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sistemadrogaria.entidades.Funcionario;

public class TesteEntidades {

	@Before
	public void setUp() throws Exception {
		System.out.println("Comecando o teste!");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finalizando o teste!");
	}

	//Teste para confirma��o do digito do CPF
	@Test
	public void testSetDigitoCpf() {
		Funcionario funcionarioDrogaria = new Funcionario(99,4444,3232,15,5,"Teste 1","Teste 2");
		assertEquals(funcionarioDrogaria.getDigitoCpf(),99);
	}

	//Teste para confirma��o da senha
	@Test
	public void testSetSenha() {
		Funcionario funcionarioDrogaria = new Funcionario(2,15000,3232,15,5,"Teste 1","Teste 2");
		assertEquals(funcionarioDrogaria.getSenha(),15000);
	}

	//Teste para confirma��o da senha da farm�cia popular
	@Test
	public void testSetSenhaFarmaciaPopular() {
		Funcionario funcionarioDrogaria = new Funcionario(2,4444,2432,15,5,"Teste 1","Teste 2");
		assertEquals(funcionarioDrogaria.getSenhaFarmaciaPopular(),2432);
	}

	//Teste para confirma��o do c�digo do funcion�rio
	@Test
	public void testGetCodigo() {
		Funcionario funcionarioDrogaria = new Funcionario(2,4444,3232,20,5,"Teste 1","Teste 2");
		assertEquals(funcionarioDrogaria.getCodigo(),20);
	}

	//Teste para confirma��o do fator de comiss�o do funcion�rio
	@Test
	public void testGetFatorComissao() {
		Funcionario funcionarioDrogaria = new Funcionario(2,4444,3232,15,15,"Teste 1","Teste 2");
		assertEquals(funcionarioDrogaria.getFatorComissao(),15);
	}

}
