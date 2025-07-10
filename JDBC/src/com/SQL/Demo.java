package com.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root");
		 
		 String query="insert into student values(?,?,?)";
		 
		  PreparedStatement ps = con.prepareStatement(query);
	
		 ps.setInt(1,103);
		 ps.setString(2, "Vedant");
		 ps.setString(3, "Mumbai");
		 ps.execute();
		 
		 con.close();
		 System.out.println("Database stored successfully");
		
	}

}
