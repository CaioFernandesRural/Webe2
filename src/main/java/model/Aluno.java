package model;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Aluno extends Usuario{
	
	@Column(unique = true)
	private String matricula;
	@OneToMany(mappedBy = "aluno")
	private List<ParticipacaoProjeto> participacao_projetos = new ArrayList<ParticipacaoProjeto>();
	
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public boolean registrarParticipacaoProjeto(ParticipacaoProjeto pp) {
		return this.participacao_projetos.add(pp);
	}
	
	public boolean removerParticipacaoProjeto(ParticipacaoProjeto pp) {
		return this.participacao_projetos.remove(pp);
	}
	
	public List<ParticipacaoProjeto> getParticipacaoProjetos() {
		return participacao_projetos;
	}
	public void setParticipacaoProjetos(List<ParticipacaoProjeto> participacao) {
		this.participacao_projetos = participacao;
	}
			
}
