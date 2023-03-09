package br.ufrrj.si.web2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Coordenacao extends Usuario{

	
	@Column(unique = true)
	private String matricula_siape;
	private Boolean ContaAtiva = true; 
	
	public String getMatricula_siape() {
		return matricula_siape;
	}

	public void setMatricula_siape(String matricula_siape) {
		this.matricula_siape = matricula_siape;
	}

	public Boolean getContaAtiva() {
		return ContaAtiva;
	}

	public void setContaAtiva(Boolean contaAtiva) {
		ContaAtiva = contaAtiva;
	}
	
}
