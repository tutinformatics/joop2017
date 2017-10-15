package window;

import control.ControlButton;

class RearWindow extends Window{
	
	private ControlButton buttonK;

	RearWindow(String name, ControlButton buttonK) {
		super(name);
		this.buttonK = buttonK;
	}
	
	@Override
	public void openPartially() {
		if (!buttonK.isBlocked()) {
			super.openPartially();
		}
	}
	
	@Override
	public void openFully() {
		if (!buttonK.isBlocked()) {
			super.openFully();
		}
	}
}
