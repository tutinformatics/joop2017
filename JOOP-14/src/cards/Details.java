package cards;

public class Details {
	
	public Details() {
		System.out.println("--detail---");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		return "details";
	}
}
