package aeroclube;

import java.util.ArrayList;

class Aluno extends Pessoa {

	private ArrayList<RegistroSaida> registroSaida = new ArrayList<RegistroSaida>();
	
	public Aluno(Pessoa pessoa) {
		super(pessoa.getMatricula(), pessoa.getNome(), pessoa.getEndereco(), pessoa.getIdade());
	}
	
	public Aluno() {}
	
	public Aluno(String matricula, String nome, String endereco, Integer idade) {
		super(matricula, nome, endereco, idade);
	}
	
	void setRegistroSaida(RegistroSaida registroSaida) {
		this.registroSaida.add(registroSaida);
	}
	
	ArrayList<RegistroSaida> getRegistroSaida() {
		return this.registroSaida;
	}
  
}