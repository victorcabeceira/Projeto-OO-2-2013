package sistemaacademico;

import sistemaacademico.entidades.Aluno;

public class SistemaAcademico {

	public SistemaAcademico() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * construtor!
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Sempre mandar criar automaticamente a main!
		 * */
		
		//Instanciando um objeto aluno da Classe Aluno
		Aluno alunoFGA = new Aluno(1001, "Maria", "da Silva", "mariadasilva@unb.br");
		alunoFGA.cadastrarAluno(1001, "Maria", "da Silva", "Setor Leste", "3355844", "emailAluno@unb.br");
		String enderecoAlunoFGA;
		enderecoAlunoFGA = alunoFGA.getEndereco();
		System.out.println("O endereço do aluno cadastrado no Sistema Academico é:" + enderecoAlunoFGA);
	}

}
