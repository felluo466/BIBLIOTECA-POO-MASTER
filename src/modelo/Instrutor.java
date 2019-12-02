package modelo;
public class Instrutor extends Pessoa {


	private String disciplina;

	/*SOBRECARREGANDO CONSTRUTORES*/
	public Instrutor(String nome, String cpf, String rg, Endereco endereco) {
		super(nome,cpf,rg,endereco);
	}

	public Instrutor(String nome, String cpf, String rg, Endereco endereco, String disciplina) {
		super(nome,cpf,rg,endereco);
		this.disciplina = disciplina;
	}

	public String getDisciplina() {
		return disciplina;
	}


}
