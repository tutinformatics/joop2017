package storage;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import airline.BoardingPass;

public class TicketStorage {
	
	List<BoardingPass> passes = new ArrayList<>();
	
	Integer lock = 4;
	
	public void addTicket(BoardingPass ticket) {
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






