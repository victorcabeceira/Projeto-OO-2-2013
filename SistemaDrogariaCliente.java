package sistemadrogariacliente;

public class SistemaDrogariaCliente {

	public SistemaDrogariaCliente() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Instanciando um objeto da classe dos clientes
		Cliente novoCliente = new Cliente("Henrique", "Augusto", 9999);
	    novoCliente.cadastrarCliente("Henrique","Augusto",8137-4609, "Residencial Santos Dumont", "henriqueaps2003@hotmail.com", 21, 1234, 9999);
		
	    String nomeCliente;
	    String sobrenomeCliente;
	    String telefoneCliente;
	    String enderecoCliente;
	    String emailCliente;
		int idadeCliente;
		String rgCliente;
		String cpfCliente;
	
		
		nomeCliente = novoCliente.getNome();
		sobrenomeCliente = novoCliente.getSobrenome();
		telefoneCliente = novoCliente.getTelefone();
		enderecoCliente = novoCliente.getEndereco();
		emailCliente = novoCliente.getEmail();
		idadeCliente = novoCliente.getIdade();
		rgCliente = novoCliente.getRg();
		cpfCliente = novoCliente.getCpf();
		
		
		
		System.out.println("Nome e sobrenome do Cliente cadastrado: " + nomeCliente + sobrenomeCliente + ".Endereco: " + enderecoCliente + ".Telefone: " + telefoneCliente);
		System.out.println("O RG do Cliente cadastrado é: " + rgCliente);
		System.out.println("O CPF do Cliente cadastrado é: " + cpfCliente);
		System.out.println("A idade do Cliente cadastrado é: " + idadeCliente);
		System.out.println("O email do Cliente cadastrado é: " + emailCliente);
		
	}


	}

}
