package composition;

public class Body {

	private String skinColor;
	private boolean tatoo;

	Head head;
	Hand hand = new Hand();

	public Body() {
		super();
	}

	public Body(String skinColor, boolean tatoo, int numberOfEyes, String haireColor, boolean brains,
			int numberOfFingers) {
		super();
		this.skinColor = skinColor;
		this.tatoo = tatoo;
		this.head = new Head(numberOfEyes, haireColor, brains);
		this.hand = new Hand(numberOfFingers);
	}

	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		this.head = head;
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	@Override
	public String toString() {
		return "Body [skinColor=" + skinColor + ", tatoo=" + tatoo + ", head=" + head + ", hand=" + hand + "]";
	}
	
	public void vaweHand(){
		hand.vaweHand();
	}

}
