package br.com.aeroclube.pojos;

public class Pessoa {

	private String  matricula;
	private String  nome;
	private String  endereco;
	private Integer idade;

	public Pessoa() {
	}

	public Pessoa(String matricula, String nome, String endereco, Integer idade) {
		this.matricula = matricula;
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
}
	
