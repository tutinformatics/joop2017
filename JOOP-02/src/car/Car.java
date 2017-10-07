package car;

public class Car {
		
	private Wheel wheel;
	
	int getWheelSize() {
		return wheel.getSize();
	}

	@Override
	public String toString() {
		return "Car, wheel size " + 
				wheel.getSize();
	}
}




