package Student;
public class Students {
	 int id ;
	 private String sname;
	 String sadd;
	 long phone;
	 public int getId() {
		return id;
	}
   public void setId(int id) {
		this.id = id;
	}
   public String getSname() {
		return sname;
	}
   public void setSname(String sname) {
		this.sname = sname;
	}
   public String getSadd() {
		return sadd;
	}
   public void setSadd(String sadd) {
		this.sadd = sadd;
	}
   public long getPhone() {
		return phone;
	}
  public void setPhone(long phone) {
		this.phone = phone;
	}
  @Override
	public String toString() {
		return "Students [id=" + id + ", sname=" + sname + ", sadd=" + sadd + ", course=" +  ", phone=" + phone+ "]";				
	}	 
	}
