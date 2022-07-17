package com.connection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Start {
public static void main(String[] args) throws IOException{
	System.out.println("****** Welcome To Registration Details *******");
	Scanner s = new Scanner(System.in);
	while (true) {
		System.err.println("Press 1 Add Details");
		System.err.println("Press 2 Delete Details");
		System.err.println("Press 3 Read Details");
		System.err.println("Press 4 Update Details");
		System.err.println("Press 5 Exit");
		int a = Integer.parseInt(s.nextLine());
		
		if (a==1) {
			System.out.println("Enter user ID :");
			int id = Integer.parseInt(s.nextLine());
			System.out.println("Enter user Name :");
			String name = s.nextLine();
			System.out.println("Enter user Email :");
			String Email = s.nextLine();
			System.out.println("Enter user Mobile :");
			long mobile = Long.parseLong(s.nextLine());
			System.out.println("Enter user Address :");
			String address = s.nextLine();
			//Call the Student Class object Created
			Student st = new Student(id, name, Email, mobile, address);
			boolean ans = StudentDao.insertStudentToDao(st);
			if (ans==true) {
			System.out.println("Details Successfully");	
			}else {
				System.out.println("Something Wrong");
			}
			System.out.println(st);
		}else if (a==2) {
			System.out.println("Enter user ID Delete");
			int id = Integer.parseInt(s.nextLine());
			boolean f = StudentDao.deleteStudent(id);
			if (f) {
				System.out.println("Deleted");
			}else {
				System.out.println("Try again");
			}
		}else if (a==3) {
			System.out.println("All Student Details");
			StudentDao.showAllStudent();
//		}else if (a==4) {
//			System.out.println("Update Student");
//			System.out.println("Enter new Name : ");
//			String name = s.nextLine();
//			System.out.println("Enter new Email : ");
//			String Email = s.nextLine();
//			System.out.println("Enter your ID : ");
//			int id = Integer.parseInt(s.nextLine());
//			boolean f = StudentDao.updateStudent(name , Email);
//			
		}else if (a==5) {
			System.out.println("Exit");
			break;
		}else {
			System.out.println("Enter valid key");
		}
	}
	System.out.println("Thankyou for using this app");
	System.out.println("Have A nice Day");
}
}
