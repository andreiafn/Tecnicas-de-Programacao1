package br.com.aeroclube.pojos;

import java.util.Date;

public class Instrutor extends Piloto {

	private String nomeCurso;
	private Date   dataDiploma;
	private String instituicaoCurso;
	
	public Instrutor() {

	}
	
	public Instrutor(String matricula, String nome, String endereco, Integer idade) {
		super(matricula, nome, endereco, idade);
	}
	
	
	public Instrutor(String matricula, String nome, String endereco, Integer idade, String nomeCurso, Date dataDiploma, String instituicaoCurso) {
		super(matricula, nome, endereco, idade);
		this.nomeCurso = nomeCurso;
		this.dataDiploma = dataDiploma;
		this.instituicaoCurso = instituicaoCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public Date getDataDiploma() {
		return dataDiploma;
	}
	public void setDataDiploma(Date dataDiploma) {
		this.dataDiploma = dataDiploma;
	}
	public String getInstituicaoCurso() {
		return instituicaoCurso;
	}
	public void setInstituicaoCurso(String instituicaoCurso) {
		this.instituicaoCurso = instituicaoCurso;
	}

}
