package aeroclube;

import java.time.LocalDate;
import java.time.LocalTime;

public class RegistroSaida {
	  
    private LocalDate data;
    
    private Instrutor instrutor;
    
    private LocalTime saida;
    
    private LocalTime chegada;
    
    private String parecer;
    
    public RegistroSaida(LocalDate data, Instrutor instrutor, LocalTime saida, LocalTime chegada, String parecer) {
		super();
		this.data = data;
		this.instrutor = instrutor;
		this.saida = saida;
		this.chegada = chegada;
		this.parecer = parecer;
	}

	void setData(LocalDate data) {
      this.data = data;
    }
    
    void setInstrutor(Instrutor instrutor) {
      this.instrutor = instrutor;
    }
    
    void setSaida(LocalTime saida) {
      this.saida = saida;
    }
    
    void setChegada(LocalTime chegada) {
      this.chegada = chegada;
    }
    
    void setParecer(String parecer) {
      this.parecer = parecer;
    }
  
    LocalDate getData() {
      return this.data;
    }
    
    Instrutor setInstrutor() {
      return this.instrutor;
    }
    
    LocalTime setSaida() {
      return this.saida;
    }
    
    LocalTime setChegada() {
      return this.chegada;
    }
    
    String setParecer() {
      return this.parecer;
    }
}
