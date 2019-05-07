package com.guru;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;

public class Service {
	
	
public Connection dbConnection() throws SQLException, ClassNotFoundException{
	
		Connection con = null;
		
		Class.forName("com.mysql.jdbc.Driver"); //creates new instance for the driver
		//gets connected to mysql database using, url, username, password of the installed mysql 
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		
	return con;
	
}

public boolean validateuser(Connection con, String name, String password) throws SQLException {
	// TODO Auto-generated method stub
	ResultSet rs = null;
	 PreparedStatement pstmt= null;
	 String sql = "select username, password from test.student where username=? and password =?";
	 pstmt= con.prepareStatement(sql);
	 pstmt.setString(1,name);
	 pstmt.setString(2, password);
		rs= pstmt.executeQuery(sql);
		String name1 = null;
		String password1 = null;
		while(rs.next()){
			name1 = rs.getString("username");
			password1 = rs.getString("password");
		}
		if(name.equals(name1) && password.equals(password1)){
			return true;
		}else
	return false;
}

 

}
