package br.com.aeroclube.pojos;

public class Piloto extends Pessoa {
	
	private Integer breve;
	
	public Piloto() {
		super();
	}

	public Piloto(String matricula, String nome, String endereco, Integer idade) {
		super(matricula, nome, endereco, idade);
	}

	public Integer getBreve() {
		return breve;
	}

	public void setBreve(Integer breve) {
		this.breve = breve;
	}

}
