package com.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Clause_Getdata {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tech", "root", "root");

		String query = "select * from student where sid=101";

		Statement stm = con.createStatement();

		ResultSet rs = stm.executeQuery(query);

		while (rs.next()) {

			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println("----------------------------------");

		}
		con.close();

		System.out.println("Data saved successfully into the database");
		
	}

}
