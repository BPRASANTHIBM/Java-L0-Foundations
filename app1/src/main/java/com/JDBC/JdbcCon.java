package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

// executeQuery used to read the records only, it can't affect the DB

// executeUpdate used to Update the records in DB


public class JdbcCon {
	
	public static void InsertRecords() {
		
		
//		String Query = "select*from Emp";
		
		
		
		
try {
	
	Integer EmpId = 9;
	String EmpName = "Sanjay";
	String Add = "Chennai";
	
	

	String url = "jdbc:mysql://localhost:3306/employee";
	String user = "root";
	String Pass = "root";
	
	String Query = "insert into Emp values (" +EmpId +" ,'"+EmpName +"','" +Add+"')";
	
	Connection con	= DriverManager.getConnection(url, user, Pass);
	
	  Statement s = con.createStatement();
	  
	 int row =  s.executeUpdate(Query);
	 
	 
	 System.out.println("No of Rows Affected : "+ row);
	 
//	 while(rs.next()) {
//		 System.out.println(rs.getInt(1));
//		 
//		 System.out.println(rs.getString(2));
//		 
//		 System.out.println(rs.getString(3));
//		 
//	 }
	 
	 
	 
	 
	} catch (Exception e) {
		e.printStackTrace();
	}
	  
	  
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JdbcCon.InsertRecords();
//		InsertPst();
		
	}

}
