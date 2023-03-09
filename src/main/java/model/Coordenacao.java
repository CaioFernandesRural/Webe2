package model;


public class Coordenacao extends Usuario{

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
