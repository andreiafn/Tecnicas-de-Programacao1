package aeroclube;

import java.util.Date;

class Instrutor extends Piloto {
	
	private String nomeCurso;
	
	private Date dataDiploma;
	
	private String instituicaoCurso;
	
	public Instrutor() {}

	public Instrutor(String matricula, String nome, String endereco, Integer idade, Integer breve, String nomeCurso, Date dataDiploma, String instituicaoCurso) {
		super(matricula, nome, endereco, idade, breve);
		this.nomeCurso = nomeCurso;
		this.dataDiploma = dataDiploma;
		this.instituicaoCurso = instituicaoCurso;
	}
	public Instrutor(Piloto pessoa) {
		super(pessoa.getMatricula(), pessoa.getNome(), pessoa.getEndereco(), pessoa.getIdade(), pessoa.getBreve());
	}

	void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	void setDataDiploma(Date dt) {
		this.dataDiploma = dt;
	}
	public String getInstituicaoCurso() {
		return instituicaoCurso;
	}
	public void setInstituicaoCurso(String instituicaoCurso) {
		this.instituicaoCurso = instituicaoCurso;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public Date getDataDiploma() {
		return dataDiploma;
	}

	void setInstitucaoCurso(String instituicaoCurso) {
		this.instituicaoCurso = instituicaoCurso;
	}

}