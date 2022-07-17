package com.connection;
public class Student {
private int ID;
private String Name;
private String Email;
private long Mobile;
private String Address;
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
public long getMobile() {
	return Mobile;
}
public void setMobile(long mobile) {
	Mobile = mobile;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int iD, String name, String email, long mobile, String address) {
	super();
	ID = iD;
	Name = name;
	Email = email;
	Mobile = mobile;
	Address = address;
}
@Override
public String toString() {
	return "Student [ID=" + ID + ", Name=" + Name + ", Email=" + Email + ", Mobile=" + Mobile + ", Address=" + Address
			+ "]";
}

}
