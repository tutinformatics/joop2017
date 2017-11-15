package airport;

import airline.AirlineTicketService;
import airline.NordicaTicketService;
import securitygate.SecurityGate;
import securitygate.SecurityGateDatabase;
import storage.TicketStorage;

/*
 * we refactored controller to 
 * start up the system
 * controller does not process tickets any more
 * 
 * */
public class AirportController {

	private TicketStorage storage;

	public AirportController(TicketStorage storage) {
		this.storage = storage;
	}

	public void runAirport() throws InterruptedException {
		startNewTicketService();
		startNewTicketService();
		
		Thread gateRunner1 = startAndReturnNewGate();
		Thread gateRunner2 = startAndReturnNewGate();
		
		Thread.sleep(7_000);
		
		gateRunner1.interrupt();
		gateRunner2.interrupt();
	}

	private Thread startAndReturnNewGate() {
		SecurityGateDatabase gate = new SecurityGate(storage);
		Thread gateRunner = new Thread(gate);
		gateRunner.start();
		return gateRunner;
	}

	private void startNewTicketService() {
		AirlineTicketService ticketService = new NordicaTicketService(storage);
		Thread nordicaRunner = new Thread(ticketService);
		nordicaRunner.start();
	}
}







