package com.sait.db.ps;

import java.sql.*;
public class ReadData {
	public static void main(String[] arg) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/sait",
				"root","root");
	
			PreparedStatement ps=c.prepareStatement("select * from students where sname=? ");
			ps.setString(1, "Kaliya");
	        ResultSet rs=ps.executeQuery();
		    while(rs.next()) {
		    	System.out.println(rs.getInt("sid"));
		    	System.out.println(rs.getString("sname"));
		    	System.out.println(rs.getString("sphone"));
		    	
		    	System.out.println("----------");
		    }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
