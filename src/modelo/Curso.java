package modelo;

public class Curso  {
	private Instrutor instrutor;
	private String disciplinas;
	private int carga_horaria;

	public Curso(Instrutor instrutor, String disciplinas, int carga_horaria){
		this.instrutor = instrutor;
		this.disciplinas = disciplinas;
		this.carga_horaria = carga_horaria;
	}

	public Instrutor getInstrutor() {
		return instrutor;
	}

	public String getDisciplinas() {
		return disciplinas;
	}

	public int getCarga_horaria() {
		return carga_horaria;
	}

}
