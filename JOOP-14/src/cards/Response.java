package cards;

public class Response {
	private Details cardDetails;
	private Details points;
	
	public Details getCardDetails() {
		return cardDetails;
	}
	public void setCardDetails(Details cardDetails) {
		this.cardDetails = cardDetails;
		System.out.println("setting details");
	}
	public Details getPoints() {
		return points;
	}
	public void setPoints(Details points) {
		this.points = points;
	}
}
