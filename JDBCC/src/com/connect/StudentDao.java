package com.connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class StudentDao {
public static boolean insertStudentToDB(Student st) {
	boolean f=false;
	//JDBC CODE...
	try {
		Connection con = CP.create();
		String q = "insert into student values(?,?,?,?)";
		// prepared statment
		PreparedStatement pstmt =con.prepareStatement(q);
		// set the value of parameter
		pstmt.setInt(1, st.getStudentId());
		pstmt.setString(2, st.getStudentName());
		pstmt.setString(3, st.getStudentPhone());
		pstmt.setString(4, st.getStudentCity());
		
		//excute
		pstmt.executeUpdate();
		f=true;
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return f;
}

public static boolean deleteStudent(int userId) {
	// TODO Auto-generated method stub
	boolean f=false;
	//JDBC CODE...
	try {
		Connection con = CP.create();
		String q = "delete from student where sid=?";
		// prepared statment
		PreparedStatement pstmt =con.prepareStatement(q);
		// set the value of parameter
		pstmt.setInt(1, userId);
		
		
		//excute
		pstmt.executeUpdate();
		f=true;
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return f;
}

public static void showAllStudent() {
	// TODO Auto-generated method stub
	//JDBC CODE...
	try {
		Connection con = CP.create();
		String q = "select * from student;";
	    Statement stmt = con.createStatement();
	    ResultSet set = stmt.executeQuery(q);
		while (set.next()) {
			int id = set.getInt(1);
			String name = set.getString(2);
			String phone = set.getString(3);
			String city = set.getString(4);
			System.out.println("ID : "+id);
			System.out.println("Name :"+name);
			System.out.println("Phone :"+phone);
			System.out.println("City :"+city);;
			System.out.println("*************************");
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
}
}
