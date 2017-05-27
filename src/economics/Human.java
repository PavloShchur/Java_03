package economics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Human {
	private String name_of_human;
	private int age;
	private int cash_of_human;
	private boolean car_of_human;
	
	Random random = new Random();
	
	List<Human> humans = new ArrayList<Human>();
	
	public void add_human () {
		String name= UUID.randomUUID().toString().replaceAll("[^a-zA-Z]", "").toUpperCase().substring(0, 2);
		int age = 16 + (int) (Math.random() * 90);
		int cash_of_human = 250 + (int) (Math.random() * 1000);
		boolean car_of_human = random.nextBoolean();
		humans.add(new Human(name, age, cash_of_human, car_of_human, random, humans));
	}
	
	


	public Human(String name_of_human, int age, int cash_of_human, boolean car_of_human, Random random,
			List<Human> humans) {
		super();
		this.name_of_human = name_of_human;
		this.age = age;
		this.cash_of_human = cash_of_human;
		this.car_of_human = car_of_human;
		this.random = random;
		this.humans = humans;
	}




	public String getName_of_human() {
		return name_of_human;
	}


	public void setName_of_human(String name_of_human) {
		this.name_of_human = name_of_human;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getCash_if_human() {
		return cash_of_human;
	}


	public void setCash_if_human(int cash_if_human) {
		this.cash_of_human = cash_if_human;
	}


	public boolean isCar_of_human() {
		return car_of_human;
	}


	public void setCar_of_human(boolean car_of_human) {
		this.car_of_human = car_of_human;
	}


	@Override
	public String toString() {
		return "Human [name_of_human=" + name_of_human + ", age=" + age + ", cash_if_human=" + cash_of_human
				+ ", car_of_human=" + car_of_human + "]";
	}
	
	
	

}
