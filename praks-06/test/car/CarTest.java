package car;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import control.ControlButton;
import window.Window;

public class CarTest {
	
	private ControlButton buttonK;
	private Car car;

	@Before
	public void setup() {
		this.buttonK = new ControlButton();
		
		this.car = new Car(Window.getFrontWindow("B"),
				Window.getFrontWindow("A"),
				Window.getRearWindow("C", buttonK),
				Window.getRearWindow("D", buttonK),
				buttonK);
	}

	@Test
	public void testButtonNotBlockedForNewCar() {
		assertFalse(buttonK.isBlocked());
	}
	
	@Test
	public void testButtonBlocksRearWindows() {
		car.disableRearWindows();
		assertTrue(buttonK.isBlocked());
	}

	@Test
	public void testButtonUnblocksRearWindows() {
		car.disableRearWindows();
		car.enableRearWindows();
		assertFalse(buttonK.isBlocked());
	}
	
	@Test
	public void testFrontWindowExists() {
		assertTrue(car.getWindowA() != null);
		assertTrue(car.getWindowB() != null);
	}
	
	@Test
	public void testRearWindowExists() {
		assertTrue(car.getWindowC().isPresent());
		assertTrue(car.getWindowD().isPresent());
	}
	
	@Test
	public void testRearWindowMissingForElectricCar() {
		Car car = new Car(
				Window.getFrontWindow("A"),
				Window.getFrontWindow("B"),
				buttonK);
		assertFalse(car.getWindowC().isPresent());
		assertFalse(car.getWindowD().isPresent());
	}
}
