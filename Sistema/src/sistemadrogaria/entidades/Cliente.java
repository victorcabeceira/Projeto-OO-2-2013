package sistemadrogaria.entidades;

public class Cliente {
	
	private String nome;
	private String sobrenome;
	private String telefone;
	private String endereco;
	private String email;
	private int idade;
	private String rg;
	private String cpf;

	public Cliente (String nomeCliente, String sobrenomeCliente, int idadeCliente) {
		
		this.nome = nomeCliente;
		this.sobrenome = sobrenomeCliente;
		this.idade = idadeCliente;
		
	}
	
	
    //Método que cadastra o cliente na Drogaria
	public void cadastrarCliente (String cadastroNome, String cadastroSobrenome, String cadastroTelefone, String cadastroEndereco, String cadastroEmail, int cadastroIdade, String cadastroRg, String cadastroCpf) {
		
		this.nome = cadastroNome;
		this.sobrenome = cadastroSobrenome;
		this.telefone = cadastroTelefone;
		this.endereco = cadastroEndereco;
		this.email = cadastroEmail;
		this.idade = cadastroIdade;
		this.rg = cadastroRg;
		this.cpf = cadastroCpf;
		
		boolean validacaoIdade = this.validarCliente(cadastroIdade);
		if(validacaoIdade == true) {
			System.out.println("Cliente cadastrado no sistema com Sucesso!");
		}
		else{
			System.out.println("Cliente não cadastrado no sistema! Ele(a) possui idade inferior a 18 anos");
						
		}
	}
	
	private boolean validarCliente (int cadastroIdade){
		boolean validacao;
		if(cadastroIdade < 18 || cadastroIdade > 99) //Idade mínima para cadastrar = 18 anos.
		{
			validacao = false;
		}
		else
		{
			validacao = true;
		}
		
			return validacao;
	}
	
	
	
	
	
	//Gets e Sets
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public static void main(String[] args) {
		

	}

}
