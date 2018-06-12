package br.com.aeroclube;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

import br.com.aeroclube.pojos.Aluno;
import br.com.aeroclube.pojos.Instrutor;
import br.com.aeroclube.pojos.Piloto;

public class Main {

	static List<Aluno> alunos = new ArrayList<Aluno>(0);
	static List<Piloto> pilotos = new ArrayList<Piloto>(0);
	static List<Instrutor> instrutores = new ArrayList<Instrutor>(0);
	static SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	
	static final String ZEROS = "00000";
	
	
	public static void main(String[] args) {
		
		System.out.println ("### Bem vindo ao controle do aeroclube! ###\n");
		
		Scanner in = new Scanner(System.in);
		int opcao = 0;
		
		while (opcao != 9) {
			mostrarMenu();
		   try {
		      opcao = Integer.parseInt(in.nextLine());
		      processarOpcao(opcao, in);
		   } catch (NumberFormatException e) {
		      System.out.println("Opção inválida!");
		      opcao = -1;
		   }   
		}
	}
	
	private static void mostrarMenu() {
		 System.out.println("Menu de opções: \n");
		 System.out.println("* Cadastro: ");
		 System.out.println ("1-     Aluno.");
		 System.out.println ("2-     Piloto.");
		 System.out.println ("3-     Instrutor.");
		 System.out.println("* Listar: ");
		 System.out.println ("4-     Alunos.");
		 System.out.println ("5-     Pilotos.");
		 System.out.println ("6-     Instrutores.");
		 System.out.println(" ");
		 System.out.println ("9-     Para sair.");
	}
	
	private static void processarOpcao(int opcao, Scanner in) {
		switch (opcao) {
		case 1:
			cadastrarAluno(in);
			break;
		case 2:
			cadastrarPiloto(in);
			break;
		case 3:
			cadastrarInstrutor(in);
			break;	
		case 4:
			printAlunos();
		case 5: 
			printPiloto();
		case 6:
			printInstrutores();
		default:
			break;
		}
	}
	
	
	private static void printAlunos() {
		if(alunos.size()> 0){
			System.out.println("## Alunos Cadastrados ##");
			System.out.println("");
			System.out.println("--------------------------------------------------------------------------------------------");
			for (Aluno aluno : alunos) {
				System.out.println("Matrícula: " + aluno.getMatricula());
				System.out.println("Nome: " + aluno.getNome());
				System.out.println("Idade: " + aluno.getIdade());
				System.out.println("Endereço: "+ aluno.getEndereco());
				System.out.println("--------------------------------------------------------------------------------------------");
			}
		}
	}
	
	private static void printInstrutores() {
		if(instrutores.size()> 0){
			System.out.println("## Instrutores Cadastrados ##");
			System.out.println("");
			
			for (Instrutor instrutor : instrutores) {
				System.out.println("--------------------------------------------------------------------------------------------");
				System.out.println("Matrícula: " + instrutor.getMatricula());
				System.out.println("Nome: " + instrutor.getNome());
				System.out.println("Idade: " + instrutor.getIdade());
				System.out.println("Nome do curso: "+ instrutor.getNomeCurso());
				System.out.println("Data do diploma: "+ format.format(instrutor.getDataDiploma()));
				System.out.println("Instituição do Curso: "+ instrutor.getInstituicaoCurso());
				System.out.println("--------------------------------------------------------------------------------------------");
			}
		}
	}
	
	private static void printPiloto() {
		if(pilotos.size()> 0){
			System.out.println("## Pilotos Cadastrados ##");
			System.out.println("");
			
			for (Piloto piloto : pilotos) {
				System.out.println("--------------------------------------------------------------------------------------------");
				System.out.println("Matrícula: " + piloto.getMatricula());
				System.out.println("Nome: " + piloto.getNome());
				System.out.println("Idade: " + piloto.getIdade());
				System.out.println("Brevê: "+ piloto.getBreve());
				System.out.println("--------------------------------------------------------------------------------------------");
			}
		}
	}
	
	private static void cadastrarAluno(Scanner in) {
		
		System.out.println();
		System.out.println("-> Dados do Aluno");
		
		Aluno aluno = new Aluno();
		System.out.println("--------------------------------------------------------------------------------------------");
		aluno.setMatricula(geradorDeMatricula());
		System.out.print("Nome: ");
		aluno.setNome(in.nextLine());
		System.out.print("Endereço: ");
		aluno.setEndereco(in.nextLine());
		System.out.print("Idade: ");
		aluno.setIdade(in.nextInt());
		alunos.add(aluno);

		in.nextLine();
		System.out.println("--------------------------------------------------------------------------------------------");
	}

	private static void cadastrarPiloto(Scanner in) {
		System.out.println("-> Dados do piloto");
		
		Piloto piloto = new Piloto();
		System.out.println("--------------------------------------------------------------------------------------------");
		piloto.setMatricula(geradorDeMatricula());
		System.out.print("Nome: ");
		piloto.setNome(in.nextLine());
		System.out.print("Endereço: ");
		piloto.setEndereco(in.nextLine());
		System.out.print("Idade: ");
		piloto.setIdade(in.nextInt());
		System.out.print("Numero do Breve: ");
		piloto.setBreve(in.nextInt());
		System.out.print(piloto);
		pilotos.add(piloto);
		
		in.nextLine();
		System.out.println("--------------------------------------------------------------------------------------------");
	}

	private static void cadastrarInstrutor(Scanner in) {
		System.out.println();
		System.out.println("-> Dados do Instrutor");
		
		Instrutor instrutor = new Instrutor();
		System.out.println("--------------------------------------------------------------------------------------------");
		instrutor.setMatricula(geradorDeMatriculaInstrutor());
		System.out.print("Nome: ");
		instrutor.setNome(in.nextLine());
		System.out.print("Endereço: ");
		instrutor.setEndereco(in.nextLine());
		System.out.print("Instituição do curso: ");
		instrutor.setInstituicaoCurso(in.nextLine());
		System.out.print("Nome do Curso: ");
		instrutor.setNomeCurso(in.nextLine());
		System.out.print("Data do diploma (ex: 99/99/9999): ");
		instrutor.setDataDiploma(getData(in.nextLine()));
		System.out.print("Idade: ");
		instrutor.setIdade(in.nextInt());
		instrutores.add(instrutor);
		
		in.nextLine();
		System.out.println("--------------------------------------------------------------------------------------------");
	}

	private static Date getData(String nextLine) {
		if (nextLine != null){
			String data [] = nextLine.split("/");
			
			int mes = Integer.valueOf(data[1]) - 1;
			Calendar calendar = new GregorianCalendar(Integer.valueOf(data[2]), mes, Integer.valueOf(data[0]));
			return calendar.getTime();
		}
		return null;
	}
	
	private static String geradorDeMatricula(){
		String s = String.valueOf(alunos.size()+1);
		return getAnoAtual() + ZEROS.substring(s.length()) + s;
	}
	private static String geradorDeMatriculaInstrutor(){
		String s = String.valueOf(instrutores.size()+1);
		return getAnoAtual() + ZEROS.substring(s.length()) + s;
	}
	
	private static int getAnoAtual(){
		Calendar cal = GregorianCalendar.getInstance();
		return cal.get(Calendar.YEAR);
	}	
}
