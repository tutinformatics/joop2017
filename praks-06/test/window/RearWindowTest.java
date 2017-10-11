package window;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import control.ControlButton;

public class RearWindowTest {
	
	private RearWindow rearWindow;
	private ControlButton buttonK;

	@Before
	public void setupTests() {
		this.buttonK = new ControlButton();
		this.rearWindow = new RearWindow("C", buttonK);
	}
	
	@Test
	public void testRearWindowOpeningBlocked() {
		buttonK.changeState();
		rearWindow.openPartially();
		assertEquals(0, rearWindow.getState());
	}
	
	@Test
	public void testRearWindowClosesWhenBlocked() {
		rearWindow.openPartially();
		buttonK.changeState();
		rearWindow.closeFully();
		assertEquals(0, rearWindow.getState());
	}
	
	@Test
	public void testRearWindowDoesNotOpenFullyWhenBlocked() {
		buttonK.changeState();
		rearWindow.openFully();
		assertEquals(0, rearWindow.getState());
	}
	
	@Test
	public void createWindowAIsOfTypeRearWindow() {
		Window w = Window.getRearWindow("C", buttonK);
		assertEquals(RearWindow.class, w.getClass());
	}
}
