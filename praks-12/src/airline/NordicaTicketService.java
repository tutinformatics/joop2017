package airline;

import storage.TicketStorage;

public class NordicaTicketService implements AirlineTicketService{

	private static final int MAX_TICKETS = 370;
	private TicketStorage storage;

	public NordicaTicketService(TicketStorage storage) {
		this.storage = storage;
	}

	private void generateTickets() throws InterruptedException {
		for (int i = 1; i <= MAX_TICKETS; i++) {
			BoardingPass ticket = new NordicaBoardingPass("John", "Fu", i);
			storage.addTicket(ticket);
			Thread.sleep(300);
		}
	}
	
	/*
	 * This thread finishes when generateTickets() finishes
	 * */
	@Override
	public void run() {
		try {
			generateTickets();
		} catch (InterruptedException e) {
			System.out.println("Interrrupted");
		}
	}
}
