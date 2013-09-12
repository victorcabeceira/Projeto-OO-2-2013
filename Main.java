package sistemaDrogaria;

import sistemaDrogaria.caixa.Caixa;
import sistemaDrogaria.medicamentos.Medicamento;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {

		//Criando e cadastrando um medicamento
		Medicamento medicamento = new Medicamento();
		medicamento.cadastrarMedicamento("NomeTeste", "LaboratorioTeste", "Adulto", "Comprimido", "10/10/2020");

		//Criando e cadastrando uma transacao
		Caixa caixa = new Caixa(1, 100, "10/10/2020", "transacaoTeste");

		//Imprimindo no console as informacoes
		System.out.println("Nome: " + medicamento.getNome());
		System.out.println("Laboratorio: " + medicamento.getLaboratorio());
		System.out.println("Recomendação: " + medicamento.getRecomendacao());
		System.out.println("Tipo: " + medicamento.getTipo());
		System.out.println("Validade: " + medicamento.getValidade());

		System.out.println("\nTipo da transação:" + caixa.getTipo());
		System.out.printf("Valor da transação: R$ %.2f\n", caixa.getValor());
		System.out.println("Data da transação: " + caixa.getData());
		System.out.println("Descrição: " + caixa.getDescricao());
		System.out.println("Saldo atual: " + caixa.getSaldoAtual());
		
		caixa.depositar (150);
		System.out.println("\nSaldo atual: " + caixa.getSaldoAtual());

	}
}