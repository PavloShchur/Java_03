package aggregation;

public class Main {

	public static void main(String[] args) {
		
		SimCard simCard1 = new SimCard("kyivstar", 0671234567);
		SimCard simCard2 = new SimCard("life", 0637654321);
		
		Phone phone = new Phone("apple", "7s");
		System.out.println(phone);
		
		Phone phone1 = new Phone("samsung", "neon", simCard1);
		System.out.println(phone1);
		
		Phone phone2 = new Phone("nokia", "x2-02", simCard1, simCard2);
		System.out.println(phone2);

	}

}
