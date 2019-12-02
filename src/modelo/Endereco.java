package modelo;

public class Endereco  {

	private String estado;
	private String cidade;
	private String cep;
	private String rua;
	private int numero_casa;


	public Endereco(String estado,String cidade,String cep, String rua, int numero_casa) {
		this.estado = estado;
		this.cidade = cidade;
		this.cep = cep;
		this.rua = rua;
		this.numero_casa = numero_casa;
	}
	/*SOBRECARREGANDO O CONSTRUTOR*/
	public Endereco(int numero_casa, String rua) {
		this.numero_casa = numero_casa;
		this.rua = rua;
	}
	public String getEstado() {
		return estado;
	}
	public String getCidade() {
		return cidade;
	}
	public String getCep() {
		return cep;
	}
	public String getRua() {
		return rua;
	}
	public int getNumero_casa() {
		return numero_casa;
	}


}
