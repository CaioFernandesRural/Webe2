package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;


public class ParticipacaoProjeto {


	private Integer id;
	
	private String nome_projeto;
	
	private String processo_projeto;
	
	//o registro da participação não assegura que o aluno está em uma atividade válida
	private Boolean aprovacao = false;
	
	private Boolean finalizada = false;
	
	private Calendar inicio_participacao = new GregorianCalendar(new Locale("pt_BR"));
	
	//enquanto igual ao início, e "finalizada" igual a false, deve ser ignorado
	private Calendar fim_participacao = new GregorianCalendar(new Locale("pt_BR"));

	private Aluno aluno;
	
	private List<Homologacao> homologacoes = new ArrayList<Homologacao>();

	private Integer cargaHoraria;
	
	public Integer getId_participacao() {
		return id;
	}

	public void setId_participacao(Integer id_participacao) {
		this.id = id_participacao;
	}

	public String getNome_projeto() {
		return nome_projeto;
	}

	public void setNome_projeto(String nome_projeto) {
		this.nome_projeto = nome_projeto;
	}

	public String getProcesso_projeto() {
		return processo_projeto;
	}

	public void setProcesso_projeto(String processo_projeto) {
		this.processo_projeto = processo_projeto;
	}

	public Boolean getAprovacao() {
		return aprovacao;
	}

	public void setAprovacao(Boolean aprovacao) {
		this.aprovacao = aprovacao;
	}

	public Boolean getFinalizada() {
		return finalizada;
	}

	public void setFinalizada(Boolean finalizada) {
		this.finalizada = finalizada;
	}

	public Calendar getInicio_participacao() {
		return inicio_participacao;
	}

	public void setInicio_participacao(Calendar inicio_participacao) {
		this.inicio_participacao = inicio_participacao;
	}

	public Calendar getFim_participacao() {
		return fim_participacao;
	}

	public void setFim_participacao(Calendar fim_participacao) {
		this.fim_participacao = fim_participacao;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public boolean adicionarHomologacao(Homologacao h) {
		h.setParticipacao_relacionada(this);
		return this.homologacoes.add(h);
	}
	
	public boolean adicionarHomologacaoFinal(Homologacao h) {
		this.finalizada = true;		
		this.fim_participacao = new GregorianCalendar(new Locale("pt_BR"));		
		return this.adicionarHomologacao(h);
		
	}

	public Boolean desfazerHomologacao(Homologacao h) {	
		h.setParticipacao_relacionada(null);
		return this.homologacoes.remove(h);
	}
	
	public List<Homologacao> getHomologacoes() {
		return homologacoes;
	}

	public void setHomologacoes(List<Homologacao> homologacoes) {
		this.homologacoes = homologacoes;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
}
