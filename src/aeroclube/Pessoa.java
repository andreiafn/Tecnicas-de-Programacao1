package aeroclube;

class Pessoa {

	private String matricula;

	private String nome;

	private String endereco;

	private Integer idade;

	public Pessoa() {}
	
	public Pessoa(String matricula, String nome, String endereco, Integer idade) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
	}

	void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	void setIdade(Integer idade) {
		this.idade = idade;
	}

	String getMatricula() {
		return this.matricula;
	}

	String getNome() {
		return this.nome;
	}

	String getEndereco() {
		return this.endereco;
	}

	Integer getIdade() {
		return this.idade;
	}

}