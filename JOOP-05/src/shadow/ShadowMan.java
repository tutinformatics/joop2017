package shadow;

public class ShadowMan {
	public static void main(String[] args) {
		Shadow shadow = new DarkShadow();
		shadow.castTwice();
		
		Shadow shadow2 = new Shadow();
		
		if (shadow.equals(shadow2)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		if (shadow2.equals(shadow)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
