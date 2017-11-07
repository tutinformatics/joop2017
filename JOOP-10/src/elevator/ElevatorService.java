package elevator;

/*
 * 
 * example of service that goes with thin domain model
 * business logic is separated into service and not included in domain model
 * 
 * */

public class ElevatorService {
	
	StopStrategy strategy;
	
	void pushCallButtonAction(Elevator elevator, int floorNumber) {
		if(strategy.stopRequired(floorNumber)) {
			// operate elevator object to stop
		}
	}
}
