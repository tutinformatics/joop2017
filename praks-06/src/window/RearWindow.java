package window;

import control.ControlButton;

public class RearWindow extends Window{
	
	private ControlButton buttonK;

	public RearWindow(ControlButton buttonK) {
		this.buttonK = buttonK;
	}
	
	@Override
	public void openPartially() {
		if (!buttonK.isBlocked()) {
			super.openPartially();
		}
	}
}
