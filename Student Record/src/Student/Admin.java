package Student;
import java.util.Random;
import java.util.Scanner;
public class Admin {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		
		Random r  = new Random();
		int id = r.nextInt(100);
		Boolean  option = true;
		while (option) {
			System.err.println("Press 1:**** Registration Form ****\n");
			System.err.println("Press 2:**** Enter Course Name ****\n");
			System.err.println("Press 3:**** Exit ****\n");
			
	        System.out.println("Enter Your Option\n");
			int option2 =  Integer.parseInt(s.nextLine());
			switch (option2) {
			case 1:
				
				Students st= new Students();
				st.setId(id);
				System.out.println("Enter the Student Name");
				st.setSname(s.nextLine());
				System.out.println("Enter The Student Address");
				st.setSadd(s.nextLine());
				System.out.println("Enter the Student Mobile No");
				st.setPhone(Long.parseLong(s.nextLine()));
				
				System.err.println(st);
				
				System.out.println("1 to Login");
				System.out.println("2 Update Details");
				
				System.out.println("Enter the Option");
				int  option3 = Integer.parseInt(s.nextLine());
				switch (option3) {
				case 1:
					System.out.println("You Are swich case no 2");
					break;

				default:
					System.out.println("Invalid Details");
					break;
				}
				break;
				
			case 2:
				
				Course c = new Course();
				c.setId(id);
				System.out.println("Enter the Course Name");
				c.setCourse_name(s.nextLine());
				System.out.println("Enter The Teacher Name");
				c.setTeacher_name(s.nextLine());
				System.out.println("Enter the Course Fee");
				c.setCourse_Fee(Integer.parseInt(s.nextLine()));
				System.out.println("Enter the Course Duration");
				c.setCourse_Duration(Integer.parseInt(s.nextLine()));
				System.err.println(c);
				break;
				case 3:
					System.out.println("Are You Sure To Exit");
					option = false;
					break;
			default:
				System.err.println("Invaild Option");
				break;
			}
		}
		
		
        //int option = Integer.parseInt(s.nextLine());
       
	}
    }