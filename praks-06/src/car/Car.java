package car;

import java.util.Optional;

import window.Window;

public class Car {
	private Window windowA;
	private Window windowB;
	private Window windowC;
	private Window windowD;
	
	public Window getWindowA() {
		return windowA;
	}
	
	public Optional<Window> getWindowC() {
		return Optional.ofNullable(windowC);
	}
	
}
