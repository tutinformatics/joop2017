package elevator;

/**
 * Elevator model
 * 
 * **/
public class Elevator {
	
	boolean onCall = false;
	private StopStrategy strategy;
	
	public Elevator(StopStrategy strategy) {
		this.strategy = strategy;
	}
	
	/*
	 * this method is a sign of fat domain model (as includes business logic)
	 * 	and 
	 * utilizes strategy (using strategy is independent of domain model type)
	 * **/
	void pushCallButtonAction(int floorNumber) {
		if(strategy.stopRequired(floorNumber)) {
			// stop
		}
	}
}

