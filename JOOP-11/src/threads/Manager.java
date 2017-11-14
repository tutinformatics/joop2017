package threads;

public class Manager {
	public static void main(String[] args) {
		
		SharedData counter = new SharedData();
		
		Worker worker = new Worker("John", counter);
		Worker worker2 = new Worker("Mary", counter);
		
		// we can execute run() method ourselves but they would not be threaded
		/*worker.run();
		worker.run();
		worker2.run();*/
		
		// pass Runnable objects as Thread arguments
		Thread t1 = new Thread(worker);
		Thread t2 = new Thread(worker2);
		t1.start();
		t2.start();
		try {
			// send interrupt signal to thread
			//Thread.sleep(3);
			//t1.interrupt();
			
			// main thread waits until t1 finishes it's job
			t1.join();
			// main thread waits until t2 finishes it's job
			t2.join();
			// main thread continues
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Hei, progejad!");
		System.out.println(counter.getAmount());
		
	}
}
