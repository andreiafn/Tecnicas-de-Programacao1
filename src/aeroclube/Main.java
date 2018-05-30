package aeroclube;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws ParseException {

		Scanner scanner = new Scanner(System.in);

		String tipo;

		Aluno alunoTeste = new Aluno("1234", "Amanda Gonçalves", "Guara 2, QE 30 lote 15 casa 25", 23);
		Instrutor instrutorTeste = new Instrutor("5678", "Eliseu Nunes",
				"Condominio Entre Lagos, etapa 3, conjunto G casa 56", 50, 6783, "Nome Curso", new Date(2015, 03, 17),
				"Instituição Curso");
		Piloto pilotoTeste = new Piloto("3678", "Maria Silva", "SQS 103, Bloco G, apt 606", 48, 8901);

		alunoTeste.setRegistroSaida(new RegistroSaida(LocalDate.of(2018, 04, 20), instrutorTeste, LocalTime.of(14, 30),
				LocalTime.of(16, 30), "Teste"));
		
		System.out.print("Escolha o tipo de cadastro: \n1 - Aluno\n2 - Piloto\n3 - Instrutor\n ");
		tipo = scanner.nextLine();

		Aluno aluno = new Aluno();
		Piloto piloto = new Piloto();
		Pessoa pessoa = new Pessoa();
		Instrutor instrutor = new Instrutor();

		System.out.println("Matricula: ");
		pessoa.setMatricula(scanner.nextLine());
		System.out.println("Nome: ");
		pessoa.setNome(scanner.nextLine());
		System.out.println("Endereço: ");
		pessoa.setEndereco(scanner.nextLine());
		System.out.println("Idade: ");
		pessoa.setIdade(scanner.nextInt());
		scanner.nextLine();

		if (tipo == "1") {
			aluno = new Aluno(pessoa);

			System.out.println("Matricula: " + aluno.getMatricula());
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("Endereço: " + aluno.getEndereco());
			System.out.println("Idade: " + aluno.getIdade());

		} else if (tipo.equals("2") || tipo.equals("3")) {
			piloto = new Piloto(pessoa);

			System.out.println("Breve: ");
			piloto.setBreve(scanner.nextInt());
			scanner.nextLine();
			
			if(tipo.equals("2")) {
				System.out.println("Matricula: " + pessoa.getMatricula());
				System.out.println("Nome: " + pessoa.getNome());
				System.out.println("Endereço: " + pessoa.getEndereco());
				System.out.println("Idade: " + pessoa.getIdade());
				System.out.println("Breve: " + piloto.getBreve());
			}

			if (tipo.equals("3")) {
				instrutor = new Instrutor(piloto);
				String dataRecebida;

				System.out.println("Nome Curso: ");
				instrutor.setNomeCurso(scanner.nextLine());
				System.out.println("Data Diploma: ");
				dataRecebida = scanner.nextLine();
				DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
				Date dt = df.parse(dataRecebida);
				instrutor.setDataDiploma(dt);
				System.out.println("Nome Curso: ");
				instrutor.setInstituicaoCurso(scanner.nextLine());

				System.out.println("Matricula: " + pessoa.getMatricula());
				System.out.println("Nome: " + pessoa.getNome());
				System.out.println("Endereço: " + pessoa.getEndereco());
				System.out.println("Idade: " + pessoa.getIdade());
				System.out.println("Breve: " + instrutor.getBreve());
				System.out.println("Nome curso: " + instrutor.getNomeCurso());
				System.out.println("Data diploma: " + instrutor.getDataDiploma());
				System.out.println("Instituicao Curso: " + instrutor.getInstituicaoCurso());

			}
		}

	}
}