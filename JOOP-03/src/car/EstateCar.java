package car;

public class EstateCar extends Car{
	
	public EstateCar(String model) {
		super(model + " S");
		System.out.println("Me! Me! Not...");
	}
	
	@Override
	public void drive() {
		System.out.println("Ride");
	}
	
	// overload
	public void drive(String destination) {
		super.drive();
		System.out.println("... to " + destination);
	}
	
	
	public static void main(String[] args) {
		new EstateCar("Fiat").drive();
		new EstateCar("Tesla").drive("Tartu");
	}
}

