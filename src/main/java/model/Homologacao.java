package br.ufrrj.si.web2.model;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Homologacao {

	@Id
	@GeneratedValue
	private Integer id_homologacao;	
	
	@OneToOne
	private Coordenacao homologador;
	
	@OneToOne
	private Aluno aluno;
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar timestamp_homologacao = new GregorianCalendar(TimeZone.getTimeZone("GMT-3"),new Locale("pt_BR"));
	
	@OneToOne(cascade = CascadeType.MERGE)
	private Documento documentacao_comprobatoria;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	private ParticipacaoProjeto participacao_relacionada;
	
	private Integer qtde_horas;
	
	public Integer getId_homologacao() {
		return id_homologacao;
	}

	public void setId_homologacao(Integer id_homologacao) {
		this.id_homologacao = id_homologacao;
	}

	public Coordenacao getHomologador() {
		return homologador;
	}

	public void setHomologador(Coordenacao homologador) {
		this.homologador = homologador;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Calendar getTimestamp_homologacao() {
		return timestamp_homologacao;
	}

	public void setTimestamp_homologacao(Calendar timestamp_homologacao) {
		this.timestamp_homologacao = timestamp_homologacao;
	}

	public Documento getDocumentacao_comprobatoria() {
		return documentacao_comprobatoria;
	}

	public void setDocumentacao_comprobatoria(Documento documentacao_comprobatoria) {
		this.documentacao_comprobatoria = documentacao_comprobatoria;
	}

	public Integer getQtde_horas() {
		return qtde_horas;
	}

	public void setQtde_horas(Integer qtde_horas) {
		this.qtde_horas = qtde_horas;
	}

	public ParticipacaoProjeto getParticipacao_relacionada() {
		return participacao_relacionada;
	}

	public void setParticipacao_relacionada(ParticipacaoProjeto participacao_relacionada) {
		this.participacao_relacionada = participacao_relacionada;
	}
	
	
		
}
