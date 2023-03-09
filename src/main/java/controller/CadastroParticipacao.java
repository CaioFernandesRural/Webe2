package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import model.ParticipacaoProjeto;

/**
 * Servlet implementation class CadastroParticipacao
 */
public class CadastroParticipacao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroParticipacao() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ParticipacaoProjeto Participacao = new ParticipacaoProjeto();
		
		Participacao.setProcesso_projeto(request.getParameter("numero"));
		//Participacao.setInicio_participacao(request.getParameter("dataInicio"));
		//Participacao.setCargaHoraria integer.par(request.getParameter("ch"));
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println(request.getParameter("ch"));
		
	}

}
