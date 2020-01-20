package jdbc;
import java.sql.*;  
import java.sql.*;  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mysqlcon {
    public static void main(String[] args) {
    	Connection con = null;
    
    	try {
    	    con =
    	       DriverManager.getConnection("jdbc:mysql://localhost/emp?" +
    	                                   "user=root&password=7608956");

    	  System.out.println(con);  
    	  Statement stmt=con.createStatement();  
    	  ResultSet rs=stmt.executeQuery("{call jdbcprocedure()}");  
    	  while(rs.next())  
    	  System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t "+rs.getString(3)+"\t"+rs.getString(4));  
    	  con.close();  

    	   
    	} catch (SQLException ex) {
    	    System.out.println("SQLException: " + ex.getMessage());
    	    System.out.println("SQLState: " + ex.getSQLState());
    	    System.out.println("VendorError: " + ex.getErrorCode());
    	}
    }
}