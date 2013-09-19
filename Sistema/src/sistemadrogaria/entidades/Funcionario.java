package sistemadrogaria.entidades;

public class Funcionario {

	//Declaracao de atributos
	private String rg;
	private String cpf;
	private int digitoCpf;
	private int senha;
	private int senhaFarmaciaPopular;
	private int codigo; //O funcionario usa o codigo de acesso junto da senha para fazer as vendas.
	private int fatorComissao;
	private String nome;
	private String sobrenome;
	private String endereco;
	private String telefone;
	Medicamento[] medicamentos = {}; //V�rios medicamentos para 1 funcion�rio
	public static int contador = 0; //Dependencia
	
 
	
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
		
		contador++;
				 //Dependencia, quando criado o funcionario, este pode ser o funcionario do caixa
		//Validacao do Digito de cpf, que � feito a partir dos 2 d�gitos finais (n�o foi implementado)
		boolean validacaoDigitoCpf = this.validarFunc(digitoCpfFunc);
				if(validacaoDigitoCpf == true)
				{
					System.out.println("Funcion�rio cadastrado com sucesso!");
				}
				else
				{
					System.out.println("Funcion�rio n�o cadastrado!");
				}
				
				
				
	}
	
		//Fun��o para validac�o do d�gito de Cpf
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
		
		//Aperfei�oando o m�todo setMedicamentos(Medicamento[] medicamentos)
		//O medicamento deve ser vendido por no m�nimo 1 funcion�rio cadastrado no sistema, caso contr�rio houve alguma irregularidade.
		public void setMedicamentos(Medicamento[] medicamentos) {
			if(medicamentos.length < 1){
				System.out.println("O medicamento n�o pode ser vendido sem a identifica��o de 1 funcion�rio cadastrado no Sistema! O medicamento s� poder� ser comercializado por no m�nimo 1 funcion�rio devidamente cadastrado para evitar alguma irregularidade!");
			}
			else {
				this.medicamentos = medicamentos;
			}
		}
		
		public void verificarMedicamento(Medicamento medicamento){
			int tamanhoAntigo = this.medicamentos.length;
			
			Medicamento[] novosMedicamentos = new Medicamento[tamanhoAntigo + 1];
			for(int i=0; i < tamanhoAntigo; i++){
				novosMedicamentos[i] = this.medicamentos[i];
				
			}
			
			novosMedicamentos[novosMedicamentos.length-1] = medicamento;
			this.setMedicamentos(novosMedicamentos);
			
		}
		
		//Listar n�mero de medicamentos associados aos funcion�rios
		public void listarMedicamentosAssociados(){
			System.out.println("O n�mero de medicamentos vendidos por funcion�rio �: ;");
			for(int i=0; (i < medicamentos.length); i++){
				System.out.println(medicamentos[i].nome);
			}
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

		
	
	public Medicamento[] getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(Medicamento[] medicamentos) {
		this.medicamentos = medicamentos;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}





