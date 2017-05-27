package economics;

public class Good {

	private String name_of_good;
	private Type_of_good type_of_good;
	private double price_of_good;
	private int number_of_goods;

	public Good(String name_of_good, Type_of_good type_of_good, double price_of_good, int number_of_goods) {
		super();
		this.name_of_good = name_of_good;
		this.type_of_good = type_of_good;
		this.price_of_good = price_of_good;
		this.number_of_goods = number_of_goods;
	}

	public String getName_of_good() {
		return name_of_good;
	}

	public void setName_of_good(String name_of_good) {
		this.name_of_good = name_of_good;
	}

	public Type_of_good getType_of_good() {
		return type_of_good;
	}

	public void setType_of_good(Type_of_good type_of_good) {
		this.type_of_good = type_of_good;
	}

	public double getPrice_of_good() {
		return price_of_good;
	}

	public void setPrice_of_good(double price_of_good) {
		this.price_of_good = price_of_good;
	}

	public int getNumber_of_goods() {
		return number_of_goods;
	}

	public void setNumber_of_goods(int number_of_goods) {
		this.number_of_goods = number_of_goods;
	}

	@Override
	public String toString() {
		return "Good [name_of_good=" + name_of_good + ", type_of_good=" + type_of_good + ", price_of_good="
				+ price_of_good + ", number_of_goods=" + number_of_goods + "]";
	}

}