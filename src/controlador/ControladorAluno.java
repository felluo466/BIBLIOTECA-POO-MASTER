package controlador;

import java.util.ArrayList;

import modelo.Aluno;

public class ControladorAluno {
	/*Criando o ArrayList (lista) de alunos*/
	ArrayList<Aluno> listaAlunos;

	public ControladorAluno() {
		listaAlunos = new ArrayList<>();
	}
	/*ADICIONANDO UMA REFERÊNCIA DO OBJETO ALUNO QUE ESTÁ NA CLASSE EXECUCAO NA LISTA DE ALUNOS*/
	public void cadastrarAluno(Aluno aluno) {
		listaAlunos.add(aluno);
		System.out.println("Aluno cadastrado com sucesso!");
	}

	public void listarAlunos() {
		/*FOR EACH PARA PERCORRER A LISTA DE ALUNOS*/
		for(Aluno aluno: listaAlunos) {
			System.out.println(aluno.getNome());
			System.out.println(aluno.getCpf());
			System.out.println("Rg: " + aluno.getRg());
			System.out.println("Endereço: \nestado: " + aluno.getEndereco().getEstado() + "\nRua: " + aluno.getEndereco().getRua()
					+ "\nCidade: " + aluno.getEndereco().getCidade() + "\nCep: " + aluno.getEndereco().getCep());
			System.out.println("Numero da casa: " + aluno.getEndereco().getNumero_casa());
			System.out.println("---------------------------------");
		}
	}

	public void atualizarCadastro(String cpf, String novoNome) {
		for(Aluno aluno: listaAlunos) {
			/*ATUALIZANDO CADASTRO DE ALUNO QUANDO O CPF DIGITADO POR PARÂMETRO FOR O MESMO DE ALGUÉM QUE JÁ FOI CADASTRADO*/
			if(aluno.getCpf().contains(cpf)) {
				aluno.setNome(novoNome);	
			}

		}
	}

	public void deletarAluno(String cpf) {
		for(int i = 0; i < listaAlunos.size(); i++) {
			if(listaAlunos.get(i).getCpf().contains(cpf)) {
				listaAlunos.remove(i);
				System.out.println("Deletado com sucesso!!!");
			}
		}
	}

	public void buscarAluno(String cpf) {
		for(Aluno aluno: listaAlunos) {
			if(aluno.getCpf().equals(cpf)) {
				System.out.println("Nome :" + aluno.getNome());
				System.out.println("Cpf :" + aluno.getCpf());
				System.out.println("Rg :" + aluno.getRg());
			}
		}
	}

	public boolean verificarCpfExiste(String cpf) {
		for(Aluno aluno: listaAlunos) {
			if(aluno.getCpf().contains(cpf)) {
				return true;
			}
		}
		return false;
	}
}
