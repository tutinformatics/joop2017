package shadow;

public class DarkShadow extends Shadow {
	
	// do not duplicate fields from super class!
	private String name = "Bloody Mary";
	private int darkness = 3;
	
	@Override
	void castShadow() {
		InnerShadow is = new InnerShadow();
		is.soulSeeker();
		System.out.println("Dark shadow is falling..");
		System.out.println("... on " + name);
	}
	
	private class InnerShadow{
		private void soulSeeker() {
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			// siin jatkub programmi t88
		}
	}
	
	// do not try this at home
	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (other instanceof DarkShadow) {
			DarkShadow s = (DarkShadow) other;
			if (super.equals(other)) {
				return darkness == s.darkness;
			}
		} else if (other instanceof Shadow) {
			return super.equals(other);
		}
		return false;
	}
}
