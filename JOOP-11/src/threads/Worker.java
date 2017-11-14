package threads;
/*
 * This runnable can be executed by a Thread object
 * 
 * */
public class Worker implements Runnable{
	
	private String name;
	private SharedData counter;

	public Worker(String name, SharedData counter) {
		this.name = name;
		this.counter = counter;
	}
	
	void iterativeOutput() {
		for (int i = 0; i < 10_000; i++) {
			if (!Thread.interrupted()) {
				singleOutput(i);
			}
		}
	}

	private void singleOutput(int i) {
		System.out.println(name + " is working " + i);
	}

	/*
	 * this method is automatically called by Thread
	 * 
	 * */
	@Override
	public void run() {
		iterativeCounter();
	}
	

	private void iterativeOutput2() {
		int i = 0;
		while(!Thread.interrupted()) {
			singleOutput(i);
			i++;
		}
	}
	
	private void iterativeCounter() {
		int i = 0;
		while(!Thread.interrupted() && i < 10_000) {
			counter.increaseAmount();
			i++;
		}
	}
}
