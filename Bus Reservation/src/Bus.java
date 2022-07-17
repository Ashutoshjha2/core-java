public class Bus {
private int BusNo;
private String BusDestination;
private String BusFare;
private String BusSeat;
public int getBusNo() {
	return BusNo;
}
public void setBusNo(int busNo) {
	BusNo = busNo;
}
public String getBusDestination() {
	return BusDestination;
}
public void setBusDestination(String busDestination) {
	BusDestination = busDestination;
}
public String getBusFare() {
	return BusFare;
}
public void setBusFare(String busFare) {
	BusFare = busFare;
}
public String getBusSeat() {
	return BusSeat;
}
public void setBusSeat(String busSeat) {
	BusSeat = busSeat;
}
public Bus() {
	super();
	// TODO Auto-generated constructor stub
}
public Bus(int busNo, String busDestination, String busFare, String busSeat) {
	super();
	BusNo = busNo;
	BusDestination = busDestination;
	BusFare = busFare;
	BusSeat = busSeat;
}
@Override
public String toString() {
	return "Bus [BusNo=" + BusNo + ", BusDestination=" + BusDestination + ", BusFare=" + BusFare + ", BusSeat="
			+ BusSeat + "]";
}

}