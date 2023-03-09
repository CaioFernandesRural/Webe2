package model;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;


public class Homologacao {

	private Integer id_homologacao;	

	private Coordenacao homologador;

	private Aluno aluno;
	
	private Calendar timestamp_homologacao = new GregorianCalendar(TimeZone.getTimeZone("GMT-3"),new Locale("pt_BR"));

	private Documento documentacao_comprobatoria;
	
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
