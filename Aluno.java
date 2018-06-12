package br.com.aeroclube.pojos;

import java.util.ArrayList;

public class Aluno extends Pessoa {
	
	
	private ArrayList<RegistroSaida> registrosSaida = new ArrayList<RegistroSaida>();
	
	public Aluno() {
		super();
	}

	public Aluno(String matricula, String nome, String endereco, Integer idade) {
		super(matricula, nome, endereco, idade);
	}

	public ArrayList<RegistroSaida> getRegistrosSaida() {
		return registrosSaida;
	}

	public void setRegistrosSaida(ArrayList<RegistroSaida> registrosSaida) {
		this.registrosSaida = registrosSaida;
	}
	public void adicionaRegistroSaida(RegistroSaida registroSaida){
		if(registroSaida != null){
			this.registrosSaida.add(registroSaida);
		}
	}

}
