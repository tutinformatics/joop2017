package window;

import control.ControlButton;

public class WindowFactory {

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
}
