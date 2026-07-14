package com.sait.db.ps;

import java.sql.*;
	import java.sql.Connection;
	
	public class InsertData {
		
	public static void main(String[] arg) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sait",
					"root","root");
			
			PreparedStatement ps=c.prepareStatement("insert into students(sname,sphone) values(?,?)");
			ps.setString(1, "pihu");
			ps.setString(2, "123456789");
			ps.executeUpdate();
			System.out.println("Data inserted Successfully!!!");
			
			c.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	}



