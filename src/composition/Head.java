package composition;

public class Head {

	private int numberOfEyes;
	private String haireColor;
	private boolean brains;

	public Head() {
		super();
	}

	public Head(int numberOfEyes, String haireColor, boolean brains) {
		super();
		this.numberOfEyes = numberOfEyes;
		this.haireColor = haireColor;
		this.brains = brains;
	}

	public int getNumberOfEyes() {
		return numberOfEyes;
	}

	public void setNumberOfEyes(int numberOfEyes) {
		this.numberOfEyes = numberOfEyes;
	}

	public String getHaireColor() {
		return haireColor;
	}

	public void setHaireColor(String haireColor) {
		this.haireColor = haireColor;
	}

	public boolean isBrains() {
		return brains;
	}

	public void setBrains(boolean brains) {
		this.brains = brains;
	}

	@Override
	public String toString() {
		return "Head [numberOfEyes=" + numberOfEyes + ", haireColor=" + haireColor + ", brains=" + brains + "]";
	}

}
