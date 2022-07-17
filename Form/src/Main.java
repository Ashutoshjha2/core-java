public class Main {

	public static void main(String[] args) {

		RegistrationForm rf = new RegistrationForm(1, 1997, 9999, "Ashu", "Binay Jha", "a@gmail.com", "Kaluahi\n");

		RegistrationForm rf1 = new RegistrationForm(2, 1998, 8888, "Prince", "Pawan", "p@gmail.com", "Kaluahi\n");

		RegistrationForm rf2 = new RegistrationForm(3, 1999, 77777, "Bipin", "Anand", "b@gmail.com", "Kaluahi");
		
		rf.setID(0);
		rf1.setAddress("Madhubani");
		rf2.setDOB(2000);
		System.out.println(rf);
		System.err.println(rf1);
		System.out.println(rf2);

	}

}
