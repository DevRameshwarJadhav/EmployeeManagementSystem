package com.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Prepared_Stm {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");

		String query="insert into student values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
	
		ps.setInt(1, 115);
		ps.setString(2, "Tejas");
		ps.setString(3, "Nasik");
		
		ps.execute();
		con.close();
		System.out.println("Successfully stored data into database");
		
		
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tech","root","root");
//
//		String query="select * from student(?,?,?)";
//		PreparedStatement ps = con.prepareStatement(query);
//		ResultSet rs = ps.executeQuery();
//		
//		while(rs.next()) {
//			System.out.println(rs.getInt(1));
//			System.out.println(rs.getString(2));
//			System.out.println(rs.getString(3));
//		}
//	
//		
//		
//		
//		con.close();
//		System.out.println("Successfully stored data into database");
	}

}
