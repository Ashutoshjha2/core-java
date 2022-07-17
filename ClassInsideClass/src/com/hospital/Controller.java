package com.hospital;

import java.util.Random;
import java.util.Scanner;

public class Controller {
	
	public static void main(String[] args) {
		Hospital h = new Hospital(101, "ABC", "chitrakoot", "ashu", "deepika", "yes");
		Hospital h1 = new Hospital(1, "ABC", "chitrakoot", "ashu", "deepika", "yes");
		Scanner s = new Scanner(System.in);
		RegistrationForm rg = new RegistrationForm();
		Random r = new Random();
		int id = r.nextInt(10);
		System.out.println("======HOSPITAL MANAGEMENT SYSTEM======");
		  System.out.println("Enter the Name"); 
		  String name = s.nextLine();
		  System.out.println("Enter the address"); 
		  String address = s.nextLine();
		  System.out.println("Enter the email");
		  String email = s.nextLine();
		  System.out.println("Enter the Disease");
		  String disease = s.nextLine();
		 System.out.println("Enter the regfee"); 
		 String regfee = s.nextLine();
		 
		//set the data into registration object
		
		 rg.setId(id);
		  rg.setRegname(name); 
		  rg.setRegaddress(address);
		 rg.setEmail(email); 
		 rg.setDisease(disease);
		 rg.setRegfee(regfee);
		 
		rg.setHospital(h);
		
	
		System.out.println(rg);
		
	}
}

