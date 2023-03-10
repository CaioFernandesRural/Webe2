package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date date = null;
		try {
			date = sdf.parse(request.getParameter("dataInicio"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		Integer ch = Integer.parseInt(request.getParameter("ch"));
		
		Participacao.setProcesso_projeto(request.getParameter("numero"));
		Participacao.setInicio_participacao(cal);
		Participacao.setCargaHoraria(ch);

		ServletContext servletContext = getServletContext();
		
		if(servletContext.getAttribute("listaParticipacao") == null) {
			 List<ParticipacaoProjeto> listaParticipacao = new ArrayList<ParticipacaoProjeto>();
			 listaParticipacao.add(Participacao);
			 servletContext.setAttribute("listaParticipacao", listaParticipacao);
		} else {
			List<ParticipacaoProjeto> listaParticipacao = (List<ParticipacaoProjeto>) servletContext.getAttribute("listaParticipacao");
			listaParticipacao.add(Participacao);
			servletContext.setAttribute("listaParticipacao", listaParticipacao);
		}
		
		RequestDispatcher xx = request.getRequestDispatcher("/home_aluno.jsp");
		xx.forward(request, response);
		
	}
}
