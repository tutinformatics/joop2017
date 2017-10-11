package window;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WindowTest {
	
	private Window window;
	
	@Before
	public void setUpTests() {
		this.window = new Window();
	}

	@Test
	public void testNewWindowIsClosed() {
		assertEquals(0, window.getState());
	}
	
	@Test
	public void testOpenPartially() {
		window.openPartially();
		assertEquals(2, window.getState());
	}
	
	@Test
	public void openFully() {
		window.openFully();
		assertEquals(10, window.getState());
	}
	
	@Test
	public void testPartialClosing() {
		window.openFully();
		window.closePartially();
		window.closePartially();
		assertEquals(6, window.getState());
	}
	
	@Test
	public void testFullClosingFromFullOpen() {
		window.openFully();
		window.closeFully();
		assertEquals(0, window.getState());
	}
	
	@Test
	public void testFullClosingFromPartiallyOpen() {
		window.openPartially();
		window.closeFully();
		assertEquals(0, window.getState());
	}
	
	@Test
	public void doNotOpenOverMaxState() {
		window.openFully();
		window.openPartially();
		assertEquals(10, window.getState());
	}
	

}