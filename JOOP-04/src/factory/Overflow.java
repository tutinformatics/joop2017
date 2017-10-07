package factory;

public class Overflow {
	void overflow() {
		overflow();
	}
	
	public static void main(String[] args) {
		new Overflow().overflow();
	}
}
