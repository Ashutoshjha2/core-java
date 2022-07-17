package com.hospital;
public class RegistrationForm {
	
	private int id;
	private String regname;
	private String regaddress;
	private String email;
	private String disease;
	private String regfee;
	private Hospital hospital;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRegname() {
		return regname;
	}
	public void setRegname(String regname) {
		this.regname = regname;
	}
	public String getRegaddress() {
		return regaddress;
	}
	public void setRegaddress(String regaddress) {
		this.regaddress = regaddress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getRegfee() {
		return regfee;
	}
	public void setRegfee(String regfee) {
		this.regfee = regfee;
	}
	public Hospital getHospital() {
		return hospital;
	}
	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
	public RegistrationForm(int id, String regname, String regaddress, String email, String disease, String regfee,
			Hospital hospital) {
		super();
		this.id = id;
		this.regname = regname;
		this.regaddress = regaddress;
		this.email = email;
		this.disease = disease;
		this.regfee = regfee;
		this.hospital = hospital;
	}
	public RegistrationForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RegistrationForm [id=" + id + ", regname=" + regname + ", regaddress=" + regaddress + ", email=" + email
				+ ", disease=" + disease + ", regfee=" + regfee + ", hospital=" + hospital + "]";
	}
	
	

}
