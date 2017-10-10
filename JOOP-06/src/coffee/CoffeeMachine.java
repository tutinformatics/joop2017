package coffee;

public class CoffeeMachine {
	private final Grinder grinder;
	private WaterBoiler boiler;
	
	// dependency injection in action here!
	public CoffeeMachine(Grinder grinder, WaterBoiler boiler) {
		this.grinder = grinder;
		this.boiler = boiler;
	}
	
	void prepareCoffee() {
		// can change object that is final
		grinder.setId(4);
	}
	
	void prepareHotWater() {
		
	}
	
	void goToSleepMode() {
		
	}
}
