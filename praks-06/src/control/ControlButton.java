package control;

public class ControlButton {
	
	private boolean state = true; 

	public void changeState() {
		state = !state;
	}
	
	public boolean isBlocked() {
		return state;
	}
}
