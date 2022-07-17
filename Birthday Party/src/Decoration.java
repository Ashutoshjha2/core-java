public class Decoration {
	int Flowers;
	int Cake;
	int Balloons;
	int Toffees;
	int Candles;
	public int getFlowers() {
		return Flowers;
	}
	public void setFlowers(int flowers) {
		Flowers = flowers;
	}
	public int getCake() {
		return Cake;
	}
	public void setCake(int cake) {
		Cake = cake;
	}
	public int getBalloons() {
		return Balloons;
	}
	public void setBalloons(int balloons) {
		Balloons = balloons;
	}
	public int getToffees() {
		return Toffees;
	}
	public void setToffees(int toffees) {
		Toffees = toffees;
	}
	public int getCandles() {
		return Candles;
	}
	public void setCandles(int candles) {
		Candles = candles;
	}
	@Override
	public String toString() {
		return "Decoration [Flowers=" + Flowers + ", Cake=" + Cake + ", Balloons=" + Balloons + ", Toffees=" + Toffees
				+ ", Candles=" + Candles + "]";
	}
}
