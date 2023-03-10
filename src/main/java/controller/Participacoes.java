package controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ParticipacaoProjeto;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Servlet implementation class Participacoes
 */
public class Participacoes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Participacoes() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
    	PrintWriter out = response.getWriter();
		
		ServletContext servletContext = getServletContext();
	    List<ParticipacaoProjeto> listaParticipacao = (List<ParticipacaoProjeto>) servletContext.getAttribute("listaParticipacao");
    	
	    for(ParticipacaoProjeto Participacao : listaParticipacao) {
	    	out.println("<p>Número do Processo:</p>" + Participacao.getProcesso_projeto());
            out.println("<p>Data de Início:</p>" + Participacao.getInicio_participacao().getTime());
            out.println("<p>Carga Horária:</p>" + Participacao.getCargaHoraria());
	    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
