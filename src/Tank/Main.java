package Tank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		Methods methods = new Methods();
		boolean work = true;
		while (work) {
			Menu menu = new Menu();
			menu.main_menu();
			String choise = scanner.next();
			switch (choise) {
			case "1": {
				methods.show_data();
				break;
			}
			case "2": {
				methods.find_by_id_new();
				break;
			}
			case "3": {
				methods.remove_by_id();
				break;
			}
			case "4": {
				methods.add_new_into_data();
				break;
			}
			case "5": {
				methods.update_information();
			}
			case "6": {
				System.exit(0);
			}
			}
		}
	}

}
