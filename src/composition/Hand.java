package composition;

public class Hand {

	private int numberOfFingers;

	public Hand() {
		super();
	}

	public Hand(int numberOfFingers) {
		super();
		this.numberOfFingers = numberOfFingers;
	}

	public int getNumberOfFingers() {
		return numberOfFingers;
	}

	public void setNumberOfFingers(int numberOfFingers) {
		this.numberOfFingers = numberOfFingers;
	}

	@Override
	public String toString() {
		return "Hand [numberOfFingers=" + numberOfFingers + "]";
	}
	
	public void vaweHand(){
		System.out.println("hand is vawing");
	}

}
