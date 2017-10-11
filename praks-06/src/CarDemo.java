import java.util.Arrays;
import java.util.List;

import control.ControlButton;
import window.Window;

public class CarDemo {
	public static void main(String[] args) {
		ControlButton buttonK = new ControlButton();
		
		List<Window> windows = Arrays.asList(
				Window.getFrontWindow("B"),
				Window.getFrontWindow("A"),
				Window.getRearWindow("C", buttonK),
				Window.getRearWindow("D", buttonK));
		
		for (Window window : windows) {
			window.openFully();
			window.closePartially();
			window.closeFully();
			buttonK.changeState();
			window.openPartially();
			window.closeFully();
			System.out.println("End of cycle");
		}
		
		System.out.println("Success!");
	}
}
