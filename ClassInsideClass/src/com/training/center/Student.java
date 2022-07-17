package com.training.center;

import java.util.Random;
import java.util.Scanner;

public class Student {
public static void main(String[] args) {
	
	Course c = new Course(20, "java", "python", "pHP", "kotlin", "javaScript"); 
	Scanner s = new Scanner(System.in);
	Registration r = new Registration();
	Random r1 = new Random();
	int id = r1.nextInt(100);
	System.err.println("**********WELCOME TO STUDENT REGISTRATION DETAILS**********\n");
	
	System.out.println("Enter Your Name");
	String name = s.nextLine();
	System.out.println("Enter Your Fathers Name");
	String FatherName = s.nextLine();
	System.out.println("Enter Your College Name");
	String college_name = s.nextLine();
	System.out.println("Enter Your Course Name");
	String course_name = s.nextLine();
	System.out.println("Enter Your Course Duration");
	int Course_Duration = Integer.parseInt(s.nextLine());
	System.out.println("Enter Your Course Fee");
	int Course_Fee = Integer.parseInt(s.nextLine());
	System.out.println("Enter Your Date of Birth");
	String DOB = s.nextLine();
	
	r.setName(name);
	r.setFathers_Name(FatherName);
	r.setCourse_Name(course_name);
	r.setCollege_Name(college_name);
	r.setCourse_Duration(Course_Duration);
	r.setDOB(DOB);
	r.setCourse_Fee(Course_Fee);
	r.setID(id);
	r.setCourse(c);
	
	System.out.println(r);
}
}
