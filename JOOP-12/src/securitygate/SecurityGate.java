package securitygate;

import java.util.Optional;

import airline.BoardingPass;
import storage.TicketStorage;

public class SecurityGate implements SecurityGateDatabase{

	private TicketStorage storage;

	public SecurityGate(TicketStorage storage) {
		this.storage = storage;
		// TODO Auto-generated constructor stub
	}
	
	private void processTicket(BoardingPass boardingPass) {
		System.out.println("Registreeritud pardakaart nr: "
				+ boardingPass.getTicketCode()
				+ ": "
				+ boardingPass.getPassengerFirstName()
				+ " "
				+ boardingPass.getPassengerLastName());		
	}

	private void fetchTickets() {
		try {
			while(!Thread.interrupted()) {
				BoardingPass ticket = storage.getTicket();
				processTicket(ticket);	
			}
		} catch (InterruptedException e) {
			System.out.println("I quit.");
		}
	}
	
	/*
	 * This thread finishes when fetchTickets() finishes
	 * but this is more tricky, because...
	 * ... fetchTickets() finishes only when thread is 
	 * interrupted (you have to interrupt it from your code,
	 * it our case from controller)
	 * */
	@Override
	public void run() {
		fetchTickets();
	}
}




