package elevator;

public class ElevatorBad {
	
	boolean onCall = false;
	boolean expressMode = false;
	
	public ElevatorBad() {
		// TODO Auto-generated constructor stub
	}
	
	void pushCallButtonAction(int floorNumber) {
		if (expressMode && onCall) {
			// dont stop
		} else {
			// stop
		}
	}
}

