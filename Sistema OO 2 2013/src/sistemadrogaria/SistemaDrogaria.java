package sistemadrogaria;

import sistemadrogaria.entidades.Funcionarios;

public class SistemaDrogaria {

	public SistemaDrogaria() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instanciando um objeto da classe dos funcionarios
		Funcionarios funcionarioDrogaria = new Funcionarios(2,4444,3232,15,5,"Victor","Fellipe");
		funcionarioDrogaria.cadastrarFuncionarios("84848484","123456789",50,4444,5555,2,3,"Victor", "Fellipe", "Shces qd 1000 bloco x", "(61) - 82252227");
		
		//Declarando atributos
		String rgFuncDrogaria; String cpfFuncDrogaria; String nomeFuncDrogaria; String sobrenomeFuncDrogaria; String enderecoFuncDrogaria; String telefoneFuncDrogaria;
		int digitoCpfFuncDrogaria; int senhaFuncDrogaria; int codigoFuncDrogaria; int fatorComissaoFuncDrogaria;
			
		//Instanciando
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
		
		System.out.println("O RG do funcionário é: " + rgFuncDrogaria);
		System.out.println("O CPF do funcionario é: " + cpfFuncDrogaria + "-" + digitoCpfFuncDrogaria);
		System.out.println("A senha do funcionario é: " + senhaFuncDrogaria + ". Seu codigo é: " + codigoFuncDrogaria + ". E seu fator de comissao é de: " + fatorComissaoFuncDrogaria + " %");
		System.out.println("Nome do funcionario: " + nomeFuncDrogaria + sobrenomeFuncDrogaria + ".Endereco: " + enderecoFuncDrogaria + ".Telefone: " + telefoneFuncDrogaria);
	}

}
