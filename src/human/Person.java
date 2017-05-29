package human;

import aggregation.Phone;
import composition.Body;

public class Person {

	private String name;
	private int age;
	Body body;
	Phone phone;

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age, String skinColor, boolean tatoo, int numberOfEyes, String haireColor,
			boolean brains, int numberOfFingers, Phone phone) {
		super();
		this.name = name;
		this.age = age;
		this.body = new Body(skinColor, tatoo, numberOfEyes, haireColor, brains, numberOfFingers);
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", body=" + body + ", phone=" + phone + "]";
	}
	
	public void personWaveHand(){
		body.vaweHand();
	}

}
