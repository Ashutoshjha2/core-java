package atm;
public class Registration {
String Name; 
String Fathers_Name;
String Email;
String Address;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getFathers_Name() {
	return Fathers_Name;
}
public void setFathers_Name(String fathers_Name) {
	Fathers_Name = fathers_Name;
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
public Registration() {
	super();
	// TODO Auto-generated constructor stub
}
public Registration(String name, String fathers_Name, String email, String address) {
	super();
	Name = name;
	Fathers_Name = fathers_Name;
	Email = email;
	Address = address;
}
@Override
public String toString() {
	return "Registration [Name=" + Name + ", Fathers_Name=" + Fathers_Name + ", Email=" + Email + ", Address=" + Address
			+ "]";
}

}
