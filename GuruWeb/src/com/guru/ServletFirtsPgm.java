package com.guru;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletFirtsPgm
 */
// @WebServlet("/ServletFirtsPgm")
public class ServletFirtsPgm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletFirtsPgm() {
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
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		ServletConfig confi = getServletConfig();
		String dbname = confi.getInitParameter("dbdrivername");
		
		ServletContext con = getServletContext();
		String env = con.getInitParameter("env");
		//boolean authorize = ServiceClass.validate(username,password);
		//call metjod from this call to another class which is database connection and validate the user name and password with staffinfo table
		Service serv = new Service();
		Connection con1 = null;
		boolean loginflag = false;
		try {
			con1 = serv.dbConnection();
			if(con1!=null){
				 loginflag = serv.validateuser(con1,name,password);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	if(loginflag)	{
		//if(name.equals("abc")&& password.equals("1234")){
			
			RequestDispatcher rd = request.getRequestDispatcher("homeServlet");
			rd.forward(request, response);
	/*	p.println("<html>");
		p.println("<body color='red'>");
		p.println("<h1>Welcome to First Servlet Program "+name+" </h1>");
		p.println("</body>");
		p.println("</html>");*/
		}
		else{
			p.println("<p color='red'>Invalid logon Details</p>");
			RequestDispatcher rd = request.getRequestDispatcher("/login.html");
			rd.include(request, response);
			/*p.println("<html>");
			p.println("<body color='red'>");
			p.println("<h1>login failed </h1>");
			p.println("</body>");
			p.println("</html>");
*/		}
		p.close();
		
	}


}
