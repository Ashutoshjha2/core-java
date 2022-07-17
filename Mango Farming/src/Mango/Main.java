package Mango;

public class Main {

	public static void main(String[] args)
	{
		Farming f = new Farming(1,150, "KrishnaBhog","Best","Sitamarhi");
		Farming f1 = new Farming(7,250, "Safeda Malda","Good","JayNagar");
		Farming f2 = new Farming(5,350, "Bambai","Low","Patna");
		f.setNumber(2);
		f1.setAddress("Madhubani");
		f2.setCost(200);
		System.out.println(f);
		System.err.println(f1);
		System.out.println(f2);
	}

}
