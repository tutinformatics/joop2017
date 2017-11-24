import airport.AirportController;
import storage.TicketStorage;

public class Airport {
	public static void main(String[] args) {
		
		TicketStorage storage = new TicketStorage();
		AirportController controller = new AirportController(storage);
		
		try {
			controller.runAirport();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
