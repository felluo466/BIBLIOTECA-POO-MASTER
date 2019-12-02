package modelo;

public abstract class  Pessoa {
	/*AGREGA��O: "ATRIBUTO ENDERE�O DA CLASSE ENDERE�O"*/
	private String nome;
	private String cpf;
	private String rg;
	private Endereco endereco;

	public Pessoa(String nome, String cpf, String rg, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getRg() {
		return rg;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
