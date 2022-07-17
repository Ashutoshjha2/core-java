package Mango;
public class Farming 
{
	private int Number;
	private int Cost;
	private String Name;
	private String Quality;
	private String Address;
	public int getNumber() {
		return Number;
	}
	public void setNumber(int number) {
		Number = number;
	}
	public int getCost() {
		return Cost;
	}
	public void setCost(int cost) {
		Cost = cost;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getQuality() {
		return Quality;
	}
	public void setQuality(String quality) {
		Quality = quality;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Farming(int number, int cost, String name, String quality, String address) {
		super();
		Number = number;
		Cost = cost;
		Name = name;
		Quality = quality;
		Address = address;
	}
	public Farming() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Farming [Number=" + Number + ", Cost=" + Cost + ", Name=" + Name + ", Quality=" + Quality + ", Address="
				+ Address + "]";
	}
	
}
