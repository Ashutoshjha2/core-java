package home.design;

public class Registration<DreamHome> {
    int ID;
	String Name;
	String 	Email;
	int DOB;
	int Contact;
	DreamHome dream$Home;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getDOB() {
		return DOB;
	}
	public void setDOB(int dOB) {
		DOB = dOB;
	}
	public int getContact() {
		return Contact;
	}
	public void setContact(int contact) {
		Contact = contact;
	}
	public DreamHome getDream$Home() {
		return dream$Home;
	}
	public void setDream$Home(DreamHome dream$Home) {
		this.dream$Home = dream$Home;
	}
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Registration(int iD, String name, String email, int dOB, int contact, DreamHome dream$Home) {
		super();
		ID = iD;
		Name = name;
		Email = email;
		DOB = dOB;
		Contact = contact;
		this.dream$Home = dream$Home;
	}
	@Override
	public String toString() {
		return "Registration [ID=" + ID + ", Name=" + Name + ", Email=" + Email + ", DOB=" + DOB + ", Contact="
				+ Contact + ", dream$Home=" + dream$Home + "]";
	}
	

}
