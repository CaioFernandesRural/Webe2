package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Aluno;

import java.io.IOException;


/**
 * Servlet implementation class LoginUsuario
 */
public class LoginUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginUsuario() {
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


		Aluno Aluno = new Aluno();
		
		Aluno.setLogin(request.getParameter("login"));
		Aluno.setSenha(request.getParameter("senha"));
		
		ServletContext servletContext = getServletContext();
		Aluno AlunoExiste = (model.Aluno) servletContext.getAttribute("usuario");
		
		if(Aluno.getLogin().equals(AlunoExiste.getLogin()) && Aluno.getSenha().equals(AlunoExiste.getSenha())) {

			RequestDispatcher xx = request.getRequestDispatcher("/home_aluno.jsp");
			xx.forward(request, response);
			
		} else {
			response.getWriter().println("<h1>Login Incorreto<h1>");
		}
	}
}