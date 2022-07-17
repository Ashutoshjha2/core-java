package System;
import java.util.Scanner;
public class Banking {
	String Name;
	String FathersName;
	String Email ;
	String Address;
	String City;
	String State;
	long Mobile;

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getFathersName() {
		return FathersName;
	}
	public void setFathersName(String fathersName) {
		FathersName = fathersName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public long getMobile() {
		return Mobile;
	}
	public void setMobile(long mobile) {
		Mobile = mobile;
	}
	
	@Override
	public String toString() {
		return "Banking [Name=" + Name + ", FathersName=" + FathersName + ", Email=" + Email + ", Address=" + Address
				+ ", City=" + City + ", State=" + State + ", Mobile=" + Mobile + "]";
	}
		
}
class LoanDetails extends Banking {
	long AccountNumber;
	int LoanAmount;
	float LoanInterest;
	float subsidary;
	public long getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		AccountNumber = accountNumber;
	}
	public int getLoanAmount() {
		return LoanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		LoanAmount = loanAmount;
	}
	public float getLoanInterest() {
		return LoanInterest;
	}
	public void setLoanInterest(float loanInterest) {
		LoanInterest = loanInterest;
	}
	public float getSubsidary() {
		return subsidary;
	}
	public void setSubsidary(float subsidary) {
		this.subsidary = subsidary;
	}
	@Override
	public String toString() {
		return "LoanDetails [AccountNumber=" + AccountNumber + ", LoanAmount=" + LoanAmount + ", LoanInterest="
				+ LoanInterest + ", subsidary=" + subsidary + "]";
	}
	
}



class Main extends LoanDetails {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Main B = new Main();
		
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
		 
		System.err.println("======= Welcome to Loan Details ===== ");

		 
		 System.out.println("Max. Education Loan = 700000/-");
		 System.out.println("Max. KCC Loan = 300000/-");
		 System.out.println("Max. Housing Loan = 1500000/-");
		 System.out.println("Max. Presonal Loan = 600000/-");
		 System.out.println("Max. Tractor Loan = 500000/-");
		 		
		System.out.println("Enter the Account Number  ");
		  B.setAccountNumber(Long.parseLong(s.nextLine()));
		  System.out.println("Enter the Loan Amount  ");
		  B.setLoanAmount(Integer.parseInt(s.nextLine()));
		  System.out.println("Enter the Loan Interest  ");
		  B.setLoanInterest(Float.parseFloat(s.nextLine()));
		  System.out.println("Enter the Subsidary  ");
		  B.setSubsidary(Float.parseFloat(s.nextLine()));
		  		  
		System.err.println("Thank you ");

		  System.out.println(B);
	}

}
