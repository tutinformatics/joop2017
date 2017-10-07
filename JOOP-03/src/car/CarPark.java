package car;

import java.util.ArrayList;
import java.util.List;

public class CarPark {
	List<Car> cars = new ArrayList<>();
	
	void listCars() {
		cars.add(new Car("Seat"));
		cars.add(new EstateCar("Renault"));
		
		for (Car car : cars) {
			car.drive();
		}
	}
}
