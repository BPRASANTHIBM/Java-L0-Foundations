package app1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		String url ="jdbc:mysql://localhost:3306/employee";
		
		String user ="root";
		String pass = "root";
	
		
		
		try {
//			Class.forName("com.mysql.jdbc.Driver");
		
   Connection con	= DriverManager.getConnection(url, user, pass);
	
	System.out.println("JDBC Connection Successful");
	
//	String query ="insert into employee.Emp values(4,'Prasanth','Viruthunagar')";
	String query = "Select * from Emp";
   
	
	Statement state= con.createStatement();
   
       
	
	ResultSet rs =  state.executeQuery(query);
//   int row = state .executeUpdate(query);	
      while(rs.next()) {
       System.out.println("Employee ID is :" + rs.getInt(1) );
       System.out.println("Employee Name is : " + rs.getString(2));
       
     
      System.out.println("Emp Address is : "+ rs.getString(3)); // Column Value can inside the Get Method
      
      con.close();
      }
      
      
       
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	
	}

}
