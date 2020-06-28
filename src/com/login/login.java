package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public login() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String Name = request.getParameter("Uname");
		String password = request.getParameter("Upass");

		if(Name.equals("jaffar")&&password.equals("1234"))
		{
			HttpSession session =request.getSession();
			System.out.println("in login " +session);
			session.setAttribute("name", Name);
			
			response.sendRedirect("Welcome.jsp");
		}
		else
		{
			
			response.sendRedirect("Login.jsp");
		}
		
	}

}
