package com.connect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

	public static void main(String[] args) throws IOException {

		System.err.println("***************Welcome To Student Management App**************\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("Press 1 to Add Student\n");
			System.out.println("Press 2 to Delete Student\n");
			System.out.println("Press 3 to Display Student\n");
			System.out.println("Press 4 to Update Student\n");
			System.out.println("Press 5 to Exit ");
			int c = Integer.parseInt(br.readLine());

			if (c == 1) {
//				add
				System.out.println("Enter user ID :");
				int id = Integer.parseInt(br.readLine());

				System.out.println("Enter user name :");
				String name = br.readLine();

				System.out.println("Enter user Phone :");
				String phone = br.readLine();

				System.out.println("Enter user City :");
				String city = br.readLine();

				Student st = new Student(id, name, phone, city);
				boolean answer = StudentDao.insertStudentToDB(st);
				if (answer) {
					System.out.println("Student is added successfully");
				} else {
					System.out.println("Something went wrong......");
				}
				System.out.println(st);
			} else if (c == 2) {
//				delete
				System.out.println("Enter student id Delete :");
				int userId = Integer.parseInt(br.readLine());
				boolean f = StudentDao.deleteStudent(userId);
				if (f) {
					System.out.println("Deleted ");
				} else {
					System.out.println("something wrong try again");
				}

			} else if (c == 3) {

//				display  
				StudentDao.showAllStudent();
			} else if (c == 4) {
//				update
			} else if (c == 5) {
//				exit
				break;
			} else {
				System.out.println("Invalid");
			}

		}
		System.out.println("Thankyou for using My App .........");
	}

}
