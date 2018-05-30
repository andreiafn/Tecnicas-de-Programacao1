package aeroclube;

class Piloto extends Pessoa {

	private Integer breve;
	
	public Piloto(Pessoa pessoa) {
		super(pessoa.getMatricula(), pessoa.getNome(), pessoa.getEndereco(), pessoa.getIdade());
	}
	
	public Piloto(String matricula, String nome, String endereco, Integer idade, Integer breve) {
		super(matricula, nome, endereco, idade);
		this.breve = breve;
	}

	public Piloto() {}
	
	void setBreve(Integer breve) {
		this.breve = breve;
	}

	Integer getBreve() {
		return this.breve;
	}

}