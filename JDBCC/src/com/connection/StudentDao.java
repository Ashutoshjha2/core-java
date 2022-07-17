package com.connection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class StudentDao {
public static boolean insertStudentToDao(Student st) {
	boolean f= false;
	try {
		Connection con= CP.create();
		String p = "insert into test values(?,?,?,?,?)";
		CallableStatement pst = con.prepareCall(p);
		pst.setInt(1, st.getID());
		pst.setString(2, st.getName());
		pst.setString(3, st.getEmail());
		pst.setLong(4, st.getMobile());
		pst.setString(5, st.getAddress());
		pst.executeUpdate();
		f=true;
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return f;
}
public static boolean deleteStudent(int id) {
	boolean f = false;
	try {
		Connection con = CP.create();
		String p = "delete from test where id=?";
		CallableStatement pst = con.prepareCall(p);
		pst.setInt(1, id);
		pst.executeUpdate();
		f=true;
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return f;
}
public static void showAllStudent () {
	try {
		Connection con = CP.create();
		String p = "Select * from test";
		
		Statement stm = con.createStatement();
		ResultSet set = stm.executeQuery(p);
		while (set.next()) {
			int id = set.getInt(1);
			String name = set.getString(2);
			String Email = set.getString(3);
			Long Mobile = set.getLong(4);
			String Address = set.getString(5);
			System.out.println("ID :"+id);
			System.out.println("Name :"+name);
			System.out.println("Email :"+Email);
			System.out.println("Mobile :"+Mobile);
			System.out.println("Address :"+Address);
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
//	public static void updateStudent(int id) {
//		try {
//			Connection con = CP.create();
//			String p = "update student set name=? , Email=? where id=?";
//			CallableStatement pst = con.prepareCall(p);
//			
//			Scanner s = new Scanner(System.in);
//			System.out.println("Enter new Name : ");
//			String name = s.nextLine();
//			System.out.println("Enter new Email : ");
//			String Email = s.nextLine();
//			System.out.println("Enter your ID : ");
//			int id1 = Integer.parseInt(s.nextLine());
//			pst.setString(1, name);
//			pst.setString(2, Email);
//			pst.setInt(3, id);
//			pst.executeUpdate();
//			System.out.println("Updated Data");
//			con.close();
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
}

}
