package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Aluno;
import model.ParticipacaoProjeto;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/**
 * Servlet implementation class CadastroUsuario
 */
public class CadastroUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroUsuario() {
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
		Aluno Aluno = new Aluno() ;
		
		Aluno.setNome(request.getParameter("nome"));
		Aluno.setMatricula(request.getParameter("matricula"));
		Aluno.setEmail(request.getParameter("email"));
		Aluno.setLogin(request.getParameter("login"));
		Aluno.setSenha(request.getParameter("senha"));
		
		ServletContext servletContext = getServletContext();
		servletContext.setAttribute("usuario", Aluno);
		
		RequestDispatcher xx = request.getRequestDispatcher("/home_aluno.jsp");
		xx.forward(request, response);
	}

}
