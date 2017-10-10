package coffee;

public class Initializer {
	public static void main(String[] args) {
		// this is where dependencies are created
		Grinder grinder = new EspressoGrinder();
		WaterBoiler boiler = new WaterBoiler();
		// his is where dependencies are injected
		new CoffeeMachine(grinder, boiler);
	}
}
