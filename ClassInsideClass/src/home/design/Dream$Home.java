package home.design;

public class Dream$Home {
int House_No;
String House_Name;
String Design;
int Concreate_Ton;
int Sand_Ton;
int Brick_Ton;
public int getHouse_No() {
	return House_No;
}
public void setHouse_No(int house_No) {
	House_No = house_No;
}
public String getHouse_Name() {
	return House_Name;
}
public void setHouse_Name(String house_Name) {
	House_Name = house_Name;
}
public String getDesign() {
	return Design;
}
public void setDesign(String design) {
	Design = design;
}
public int getConcreate_Ton() {
	return Concreate_Ton;
}
public void setConcreate_Ton(int concreate_Ton) {
	Concreate_Ton = concreate_Ton;
}
public int getSand_Ton() {
	return Sand_Ton;
}
public void setSand_Ton(int sand_Ton) {
	Sand_Ton = sand_Ton;
}
public int getBrick_Ton() {
	return Brick_Ton;
}
public void setBrick_Ton(int brick_Ton) {
	Brick_Ton = brick_Ton;
}
public Dream$Home() {
	super();
	// TODO Auto-generated constructor stub
}
public Dream$Home(int house_No, String house_Name, String design, int concreate_Ton, int sand_Ton, int brick_Ton) {
	super();
	House_No = house_No;
	House_Name = house_Name;
	Design = design;
	Concreate_Ton = concreate_Ton;
	Sand_Ton = sand_Ton;
	Brick_Ton = brick_Ton;
}
@Override
public String toString() {
	return "Dream$Home [House_No=" + House_No + ", House_Name=" + House_Name + ", Design=" + Design + ", Concreate_Ton="
			+ Concreate_Ton + ", Sand_Ton=" + Sand_Ton + ", Brick_Ton=" + Brick_Ton + "]";
}

}
