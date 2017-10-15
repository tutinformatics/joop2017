import java.util.Arrays;
import java.util.List;

import control.ControlButton;
import window.Window;
import window.WindowFactory;

public class CarDemo {
	public static void main(String[] args) {
		ControlButton buttonK = new ControlButton();
		
		List<Window> windows = Arrays.asList(
				WindowFactory.getFrontWindow("B"),
				WindowFactory.getFrontWindow("A"),
				WindowFactory.getRearWindow("C", buttonK),
				WindowFactory.getRearWindow("D", buttonK));
		
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
