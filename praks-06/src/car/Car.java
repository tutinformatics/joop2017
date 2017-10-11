package car;

import java.util.Optional;

import control.ControlButton;
import window.Window;

public class Car {
	private ControlButton buttonK;
	
	private Window windowA;
	private Window windowB;
	private Window windowC;
	private Window windowD;
	
	public Car(Window windowA, Window windowB, ControlButton button) {
		this.windowA = windowA;
		this.windowB = windowB;
		buttonK = button;
	}
	
	public Car(Window windowA, Window windowB, Window windowC, Window windowD, ControlButton button) {
		this.windowA = windowA;
		this.windowB = windowB;
		this.windowC = windowC;
		this.windowD = windowD;
		buttonK = button;
	}
	
	public Window getWindowA() {
		return windowA;
	}
	
	public Window getWindowB() {
		return windowB;
	}
	
	public Optional<Window> getWindowC() {
		return Optional.ofNullable(windowC);
	}
	
	public Optional<Window> getWindowD() {
		return Optional.ofNullable(windowD);
	}

	public void disableRearWindows() {
		buttonK.changeState();		
	}
	
	public void enableRearWindows() {
		buttonK.changeState();
	}
}
