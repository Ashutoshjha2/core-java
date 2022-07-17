package setterGetter;

public class MainClass {
	public static void main(String[] args) {
		SetterGetter sg = new SetterGetter(1, "vivek", "chitrakoot", "v@gmail.com");
		SetterGetter sg1 = new SetterGetter(2, "vivek", "chitrakoot", "v@gmail.com");
		SetterGetter sg2 = new SetterGetter();
		sg2.setId(3);
		sg2.setAddress("sitapur");
		System.out.println(sg);
		System.out.println(sg2);
		
	}
}
