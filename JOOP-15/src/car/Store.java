package car;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Store {
	
	private List<Car> cars;

	public void getNextCar(Predicate<Car> condition) {
		synchronized (cars) {
			List<Car> foundCars = cars.stream()
			.filter(condition)
			.collect(Collectors.toList());
			
			// wait if no car matching 
		}
		
	}

}
