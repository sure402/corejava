package com.guru;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CustomerInfo
 */
public class CustomerInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter p = response.getWriter();
		String firstName = request.getParameter("ly");
		String lastName = request.getParameter("Lastname");
		HttpSession session = request.getSession(false);
		String name = (String) session.getAttribute("name");
		System.out.println("name" + name);
//		RequestDispatcher rd = request.getRequestDispatcher("customerinfo");
//		rd.forward(request, response);
	p.println("<html>");
	p.println("<body color='red'>");
	p.println("<h1>Welcome to CustomerInfo </h1>"+name);
	p.println("</body>");
	p.println("</html>");
		
		p.close();
	}


}
