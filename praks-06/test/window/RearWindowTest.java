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
		this.rearWindow = new RearWindow(buttonK);
	}
	
	@Test
	public void testRearWindowOpenBlocked() {
		buttonK.changeState();
		rearWindow.openPartially();
		assertEquals(0, rearWindow.getState());
	}

}
