package equals;

public class EqualsOrNot {
	void seeIfEquals() {
		String john = "John";
		String john2 = new String("John");
		
		if (john == john2) {
			System.out.println("Equality for Johns!");
		} else {
			System.out.println("... or not?");
		}
		
		if (john.equals(john2)) {
			System.out.println("Equality for Johns!");
		} else {
			System.out.println("... or not?");
		}
		
	}
	
	public static void main(String[] args) {
		new EqualsOrNot().seeIfEquals();
	}
}
