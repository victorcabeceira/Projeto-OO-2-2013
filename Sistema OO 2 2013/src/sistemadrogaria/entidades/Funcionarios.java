package sistemadrogaria.entidades;

public class Funcionarios {

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
	
	
	public Funcionarios(int digitoCpfFunc, int senhaFunc, int senhaFarmPopFunc, int codFunc,int fatorComFunc, String nomeFunc, String sobrenomeFunc)
	{
		//
		this.digitoCpf = digitoCpfFunc;
		this.senha = senhaFunc;
		this.senhaFarmaciaPopular = senhaFarmPopFunc;
		this.codigo = codFunc;
		this.fatorComissao = fatorComFunc;
		this.nome = nomeFunc;
		this.sobrenome = sobrenomeFunc;
	}
	
	public void cadastrarFuncionarios(String rgFunc, String cpfFunc,int digitoCpfFunc, int senhaFunc, int senhaFarmPopFunc, int codFunc, int fatorComFunc, String nomeFunc, String sobrenomeFunc, String enderecoFunc, String telefoneFunc) 
	{
		// TODO Auto-generated constructor stub
		
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

		
		boolean validacaoDigitoCpf = this.validarFunc2(digitoCpfFunc);
				if(validacaoDigitoCpf == true)
				{
					System.out.println("Funcionário cadastrado com sucesso!");
				}
				else
				{
					System.out.println("Funcionário não cadastrado!");
				}
	}
		
		private boolean validarFunc2(int digitoCpfFunc)
		{
			boolean validar2;
			if(digitoCpfFunc > 99)
			{
				validar2 = false;
			}
			else
			{
				validar2 = true;
			}
			
				return validar2;
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
	

