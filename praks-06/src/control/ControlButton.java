package control;

public class ControlButton {
	
	private boolean blocked = false; 

	public void changeState() {
		blocked = !blocked;
	}
	
	public boolean isBlocked() {
		return blocked;
	}
}
