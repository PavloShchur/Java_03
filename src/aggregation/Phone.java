package aggregation;

public class Phone {

	private String brand;
	private String model;
	SimCard simCard;
	SimCard simCard2;

	public Phone() {
		super();
	}

	public Phone(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}

	public Phone(String brand, String model, SimCard simCard) {
		super();
		this.brand = brand;
		this.model = model;
		this.simCard = simCard;
	}

	public Phone(String brand, String model, SimCard simCard, SimCard simCard2) {
		super();
		this.brand = brand;
		this.model = model;
		this.simCard = simCard;
		this.simCard2 = simCard2;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", model=" + model + ", simCard=" + simCard + ", simCard2=" + simCard2 + "]";
	}
	
	

}
