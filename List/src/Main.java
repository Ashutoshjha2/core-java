import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	Banking B = new Banking();
	LoanDetails LD = new LoanDetails();
	List<LoanDetails> ld = new ArrayList<LoanDetails>();
 
	System.err.println("Please Enter Your Costumer Details ");
	
	System.out.println("Enter Your Name ");
	B.setName(s.nextLine());
	System.out.println("Enter Your FathersName ");
	B.setFathersName(s.nextLine());
	System.out.println("Enter Your Email ");
	B.setEmail(s.nextLine());
	System.out.println("Enter Your Address ");
	B.setAddress(s.nextLine());
	System.out.println("Enter Your City ");
	B.setCity(s.nextLine());
	System.out.println("Enter Your State ");
	B.setState(s.nextLine());
	System.out.println("Enter the Mobile  ");
	 B.setMobile(Long.parseLong(s.nextLine()));
	 
	 System.err.println("============ Pease wait ============");
	 
	 System.out.println("Your Details is Successfully");
	 System.out.println("");
	 System.err.println("======= Welcome to Loan Details ===== ");

	 
	 System.out.println("Max. Education Loan = 700000/-");
	 System.out.println("Max. KCC Loan = 300000/-");
	 System.out.println("Max. Housing Loan = 1500000/-");
	 System.out.println("Max. Presonal Loan = 600000/-");
	 System.out.println("Max. Tractor Loan = 500000/-");
	 
	 
	    LD.setAccountNumber(1234567);
        LD.setLoanInterest(12);
        LD.setAccountHolder("Vivek Bhai");
        LD.setLoanAmount(100000);
        LD.setSubsidary(50000);
		
		ld.add(new LoanDetails("Naman",11111,6666,77777,888));	
		ld.add(new LoanDetails("Ayushi",765,987,567,657));
		ld.add(new LoanDetails("Alok",123,456,789,879));
		ld.add(new LoanDetails("Dimpal",768,989,563,650));
		ld.add(new LoanDetails("Prince",1239,4567,7897,8797));

		  for (LoanDetails LongDetails : ld) {
			  System.out.println(LongDetails);
			  }
		 	 
	 System.err.println("Thank you ");
	 System.out.println(B);
	 System.out.println(LD);
}
}
