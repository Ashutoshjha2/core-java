import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Details d = new Details();
		Decoration h = new Decoration();
		
		System.err.println("Please Enter Your Details\n ");
		
		System.out.println("Enter Your Name ");
		d.setName(s.nextLine());
		System.out.println("Enter Your Email ");
		d.setEmail(s.nextLine());
		System.out.println("Enter Your Address ");
		d.setAddress(s.nextLine());
		System.out.println("Enter the Mobile  ");
		 d.setMobile(Long.parseLong(s.nextLine()));
		 
		 System.err.println("============ Pease wait ============");
		 
		 System.out.println("Your Details is Successfully");
		 System.out.println("Cake = 200/-");
		 System.out.println("Flowers = 30/-");
		 System.out.println("Toffees = 10/-");
		 System.out.println("Candles = 60/-");
		 System.out.println("Balloons = 50/-");
		 
		System.err.println("======= Welcome to BADY Decoration ===== ");
		
		System.out.println("Enter the Flowers  ");
		  h.setFlowers(Integer.parseInt(s.nextLine()));
		  System.out.println("Enter the Cake  ");
		  h.setCake(Integer.parseInt(s.nextLine()));
		  System.out.println("Enter the Balloons  ");
		  h.setBalloons(Integer.parseInt(s.nextLine()));
		  System.out.println("Enter the Toffees  ");
		  h.setToffees(Integer.parseInt(s.nextLine()));
		  System.out.println("Enter the Candles  ");
		  h.setCandles(Integer.parseInt(s.nextLine()));
		  
		System.err.println("Thank you For Shopping");

		  System.err.println(d);
		  System.err.println(h);
	}

}
