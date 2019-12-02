import java.util.Scanner;

import controlador.ControladorAluno;
import modelo.Aluno;
import modelo.Curso;
import modelo.Endereco;
import modelo.Instrutor;
import modelo.Pessoa;

public class Execucao {
	public static void main(String[] args) {
		/*UTILIZANDO CONSTRUTOR QUE S� PEDE N�MERO DA CASA E A RUA*/
		Endereco endereco1 = new Endereco(65, "Tabuleiro");
		Endereco endereco2 = new Endereco(66, "Santa Lúcia");
		Endereco endereco3 = new Endereco(67, "Ponta Verde ");
		Endereco endereco4 = new Endereco(68, "Benedito Bentes");
		Endereco endereco5 = new Endereco(69, "Vergel");

		Instrutor instrutor1 = new Instrutor("Walker", "123.456.789-11","1546598-1", endereco1);
		Instrutor instrutor2 = new Instrutor("Thiago", "124.654.654-98","1234567-1", endereco2);
		Instrutor instrutor3 = new Instrutor("Priscylla", "321.654.987-98-11","1546328-1", endereco3);
		Instrutor instrutor4 = new Instrutor("Gill", "123.456.789-11","3216589-8", endereco4);
		Instrutor instrutor5 = new Instrutor("Lidiane", "456.654.987-98","1568749-2", endereco5);

		Curso curso1 = new Curso(instrutor1, "Doméstica", 40);
		Curso curso2 = new Curso(instrutor2, "Serviços gerais", 80);
		Curso curso3 = new Curso(instrutor3, "Aux. Cozinha", 80);
		Curso curso4 = new Curso(instrutor4, "Cozinheira", 80);
		Curso curso5 = new Curso(instrutor5, "Faxineira", 80);

		/*VARIAV�IS GLOBAIS*/
		String nome;
		String cpf;
		String rg;
		String estado;
		String cidade;
		String cep;
		String rua;
		int numero_casa;
		int opcao;
		Endereco endereco;
		String novoNome;
		int opcao_cursos;

		String nomeInstrutorCurso1 = curso1.getInstrutor().getNome();
		String disciplinaCurso1 = curso1.getDisciplinas();
		int cargaHorariaCurso1 = curso1.getCarga_horaria();

		String nomeInstrutorCurso2 = curso2.getInstrutor().getNome();
		String disciplinaCurso2 = curso2.getDisciplinas();
		int cargaHorariaCurso2 = curso2.getCarga_horaria();

		String nomeInstrutorCurso3 = curso3.getInstrutor().getNome();
		String disciplinaCurso3 = curso3.getDisciplinas();
		int cargaHorariaCurso3 = curso3.getCarga_horaria();


		String nomeInstrutorCurso4 = curso4.getInstrutor().getNome();
		String disciplinaCurso4 = curso4.getDisciplinas();
		int cargaHorariaCurso4 = curso4.getCarga_horaria();

		String nomeInstrutorCurso5 = curso5.getInstrutor().getNome();
		String disciplinaCurso5 = curso5.getDisciplinas();
		int cargaHorariaCurso5 = curso5.getCarga_horaria();


		Scanner ler = new Scanner(System.in);

		ControladorAluno controladorAluno = new ControladorAluno();

		/*VARIAVEL LOCAL*/
		Pessoa aluno;

		do {
			System.out.println("                                                        ");
			System.out.println("*************************MENU***************************");
			System.out.println("                                                        ");
			System.out.println("Digite 1 para cadastrar.------------------");
			System.out.println("Digite 2 para atualizar.------------------");
			System.out.println("Digite 3 para deletar.--------------------");
			System.out.println("Digite 5 para listar.---------------------");	
			System.out.println("Digite 6 para sair do programa.-----------");
			opcao = ler.nextInt();
			ler.nextLine();
			switch(opcao) {
			case 1:
				System.out.println("Seja bem vindo, realize seu cadastro");
				System.out.println("Informe seu nome: ");
				nome = ler.nextLine();
				System.out.println("Informe seu cpf: ");
				cpf = ler.nextLine();
				while(controladorAluno.verificarCpfExiste(cpf)) {
					System.out.println("Cpf já existente! Porfavor digite outro.");
					cpf = ler.nextLine();
				}
				System.out.println("Informe seu rg: ");
				rg = ler.nextLine();
				System.out.println("Informe seu estado: ");
				estado = ler.nextLine();
				System.out.println("Informe sua cidade: ");
				cidade = ler.nextLine();
				System.out.println("Informe seu cep: ");
				cep = ler.nextLine();
				System.out.println("Informe sua rua: ");
				rua = ler.nextLine();
				System.out.println("Informe o número da casa: ");
				numero_casa = ler.nextInt();

				/*VARIAVEL ALUNO VIRA UM OBJETO ALUNO POR SER INSTANCIADA E UTILIZANDO CONSTRUTOR*/
				endereco = new Endereco(estado,cidade,cep,rua,numero_casa);
				aluno = new Aluno(nome,cpf,rg,endereco);
				/*CADASTRANDO ALUNO*/   /*POLIMORFISMO DE TIPO: CONVERTENDO VARIAVEL DO TIPO PESSOA PARA
				 * O TIPO ALUNO (CASTING)*/
				controladorAluno.cadastrarAluno((Aluno)aluno);
				System.out.println("Escolha seu curso");
				System.out.println("###################CURSOS###################");
				System.out.println("1: Doméstica");
				System.out.println("2: Serviços gerais");
				System.out.println("3: Aux. cozinha");
				System.out.println("4: Cozinheira");
				System.out.println("5: Faxineira");
				System.out.println("6: Informações de cursos");
				opcao_cursos = ler.nextInt();
				if(opcao_cursos == 1) {
					System.out.println("Curso escolhido: Doméstica");
				}
				if(opcao_cursos == 2) {
					System.out.println("Curso escolhido: Serviços gerais");
				}
				if(opcao_cursos == 3) {
					System.out.println("Curso escolhido: Aux. cozinha");
				}
				if(opcao_cursos == 4) {
					System.out.println("Curso escolhido: Cozinheira");
				}
				if(opcao_cursos == 5) {
					System.out.println("Curso escolhido: Faxineira");
				}

				if(opcao_cursos == 6) {
					System.out.println("Instrutor: " + nomeInstrutorCurso1 + ": "+ 
							disciplinaCurso1  + " -> " + cargaHorariaCurso1 + " " + " \n"
							+ " Instrutor: " + nomeInstrutorCurso2 + ": " 
							+ disciplinaCurso2 + " -> " + " " + cargaHorariaCurso2 + " \n Instrutor: "
							+ nomeInstrutorCurso3 + ": " 
							+ disciplinaCurso3 + " -> " + cargaHorariaCurso3 + " -> " + " \n Instrutor: " 
							+ nomeInstrutorCurso4 + ": " +
							disciplinaCurso4 + " -> "
							+ cargaHorariaCurso4 + " " + " \n Instrutor: " + nomeInstrutorCurso5
							+ ": " + disciplinaCurso5 + " -> " + cargaHorariaCurso5);
				}

				break;
			case 2:
				System.out.println("Atualização de cadastro");
				System.out.println("Digite o cpf do aluno que voc� deseja atualizar:");
				cpf = ler.nextLine();
				System.out.println("Digite o nome do novo aluno:");
				novoNome = ler.nextLine();
				controladorAluno.atualizarCadastro(cpf, novoNome);
				break;
			case 3:
				System.out.println("Digite o cpf do aluno que voc� deseja deletar:");
				cpf = ler.nextLine();
				controladorAluno.deletarAluno(cpf);
				break;
			case 4:
				System.out.println("Digite o cpf do aluno que voc� deseja buscar:");
				cpf = ler.nextLine();
				controladorAluno.buscarAluno(cpf);
				break;

			case 5:
				System.out.println("lista de alunos");
				/*LISTANDO ALUNO*/
				controladorAluno.listarAlunos();
				break;
			}

		}
		while(opcao!=6) ;

		ler.close();
	}
}
