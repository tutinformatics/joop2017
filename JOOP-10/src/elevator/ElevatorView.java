package elevator;

public class ElevatorView {
	public String getJSON(Elevator elevator) {
		return "{"
				+ "\"id\": " + elevator.getId() + ","
				+ "\"price\": " + elevator.getPrice()
				+ "}";
	}
}
