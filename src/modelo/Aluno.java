package modelo;
public class Aluno extends Pessoa {

	public Aluno(String nome, String cpf, String rg, Endereco endereco) {
		super(nome,cpf,rg,endereco);
	}

	/*SOBREESCREVENDO O METÓDO GET DE NOME E CPF DA CLASSE PESSOA*/
	public String getNome() {
		return "Nome do aluno: " + super.getNome();
	}

	public String getCpf() {
		return "Cpf do aluno: " + super.getCpf();
	}


}
