package fruits;

import java.time.LocalDate;

public interface Fruit {
	public double getWeight();
	default public LocalDate pickedDate() {
		throw new RuntimeException("Not implemented!");
	}
}
