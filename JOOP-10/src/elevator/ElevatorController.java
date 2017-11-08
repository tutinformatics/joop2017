package elevator;

public class ElevatorController {
	
	ElevatorView view = new ElevatorView();
	
	public String getFuelTankJSON(int tankId) {
		// use lambda to implment strategy
		// so you do not have to create a class
		StopStrategy strategy = num -> num > 10;
		Elevator elevator = new Elevator(strategy);
		
		return view.getJSON(elevator);
	}
}
