package Management;

public class Plant {
public int NumberOfPlant;
public String PlantName;
public String CostumerName;
public String CostumerEmail;
public String CostumerAddress;
public String CostumerCity;
public String State;
public int CostumerContact;

public Plant(int numberOfPlant, String plantName, String costumerName, String costumerEmail, String costumerAddress,
		String costumerCity, String state, int costumerContact) {
	super();
	NumberOfPlant = numberOfPlant;
	PlantName = plantName;
	CostumerName = costumerName;
	CostumerEmail = costumerEmail;
	CostumerAddress = costumerAddress;
	CostumerCity = costumerCity;
	State = state;
	CostumerContact = costumerContact;
}
public Plant() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Plant [NumberOfPlant=" + NumberOfPlant + ", PlantName=" + PlantName + ", CostumerName=" + CostumerName
			+ ", CostumerEmail=" + CostumerEmail + ", CostumerAddress=" + CostumerAddress + ", CostumerCity="
			+ CostumerCity + ", State=" + State + ", CostumerContact=" + CostumerContact + "]";
}

}
