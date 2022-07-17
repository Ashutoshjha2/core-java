package atm;
public class Tree_Plantation {
String Plant_Name;
int Total_Plant;
int Plant_Amount;
String Plant_Quality;
public String getPlant_Name() {
	return Plant_Name;
}
public void setPlant_Name(String plant_Name) {
	Plant_Name = plant_Name;
}
public int getTotal_Plant() {
	return Total_Plant;
}
public void setTotal_Plant(int total_Plant) {
	Total_Plant = total_Plant;
}
public int getPlant_Amount() {
	return Plant_Amount;
}
public void setPlant_Amount(int plant_Amount) {
	Plant_Amount = plant_Amount;
}
public String getPlant_Quality() {
	return Plant_Quality;
}
public void setPlant_Quality(String plant_Quality) {
	Plant_Quality = plant_Quality;
}
public Tree_Plantation() {
	super();
	// TODO Auto-generated constructor stub
}
public Tree_Plantation(String plant_Name, int total_Plant, int plant_Amount, String plant_Quality) {
	super();
	Plant_Name = plant_Name;
	Total_Plant = total_Plant;
	Plant_Amount = plant_Amount;
	Plant_Quality = plant_Quality;
}
@Override
public String toString() {
	return "Tree_Plantation [Plant_Name=" + Plant_Name + ", Total_Plant=" + Total_Plant + ", Plant_Amount="
			+ Plant_Amount + ", Plant_Quality=" + Plant_Quality + "]";
}

}
