package shadow;

public class ShadowMan {
	public static void main(String[] args) {
		
		// this example shows how symmetry is 
		// violated when subclass DarkShadow
		// overrides equals() method of superclass Shadow()
		Shadow shadow = new DarkShadow();
		shadow.castTwice();
		
		Shadow shadow2 = new Shadow();
		
		if (shadow2.equals(shadow)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		if (shadow.equals(shadow2)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
