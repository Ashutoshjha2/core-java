public class Details {
	String Name;
	String Email ;
	String Address;
	long Mobile;
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
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getMobile() {
		return Mobile;
	}
	public void setMobile(long mobile) {
		Mobile = mobile;
	}
	@Override
	public String toString() {
		return "Details [Name=" + Name + ", Email=" + Email + ", Address=" + Address + ", Mobile=" + Mobile + "]";
	}
}