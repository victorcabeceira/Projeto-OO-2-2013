package sistemadrogaria;

import sistemadrogaria.entidades.Caixa;
import sistemadrogaria.entidades.Funcionario;
import sistemadrogaria.entidades.Medicamento;
import sistemadrogaria.entidades.Cliente;

public class SistemaDrogaria {

	public SistemaDrogaria() {
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instanciando um objeto da classe dos funcionarios.
		Funcionario funcionarioDrogaria = new Funcionario(2,4444,3232,15,5,"Victor","Fellipe");
		funcionarioDrogaria.cadastrarFuncionario("84848484","123456789",50,4444,5555,2,3,"Victor", "Fellipe", "Shces qd 1000 bloco x", "(61) - 82252227");
		
		//Instanciando um objeto da classe dos clientes
		Cliente novoCliente = new Cliente("Henrique", "Augusto", 9999);
	    novoCliente.cadastrarCliente("Henrique","Augusto","8137-4609", "Residencial Santos Dumont", "henriqueaps2003@hotmail.com", 21, "1234", "9999");
	    
		//Criando e cadastrando um medicamento
		Medicamento medicamento = new Medicamento();
		medicamento.cadastrarMedicamento("NomeTeste", "LaboratorioTeste", "Adulto", "Comprimido", "10/10/2020");
		
		//Criando e cadastrando uma transacao do caixa
		Caixa caixa = new Caixa(1, 100, "10/10/2020", "transacaoTeste");
		
		//Declarando atributos Funcionarios
		String rgFuncDrogaria; String cpfFuncDrogaria; String nomeFuncDrogaria; String sobrenomeFuncDrogaria; String enderecoFuncDrogaria; String telefoneFuncDrogaria;
		int digitoCpfFuncDrogaria; int senhaFuncDrogaria; int codigoFuncDrogaria; int fatorComissaoFuncDrogaria;
		//Declarando atributos Funcionarios Clientes
		String nomeCliente; String sobrenomeCliente; String telefoneCliente; String enderecoCliente; String emailCliente; int idadeCliente; String rgCliente; String cpfCliente;
		
		//Instanciando Funcionarios
		rgFuncDrogaria = funcionarioDrogaria.getRg();
		cpfFuncDrogaria = funcionarioDrogaria.getCpf();
		digitoCpfFuncDrogaria = funcionarioDrogaria.getDigitoCpf();
		senhaFuncDrogaria = funcionarioDrogaria.getSenha();
		codigoFuncDrogaria = funcionarioDrogaria.getCodigo();
		fatorComissaoFuncDrogaria = funcionarioDrogaria.getFatorComissao();
		nomeFuncDrogaria = funcionarioDrogaria.getNome();
		sobrenomeFuncDrogaria = funcionarioDrogaria.getSobrenome();
		enderecoFuncDrogaria = funcionarioDrogaria.getEndereco();
		telefoneFuncDrogaria = funcionarioDrogaria.getTelefone();
		
		//Instanciando Clientes
		nomeCliente = novoCliente.getNome();
		sobrenomeCliente = novoCliente.getSobrenome();
		telefoneCliente = novoCliente.getTelefone();
		enderecoCliente = novoCliente.getEndereco();
		emailCliente = novoCliente.getEmail();
		idadeCliente = novoCliente.getIdade();
		rgCliente = novoCliente.getRg();
		cpfCliente = novoCliente.getCpf();
	
		//Imprimindo no console as informa��es do Funcion�rio
		System.out.println("O RG do funcion�rio �: " + rgFuncDrogaria);
		System.out.println("O CPF do funcionario �: " + cpfFuncDrogaria + "-" + digitoCpfFuncDrogaria);
		System.out.println("A senha do funcionario �: " + senhaFuncDrogaria + ". Seu codigo �: " + codigoFuncDrogaria + ". E seu fator de comissao � de: " + fatorComissaoFuncDrogaria + " %");
		System.out.println("Nome do funcionario: " + nomeFuncDrogaria + sobrenomeFuncDrogaria + ".Endereco: " + enderecoFuncDrogaria + ".Telefone: " + telefoneFuncDrogaria);
	
		//Imprimindo no console as informa��es do Cliente
		System.out.println("Nome e sobrenome do Cliente cadastrado: " + nomeCliente + sobrenomeCliente + ".Endereco: " + enderecoCliente + ".Telefone: " + telefoneCliente);
		System.out.println("O RG do Cliente cadastrado �: " + rgCliente);
		System.out.println("O CPF do Cliente cadastrado �: " + cpfCliente);
		System.out.println("A idade do Cliente cadastrado �: " + idadeCliente);
		System.out.println("O email do Cliente cadastrado �: " + emailCliente);
		
		//Imprimindo no console as informac�es de Medicamento
		System.out.println("Nome do medicamento: " + medicamento.getNome());
		System.out.println("Laboratorio fabricante: " + medicamento.getLaboratorio());
		System.out.println("Recomenda��o: " + medicamento.getRecomendacao());
		System.out.println("Tipo: " + medicamento.getTipo());
		System.out.println("Validade: " + medicamento.getValidade());

		//Imprimindo no console as informa��es do Caixa
		System.out.println("\nTipo da transa��o:" + caixa.getTipo());
		System.out.printf("Valor da transa��o: R$ %.2f\n", caixa.getValor());
		System.out.println("Data da transa��o: " + caixa.getData());
		System.out.println("Descri��o: " + caixa.getDescricao());
		System.out.println("Saldo atual: " + caixa.getSaldoAtual());	
		caixa.depositar (150);
		System.out.println("\nSaldo atual: " + caixa.getSaldoAtual());
	
	}

}
