package fruits;

import java.time.LocalDate;

public class Apple implements Fruit{
	Shape getShape() {
		return new Shape();
	}

	// kui kirjute [le mingi meetodi
	// kasutage annotatsiooni!
	@Override
	public double getWeight() {
		return 0.1;
	}

}
