package Hospital;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main{
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	Systemm A = new Systemm();
	Management M = new Management();
	List<Management> mt = new ArrayList<Management>();

	System.err.println("========== WELCOME TO HOSPITAL MANAGEMENT SYSTEM========");
	
	System.out.println("Enter Your Name ");
	A.setName(s.nextLine());
	System.out.println("Enter Your FathersName ");
	A.setFathersName(s.nextLine());
	System.out.println("Enter Your Email ");
	A.setEmail(s.nextLine());
	System.out.println("Enter Your Address ");
	A.setAddress(s.nextLine());
	System.out.println("Enter Your City ");
	A.setCity(s.nextLine());
	System.out.println("Enter Your State ");
	A.setState(s.nextLine());
	System.out.println("Enter the Mobile  ");
	 A.setMobile(Long.parseLong(s.nextLine()));
	 
	 System.err.println("============ Pease wait ============");
	 
	 System.out.println("Your Registration Details is Successfully");
	 System.err.println("======= Welcome to Hospital Details ===== ");

	 
	 System.out.println("MGM");
	 System.out.println("MAX");
	 System.out.println("AIIMS");
	 System.out.println("PATNA");
	 System.out.println("PARAS");
	 
	 
	    M.setHospital_Name("Appolo");
        M.setPatient_ID(12);
        M.setDoctor_Name("Vivek Bhai");
        M.setPatient_Name("Anjali");
        M.setDisease_Name("Fever");
        M.setCheckup_Date(7);
        M.setCare_Taker_Name("Ashu");
        M.setMedicine_Name("Calpol");
		
		mt.add(new Management("MGM",   1,8,   "VIVEK",      "Rupa","Amit","Cold","Cough Syrup"));	
		mt.add(new Management("MAX",   2,9,   "Ashu",       "Dimpal","Akshaya","fever","Dolo 650"));	
		mt.add(new Management("AIIMS", 3,10,  "Sanjeet",    "Sanjana","Mithun","typhiod","crux"));	
		mt.add(new Management("PATNA", 4,11,  "Prince",     "Priya","Roshan","Malaria","Dolo & calpol"));	
		mt.add(new Management("PARAS", 5,12,  "Alok",       "Sonam","Bipin","Dengu","gylcodin"));	

		
		  for (Management Management : mt) {
			  System.out.println(Management);
			  }
		 	 
	 System.err.println(A);
	 System.err.println(M);
	 System.out.println("Thank you for Everythings ");

}
}
