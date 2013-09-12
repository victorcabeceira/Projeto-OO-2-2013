package sistemadrogaria.entidades;

public class Caixa {
	private float saldoAtual = 0;
	private int tipo; // 0-Receita ou 1-Despesa
	private float valor;
	private String data;
	private String descricao; // Informação acerca da transação. Medicamentos,
								// salário de funcionarios, etc.

	public Caixa() {
		this.saldoAtual = 0;
		this.tipo = 0;
		this.valor = 0;
		this.data = "Default";
		this.descricao = "Default";
	}

	public Caixa(int tipo, float valor, String data, String descricao) {
		if (tipo == 0 || tipo == 1) {
			this.tipo = tipo;
			this.valor = valor;
			this.data = data;
			this.descricao = descricao;
		}
		else {
			System.out.println("Caixa nao cadastrado com sucesso.");
		}
	}

	// Método depositar
	public void depositar(float valor) {
		System.out.println("Valor do saldo atual: " + saldoAtual);
		saldoAtual += valor;
		System.out.println("Valor após o depósito: " + saldoAtual);
	}

	// Especificando métodos get and set.
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(float saldoAtual) {
		this.saldoAtual = saldoAtual;
	}
}