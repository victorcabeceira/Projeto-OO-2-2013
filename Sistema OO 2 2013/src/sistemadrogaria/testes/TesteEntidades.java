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

	//Teste para confirmação do digito do CPF
	@Test
	public void testSetDigitoCpf() {
		Funcionario funcionarioDrogaria = new Funcionario(99,4444,3232,15,5,"Teste 1","Teste 2");
		assertEquals(funcionarioDrogaria.getDigitoCpf(),99);
	}

	//Teste para confirmação da senha
	@Test
	public void testSetSenha() {
		Funcionario funcionarioDrogaria = new Funcionario(2,15000,3232,15,5,"Teste 1","Teste 2");
		assertEquals(funcionarioDrogaria.getSenha(),15000);
	}

	//Teste para confirmação da senha da farmácia popular
	@Test
	public void testSetSenhaFarmaciaPopular() {
		Funcionario funcionarioDrogaria = new Funcionario(2,4444,2432,15,5,"Teste 1","Teste 2");
		assertEquals(funcionarioDrogaria.getSenhaFarmaciaPopular(),2432);
	}

	//Teste para confirmação do código do funcionário
	@Test
	public void testGetCodigo() {
		Funcionario funcionarioDrogaria = new Funcionario(2,4444,3232,20,5,"Teste 1","Teste 2");
		assertEquals(funcionarioDrogaria.getCodigo(),20);
	}

	//Teste para confirmação do fator de comissão do funcionário
	@Test
	public void testGetFatorComissao() {
		Funcionario funcionarioDrogaria = new Funcionario(2,4444,3232,15,15,"Teste 1","Teste 2");
		assertEquals(funcionarioDrogaria.getFatorComissao(),15);
	}

}
