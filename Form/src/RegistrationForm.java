public class RegistrationForm 
{
	private int ID;
	private int DOB;
	private int Contact;
	private String Name;
	private String Fathers;
	private String Email;
	private String Address;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
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
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getFathers() {
		return Fathers;
	}
	public void setFathers(String fathers) {
		Fathers = fathers;
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
	public RegistrationForm(int iD, int dOB, int contact, String name, String fathers, String email, String address) {
		super();
		ID = iD;
		DOB = dOB;
		Contact = contact;
		Name = name;
		Fathers = fathers;
		Email = email;
		Address = address;
	}
	public RegistrationForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "RegistrationForm [ID=" + ID + ", DOB=" + DOB + ", Contact=" + Contact + ", Name=" + Name + ", Fathers="
				+ Fathers + ", Email=" + Email + ", Address=" + Address + "]";
	}
	
	
	}


