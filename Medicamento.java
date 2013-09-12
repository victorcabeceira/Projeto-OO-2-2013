package sistemaDrogaria.medicamentos;

public class Medicamento {
	private String nomeMedicamento;
	private String laboratorio;
	private String recomendacao; //uso adulto ou não?
	private String tipoMedicamento; //Comprimidos ou líquidos, etc...
	private String validadeMedicamento;
	//private String posologia
	
	//Construtor sem parâmetros
	public Medicamento (){
		this.nomeMedicamento = "Default";
		this.laboratorio = "Default";
		this.recomendacao = "Default";
		this.tipoMedicamento = "Default";
		this.validadeMedicamento = "Default";	
	}
	
	//Construtor com 5 parâmetros
	public Medicamento(String nome, String laboratorio, String recomendacao, String tipo, String validade) {
		this.nomeMedicamento = nome;
		this.laboratorio = laboratorio;
		this.recomendacao = recomendacao;
		this.tipoMedicamento = tipo;
		this.validadeMedicamento = validade;
	}
	
	//Especificando método cadastrarMedicamento
	public void cadastrarMedicamento (String nome, String laboratorio, String recomendacao, String tipo, String validade){
		this.nomeMedicamento = nome;
		this.laboratorio = laboratorio;
		this.recomendacao = recomendacao;
		this.tipoMedicamento = tipo;
		this.validadeMedicamento = validade;	
		
		/**
		 * Validar primeira letra da String nome
		 * Validar validade (dia<=31, mes<=12, ano<=2013
		 * Validar tipo, entrará APENAS comprimido ou líquidos?
		 */
	}
	
	//Especificando métodos get e set
	public String getNome() {
		return nomeMedicamento;
	}


	public void setNome(String nome) {
		this.nomeMedicamento = nome;
	}


	public String getLaboratorio() {
		return laboratorio;
	}


	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}


	public String getRecomendacao() {
		return recomendacao;
	}


	public void setRecomendacao(String recomendacao) {
		this.recomendacao = recomendacao;
	}


	public String getTipo() {
		return tipoMedicamento;
	}


	public void setTipo(String tipo) {
		this.tipoMedicamento = tipo;
	}


	public String getValidade() {
		return validadeMedicamento;
	}


	public void setValidade(String validade) {
		this.validadeMedicamento = validade;
	}
}