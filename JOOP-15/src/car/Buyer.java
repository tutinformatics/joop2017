package car;

import java.util.function.Predicate;

public class Buyer implements Runnable{
	
	private Store store;
	// you can safely store functional interface implementations on a class field!
	private Predicate<Car> buyCondition;

	public Buyer(Predicate<Car> buyCondition) {
		this.buyCondition = buyCondition;
	}

	private void getNextCar() {
		store.getNextCar(buyCondition);
	}
	
	@Override
	public void run() {
		while(!Thread.interrupted()) {
			getNextCar();
		}
	}

}
