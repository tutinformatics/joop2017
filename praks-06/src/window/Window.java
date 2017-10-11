package window;

import control.ControlButton;

public class Window {

	private static final int MIN_STATE = 0;
	private static final int STATE_INCREMENT = 2;
	private static final int MAX_STATE = 10;
	private int windowState = MIN_STATE;
	private String name;
	
	public Window(String name) {
		this.name = name;
	}

	public static Window getFrontWindow(String name) {
		if (name.equals("A") || name.equals("B")) {
			return new Window(name);
		}
		throw new IllegalArgumentException("Invalid name");
	}
	
	public static Window getRearWindow(String name, ControlButton buttonK) {
		if (name.equals("C") || name.equals("D")) {
			return new RearWindow(name, buttonK);
		}
		throw new IllegalArgumentException("Invalid name");
	}
	
	public int getState() {
		return windowState;
	}

	public void openPartially() {
		windowState += STATE_INCREMENT;
		if (windowState > MAX_STATE) {
			windowState = MAX_STATE;
		}
	}

	public void openFully() {
		windowState = MAX_STATE;
	}

	public void closePartially() {
		if ((windowState-STATE_INCREMENT) < MIN_STATE) {
			windowState = MIN_STATE;
		} else {
			windowState -= STATE_INCREMENT;
		}
	}

	public void closeFully() {
		windowState = MIN_STATE;
	}
	
	@Override
	public String toString() {
		return "Aken " + name + ", avatus: " + (getState() * 10) + "%";
	}
}
