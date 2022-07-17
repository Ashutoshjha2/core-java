package com.hospital;

public class Hospital {
	
	private int id;
	private String name;
	private String address;
	private String doctors;
	private String nurse;
	private String appointment;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDoctors() {
		return doctors;
	}
	public void setDoctors(String doctors) {
		this.doctors = doctors;
	}
	public String getNurse() {
		return nurse;
	}
	public void setNurse(String nurse) {
		this.nurse = nurse;
	}
	public String getAppointment() {
		return appointment;
	}
	public void setAppointment(String appointment) {
		this.appointment = appointment;
	}
	public Hospital(int id, String name, String address, String doctors, String nurse, String appointment) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.doctors = doctors;
		this.nurse = nurse;
		this.appointment = appointment;
	}
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Hospital [id=" + id + ", name=" + name + ", address=" + address + ", doctors=" + doctors + ", nurse="
				+ nurse + ", appointment=" + appointment + "]";
	}
	

}
