package fuelpump;

public class FuelPump {
	private static final int MAX_FUEL = 1000;
	private int fuelAmountInTank;
	
	int getFilledAmountPercent() {
		return fuelAmountInTank / MAX_FUEL * 100;
	}
}
