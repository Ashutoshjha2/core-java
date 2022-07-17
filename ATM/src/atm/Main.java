package atm;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
Scanner s = new Scanner(System.in);

List<Registration> rg = new ArrayList<Registration>();
List<Tree_Plantation> tp = new ArrayList<Tree_Plantation>();

System.out.println("=======WELCOME TO TREE PLANTATION=========");

System.out.println("Enter Your Name");
String Name = s.nextLine();
System.out.println("Enter Your Fater NAME");
String Fathers_Name = s.nextLine();
System.out.println("Enter Your Email");
String Email = s.nextLine();
System.out.println("Enter Your Address");
String Address = s.nextLine();
System.out.println("====Please wait=====");
//Creating object of registration
Registration r = new Registration();
r.setName(Name);
r.setAddress(Address);
r.setEmail(Email);
r.setFathers_Name(Fathers_Name);
//Saving the data into List
rg.add(r);

System.out.print("Data Adding the List\n" +rg);
rg.remove(0);
System.out.print("Data removing the List\n" +rg);
System.out.println(" Registration Successfully\n");
	}
}
