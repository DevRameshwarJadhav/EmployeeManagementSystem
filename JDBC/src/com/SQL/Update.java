package com.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");

		String query = "update student set address='Nashik' where sid='102'";
		
		Statement stm = con.createStatement();
		int executeUpdate = stm.executeUpdate(query);
		
		con.close();
		System.out.println("Successfully data saved into the database");
		
		
		
	}

}
