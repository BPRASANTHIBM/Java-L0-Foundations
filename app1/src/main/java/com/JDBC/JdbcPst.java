package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JdbcPst {
	
	
	// Prepared Statement is used easy to insert the variable in DB
	
	// Insert using Prepared Statement
	
		public static void InsertPst() {
			try {
				
				
				Scanner sc = new Scanner (System.in);
				
				
				System.out.println(" Enter the Variable what you have to update in DB ?");
				
				int EmpId = sc.nextInt();
				String EmpName = sc.next();
				String Add = sc.next();
				
				

				String url = "jdbc:mysql://localhost:3306/employee";
				String user = "root";
				String Pass = "root";
				
				String Query = "insert into Emp values (?,?,?)";
				
				String Q2 = "select*from Emp";
				
				Connection con	= DriverManager.getConnection(url, user, Pass);
				
		         PreparedStatement pst = con.prepareStatement(Query);
		         
		         pst.setInt(1,EmpId);
				 pst.setString(2,EmpName); 
				 pst.setString(3,Add);
				  
				 int row = pst.executeUpdate();
				 
			    ResultSet rs = pst.executeQuery(Q2);
				 
				 
				 
				 System.out.println("No of Rows Affected : "+ row);
				 
				 while(rs.next()) {
					 
					 System.out.println(rs.getInt(1));
					 
					 System.out.println(rs.getString(2));
					 
					 System.out.println(rs.getString(3));
					 
					 
					 
				 }

				 
				 con.close();
				 
				} catch (Exception e) {
					e.printStackTrace();
				}
				  
				  
			
			
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		InsertPst();
	}

}
