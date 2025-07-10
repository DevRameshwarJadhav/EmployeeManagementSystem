package com.SQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;

public class TestConnections {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/jdbc";
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		
		
		String query1= "insert into student values(101,'Ram','Vaijapur');";
		
		Statement st = con.createStatement();
		st.execute(query1);
		con.close();
		System.out.println("Data Saved Successfully");
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		String url="jdbc:mysql://localhost:3306/jdbc";
//		
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
//	
//		String query = "INSERT INTO student VALUES (102, 'Kunal', 'Mumbai');";
//
//       
//       Statement stm = con.createStatement();
//       boolean execute = stm.execute(query);
//       System.out.println("Data save");
		
	}

}
