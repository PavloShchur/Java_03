package Queue_additional;

import java.util.Scanner;
import java.util.UUID;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	static final int capacity = Main.scanner.nextInt();

	public static void main(String[] args) {

		boolean work = true;
		MyQueue myQueue = new MyQueue();
		while (work) {
			Menu menu = new Menu();
			menu.menu();
			String choice = Main.scanner.next();
			switch (choice) {
			case "1":
				String name = UUID.randomUUID().toString().replaceAll("[^a-zA-Z]", "").toUpperCase().substring(0, 2);
				int age = 16 + (int) (Math.random() * 90);
				myQueue.offer(new Person(name, age));
				break;
			case "2" :
				myQueue.add_person();
				break;
			case "3" :
				myQueue.iterator();
//				myQueue.show_all_persons();
				break;
			case "4" :
				myQueue.offerNewPerson();
				break;
			case "5" :
				myQueue.sort_by_year();
				break;	
			}
		}
		
		

	}

}
