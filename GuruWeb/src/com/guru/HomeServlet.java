package com.guru;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HomeServlet
 */
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter p = response.getWriter();
		String name = request.getParameter("name");
		
		p.println("Welcome "+name);
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		RequestDispatcher rd = request.getRequestDispatcher("/customerinfo.html");
		rd.include(request, response);
		//response.sendRedirect("http://www.google.com?q="+name);
		
	}

}
