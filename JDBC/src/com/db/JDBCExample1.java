package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JDBCExample1 {

	 public static String quote(String s) {
		    return new StringBuilder()
		    .append('\'')
		        .append(s)
		        .append('\'')
		        .toString();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//driver/connection/drivermanger/statement/resultset/prestatement/
	
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		 PreparedStatement pstmt= null;
		 String quotedX = null;
		
try{
	Class.forName("com.mysql.jdbc.Driver"); //creates new instance for the driver
	//gets connected to mysql database using, url, username, password of the installed mysql 
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");

 con.setAutoCommit(false);
	
	
	 st = con.createStatement();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter case no: ");
	int expression = sc.nextInt();
	int j = 0;
	   			int id ;
				String name ;
				int age ;
				String course ;
	switch(expression)
	{
	   // case statements
	   // values must be of same type of expression
	   case 1 :
		   
//			rs= st.executeQuery("select * from test.student");
//			while(rs.next()){
//				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
//			
//			}
//			
			
			rs= st.executeQuery("SELECT CustBankAccountNo, CustAcntBalance FROM bank.custbankaccountinfo;");
			int count = 0;
			int balance = 0;
			int totalbalance = 0;
			while(rs.next()){
			System.out.println(rs.getInt(1)+" "+rs.getInt(2));
			
			balance = rs.getInt(2);
			totalbalance = totalbalance + balance ;
			count++;
			System.out.println("no count" +count );
			System.out.println("totalbalance" +totalbalance );
	}
	      // Statements
	      break; // break is optional
	      
	   case 2 :
		  
		  DummyData dd = new DummyData();
		   List<DummyData> list = new ArrayList<DummyData>();
		   dd.setId(11);
		   dd.setName("ABC");
		   dd.setAge(19);
		   dd.setCourse("IT");
		   list.add(dd);
		   StudentAddress sa = new StudentAddress();
		   List<StudentAddress> salist = new ArrayList<StudentAddress>();
		   sa.setId(dd.getId());
		   sa.setCity("VSKP");
		   sa.setState("AP");
		   sa.setCountry("INDIA");
		   sa.setZip(531021);
		   
		   salist.add(sa);
		   pstmt=con.prepareStatement("insert into test.student values(?,?,?,?)");  
		   PreparedStatement   pstmt1 =con.prepareStatement("insert into test.studentaddress values(?,?,?,?,?)");  
		   for(DummyData s : list){
			   pstmt.setInt(1, s.getId());
			   pstmt.setString(2,s.getName());  
			   pstmt.setInt(3,s.getAge()); 
			   pstmt.setString(4,s.getCourse());
			   j=pstmt.executeUpdate();
			j++;   
		   }
		   int k=0;
		   if(j>0){
			  
			   for(StudentAddress saa :salist){
			   pstmt1.setInt(1, saa.getId());
			   pstmt1.setString(2,saa.getCity());
			   pstmt1.setString(3,saa.getState()); 
			   pstmt1.setString(4,saa.getCountry());  
			   pstmt1.setInt(5, saa.getZip());
			   
			   k=pstmt1.executeUpdate();
			   k++;
			   }
			   
		   }else{
			   con.rollback();
		   }
		   
		   if(j>0&&k>0){
			   System.out.println("no of records inserted="+ j);
			  con.commit();
			rs= st.executeQuery("select * from test.student");
			ResultSet rs1=st.executeQuery("select * from test.studentaddress");
			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			}
			while(rs1.next()){
				System.out.println(rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getString(3)+" "+rs1.getString(4)+" "+rs1.getInt(5));
			}
			}else{
				System.out.println("Insertion failed");
			
			}
		   
	      // Statements
	      break; // break is optional
	     // write select before update and after update  
	      
	      
	   case 3 :
		   String id1 = sc.next();
		   name = sc.next().toString();
			    String x = name;
			     quotedX = quote(x);
			    System.out.println(quotedX);
			
		   
		   st = con.createStatement();
 
           String query = "update test.student set name="+quotedX+" where id = "+id1;
           System.out.println("query"+ query);
           //count will give you how many records got updated
           j= st.executeUpdate(query);
           System.out.println("Updated queries: "); 
			rs= st.executeQuery("select * from test.student");
			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			
			}
	      // Statements
	      break; 
	      
	   case 4 :
//		   id = sc.nextInt();
		   name = sc.next();
//		    quotedX = quote(name);
//		   age = sc.nextInt();
		   String log = sc.next();
//		  String log1 =quote(log);
		   st = con.createStatement();
		   String query1= "ALTER TABLE test.student ADD COLUMN "+name+" SMALLINT(6)"+" NOT NULL AFTER `name`, ADD COLUMN "+log+ " VARCHAR(12) NOT NULL AFTER `course`";
		   	System.out.println("query1"+query1);
		   st.executeUpdate(query1);
			rs= st.executeQuery("select * from test.student");
//			while(rs.next()){
//				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getDate(5));
//			
//			}
	      // Statements
	      break; // break is optional
	      
	   case 5 :
//		   id = sc.nextInt();
		   name = sc.next();
//		    quotedX = quote(name);
//		   age = sc.nextInt();
		   String log1 = sc.next();
//		  String log1 =quote(log);
		   st = con.createStatement();
		   String delQuery= "ALTER TABLE test.student DROP COLUMN "+ name+" , DROP COLUMN "+log1;
		   	System.out.println("query1"+delQuery);
		   st.executeUpdate(delQuery);
			rs= st.executeQuery("select * from test.student");
//			while(rs.next()){
//				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getDate(5));
//			
//			}
	      // Statements
	      break; // break is optional
	      // delete query
	   case 6 :
		   st = con.createStatement();
		   String deleteQuery = "DELETE FROM test.studentaddress WHERE id="+11;
		   System.out.println(deleteQuery);
		  int c = st.executeUpdate(deleteQuery);
		  System.out.println();
		   if(c>0){
			   System.out.println("successfully delteed rows from studentaddress");
			   String deleteParentQuery = "DELETE FROM test.student WHERE id="+11;
			   int d = st.executeUpdate(deleteParentQuery);
			   if(d>0){
//				   rs= st.executeQuery("select * from test.student");
//				   while(rs.next()){
//						System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
					
//					}
				   System.out.println("successfully delteed rows from student");
			   }
			   

		   con.commit();
		   }
		   else{
			   con.rollback();
		   }
		   
	}
	
		

// connection pooling - 
}
 catch(Exception e){
	e.printStackTrace();
	try {
		con.rollback();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}
finally{
	try {
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	}
//create a new table with studentaddress as table name, columns names as , id -> foreign key to table student id , city,state, country,pin code
}

//create new schema with name as bank
// 1.create customer information table - cutomerId,  cusfirstname, custsurname, age, DOB, Acntopendate, AcntCloseDate, lastUPdatedstaffid
// also create customerAddrees table= - custid as foreignkey, state, city, country, pin
//2. create staff inforamtion table -staffId, bankCode, staff first name, staff LASTNAME, age, Is manger, StaffPrivelage, 
//3. Customer bank account information table - CustId, CustAccno, BankCode,  custAcntBalance, lastUpdatedStaffId, last usedTransactionDate, 
//4. Bank vault inforamtion table- BankName, BankCode, BankBalance, lastUpdated Staff Id, no of accounts, no of customers


//


















