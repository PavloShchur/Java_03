package economics;

public class Supermarket {

	private String name;
	private int number_of_cash_desks;
	private int budget;
	private boolean parking;
	private boolean discounts;
	
	 

	public Supermarket(String name, int number_of_cash_desks, int budget, boolean parking, boolean discounts) {
		super();
		this.name = name;
		this.number_of_cash_desks = number_of_cash_desks;
		this.budget = budget;
		this.parking = parking;
		this.discounts = discounts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber_of_cash_desks() {
		return number_of_cash_desks;
	}

	public void setNumber_of_cash_desks(int number_of_cash_desks) {
		this.number_of_cash_desks = number_of_cash_desks;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public boolean isDiscounts() {
		return discounts;
	}

	public void setDiscounts(boolean discounts) {
		this.discounts = discounts;
	}

	@Override
	public String toString() {
		return "Supermarket [name=" + name + ", number_of_cash_desks=" + number_of_cash_desks + ", budget=" + budget
				+ ", parking=" + parking + ", discounts=" + discounts + "]";
	}

}
