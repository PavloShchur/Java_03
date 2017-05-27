package exceptionsHomeWork;

import java.util.Scanner;

public class User_Validator {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean work = true;

		Methods methods = new Methods();

		while (work) {
			Menu menu = new Menu();
			menu.menu();
			String choice = User_Validator.scanner.next();

			switch (choice) {
			case "1" :
				methods.operation();
				break;
			case "2" :
				System.exit(0);
			}
			}
		}
}
