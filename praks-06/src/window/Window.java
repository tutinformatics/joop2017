package window;

public class Window {

	private static final int MIN_STATE = 0;
	private static final int STATE_INCREMENT = 2;
	private static final int MAX_STATE = 10;
	private int windowState = MIN_STATE;
	private String name;
	
	Window(String name) {
		this.name = name;
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
