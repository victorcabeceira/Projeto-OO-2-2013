package sistemadrogaria.testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sistemadrogaria.entidades.Caixa;
import sistemadrogaria.entidades.Medicamento;

public class TesteCaixaMedicamento {

	@Before
	public void setUp() throws Exception {
		System.out.println("Inicio.");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Fim.");
	}

	@Test
	public void testGetNome() {
		Medicamento medicamento = new Medicamento ("NomeTeste", "LaboratorioTeste", "Adulto", "Comprimido", "10/10/2020");
		assertEquals(medicamento.getNome(),"NomeTeste");
		//fail("Not yet implemented");.
	}

	@Test
	public void testGetLaboratorio() {
		Medicamento medicamento = new Medicamento ("NomeTeste", "LaboratorioTeste", "Adulto", "Comprimido", "10/10/2020");
		assertEquals(medicamento.getLaboratorio(),"LaboratorioTeste");
		//fail("Not yet implemented");
	}

	@Test
	public void testGetRecomendacao() {
		Medicamento medicamento = new Medicamento ("NomeTeste", "LaboratorioTeste", "Adulto", "Comprimido", "10/10/2020");
		assertEquals(medicamento.getRecomendacao(),"Adulto");
		//fail("Not yet implemented");
	}

	@Test
	public void testGetTipo() {
		Medicamento medicamento = new Medicamento ("NomeTeste", "LaboratorioTeste", "Adulto", "Comprimido", "10/10/2020");
		assertEquals(medicamento.getTipo(),"Comprimido");
		//fail("Not yet implemented");
	}

	@Test
	public void testGetValidade() {
		Medicamento medicamento = new Medicamento ("NomeTeste", "LaboratorioTeste", "Adulto", "Comprimido", "10/10/2020");
		assertEquals(medicamento.getValidade(),"10/10/2020");
		//fail("Not yet implemented");
	}
	
	/** Abaixo, testes da classe Caixa.java */
	
	@Test
	public void testGetTipoo(){
		Caixa transacao = new Caixa (0, 100, "10/10/2020", "transacaoTeste");
		assertEquals(transacao.getTipo(),0);
	}
	
	
	@Test
	public void testGetValor (){
		Caixa transacao = new Caixa (0, 100, "10/10/2020", "transacaoTeste");
		assertEquals(transacao.getValor(),100);
	}
	
	@Test
	public void testGetData (){
		Caixa transacao = new Caixa (0, 100, "10/10/2020", "transacaoTeste");
		assertEquals(transacao.getData(),"10/10/2020");
	}
	
	@Test
	public void testGetDescricao (){
		Caixa transacao = new Caixa (0, 100, "10/10/2020", "transacaoTeste");
		assertEquals(transacao.getDescricao(),"transacaoTeste");
	}
}
