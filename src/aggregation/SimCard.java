package aggregation;

public class SimCard {

	private String operator;
	private int numberOfSim;

	public SimCard() {
		super();
	}

	public SimCard(String operator, int numberOfSim) {
		super();
		this.operator = operator;
		this.numberOfSim = numberOfSim;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public int getNumberOfSim() {
		return numberOfSim;
	}

	public void setNumberOfSim(int numberOfSim) {
		this.numberOfSim = numberOfSim;
	}

	@Override
	public String toString() {
		return "SimCard [operator=" + operator + ", numberOfSim=" + numberOfSim + "]";
	}

}
