package storage;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import airline.BoardingPass;

public class TicketStorage {
	
	List<BoardingPass> passes = new ArrayList<>();
	
	// do not use Integer as lock!
	Object lock = new Object();
	
	public void addTicket(BoardingPass ticket) {
		// can actually safely use passes instead of lock
		// no real need to create separte lock
		// just here to demonstrate the concept
		synchronized (lock) {
			passes.add(ticket);
			lock.notifyAll();
		}
	}

	public BoardingPass getTicket() throws InterruptedException {
		synchronized (lock) {
			while (passes.isEmpty()) {
				lock.wait();
			}
			return passes.remove(0);
		}
	}
	
}







