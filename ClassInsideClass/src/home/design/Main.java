package home.design;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
Dream$Home D = new Dream$Home(95, "Jha Niwas", "Kerla",10,50,25);
Registration r = new Registration();
Random r1 = new Random();
int id = r1.nextInt(500);

System.err.println("######### WELCOME TO HOME DESIGN #########\n");


System.out.println("Enter Your Name\n");
String Name = s.nextLine();
System.out.println("Enter Your Email\n");
String Email = s.nextLine();
System.out.println("Enter Your DOB\n");
int dob = Integer.parseInt(s.nextLine());
System.out.println("Enter Your Contact\n");
int contact = Integer.parseInt(s.nextLine());

r.setID(id);
r.setName(Name);
r.setEmail(Email);
r.setContact(contact);
r.setDOB(dob);

r.setDream$Home(D);

System.err.println(r);


	}

}
