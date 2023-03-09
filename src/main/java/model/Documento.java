package model;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;


public class Documento {

	private Integer id_documento;
//	@Column(nullable = false)
	private String path_documento;

	private Calendar dataDocumento = new GregorianCalendar(TimeZone.getTimeZone("GMT-3"));

	private Aluno aluno;	
	
	public Integer getId_documento() {
		return id_documento;
	}

	public void setId_documento(Integer id_documento) {
		this.id_documento = id_documento;
	}

	public String getPath_documento() {
		return path_documento;
	}

	public void setPath_documento(String path_documento) {
		this.path_documento = path_documento;
	}

	public Calendar getDataDocumento() {
		return dataDocumento;
	}

	public void setDataDocumento(Calendar dataDocumento) {
		this.dataDocumento = dataDocumento;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
}
