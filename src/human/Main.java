package human;

import aggregation.Phone;
import aggregation.SimCard;

public class Main {

	public static void main(String[] args) {
		SimCard simCard1 = new SimCard("kyivstar", 0671234567);
		SimCard simCard2 = new SimCard("life", 0637654321);
		
		Phone phone = new Phone("apple", "7s");		
		Phone phone1 = new Phone("samsung", "neon", simCard1);
		Phone phone2 = new Phone("nokia", "x2-02", simCard1, simCard2);
		
		Person person = new Person("Petro", 30, "white", false, 2, "brown", true, 10, phone2);
		person.personWaveHand();
		System.out.println(person);
	}

}
