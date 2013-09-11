package sistemadrogaria.entidades;

public class Funcionario {

	//Declaracao de atributos
	private String rg;
	private String cpf;
	private int digitoCpf;
	private int senha;
	private int senhaFarmaciaPopular;
	private int codigo; //O funcionario usa o codigo de acesso junto da senha para fazer as vendas
	private int fatorComissao;
	private String nome;
	private String sobrenome;
	private String endereco;
	private String telefone;
	
	
	public Funcionario(int digitoCpfFunc, int senhaFunc, int senhaFarmPopFunc, int codFunc,int fatorComFunc, String nomeFunc, String sobrenomeFunc)
	{
		this.digitoCpf = digitoCpfFunc;
		this.senha = senhaFunc;
		this.senhaFarmaciaPopular = senhaFarmPopFunc;
		this.codigo = codFunc;
		this.fatorComissao = fatorComFunc;
		this.nome = nomeFunc;
		this.sobrenome = sobrenomeFunc;
	}
	
	public void cadastrarFuncionario(String rgFunc, String cpfFunc,int digitoCpfFunc, int senhaFunc, int senhaFarmPopFunc, int codFunc, int fatorComFunc, String nomeFunc, String sobrenomeFunc, String enderecoFunc, String telefoneFunc) 
	{
		this.rg = rgFunc;
		this.cpf = cpfFunc;
		this.digitoCpf = digitoCpfFunc;
		this.senha = senhaFunc;
		this.senhaFarmaciaPopular = senhaFarmPopFunc;
		this.codigo = codFunc;
		this.fatorComissao = fatorComFunc;
		this.nome = nomeFunc;
		this.sobrenome = sobrenomeFunc;
		this.endereco = enderecoFunc;
		this.telefone = telefoneFunc;

		//Validacao do Digito de cpf, que é feito a partir dos 2 dígitos finais (não foi implementado)
		boolean validacaoDigitoCpf = this.validarFunc(digitoCpfFunc);
				if(validacaoDigitoCpf == true)
				{
					System.out.println("Funcionário cadastrado com sucesso!");
				}
				else
				{
					System.out.println("Funcionário não cadastrado!");
				}
	}
		//Função para validacão do dígito de Cpf
		private boolean validarFunc(int digitoCpfFunc)
		{
			boolean validar1;
			if(digitoCpfFunc > 99)
			{
				validar1 = false;
			}
			else
			{
				validar1 = true;
			}
			
				return validar1;
		}
		

	public int getDigitoCpf() {
		return digitoCpf;
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

	public void setDigitoCpf(int digitoCpf) {
		this.digitoCpf = digitoCpf;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getSenhaFarmaciaPopular() {
		return senhaFarmaciaPopular;
	}

	public void setSenhaFarmaciaPopular(int senhaFarmaciaPopular) {
		this.senhaFarmaciaPopular = senhaFarmaciaPopular;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getFatorComissao() {
		return fatorComissao;
	}

	public void setFatorComissao(int fatorComissao) {
		this.fatorComissao = fatorComissao;
	}

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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
	

