package com.jdbc.connection;

import java.sql.*;
import java.sql.Connection;

public class Connection {
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");//loading driver
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");//connection
		   //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test"),);
		     Statement stm = con.
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
