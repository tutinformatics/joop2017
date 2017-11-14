package threads;
/*
 * Object that stores 
 * 
 * */
public class SharedData {
	private int amount;
	
	public SharedData() {
		amount = 10;
	}
	
	void increaseAmount() {
		// instead, we could also write synchronized keyword in front of method signature
		synchronized (this) {
			amount++;
		}
	}
	
	int getAmount() {
		return amount;
	}
}
