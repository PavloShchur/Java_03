package Tank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Methods {
	List<Car> cars = new ArrayList<Car>();
	File file = new File("tank.txt");
	Scanner scanner = new Scanner(System.in);
	Menu menu = new Menu();

	public void add_new_into_data() throws IOException {
		boolean work = true;
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		System.out.println("Enter name of Id which you want to add");
		int ID = scanner.nextInt();
		for (int i = 0; i < cars.size(); i++) {
			if (ID == cars.get(i).getID()) {
				System.out.println("We have such a car");
				work = false;
			}
		}
		if (work == true) {
			FileWriter fileWriter = new FileWriter("tank.txt");
			String name = UUID.randomUUID().toString().replaceAll("[^a-zA-Z]", "").toUpperCase().substring(0, 2);
			int year = 16 + (int) (Math.random() * 90);
			int maxSpeed = 16 + (int) (Math.random() * 90);
			String model = UUID.randomUUID().toString().replaceAll("[^a-zA-Z]", "").toUpperCase().substring(0, 2);
			cars.add(new Car(ID, name, year, maxSpeed, model));
			for (int j = 0; j < cars.size(); j++) {
				fileWriter.write(cars.get(j) + "\n");
			}
			fileWriter.close();
		}
		bufferedReader.close();
	}


	public void show_data() throws NumberFormatException, IOException {
	    String format = "|%1$-7s|%2$-10s|%3$-10s|%4$-12s|%5$-10s|\n";
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedRead = new BufferedReader(fileReader);
		String tmp;
		System.out.format(format, "ID", "name", "year", "maxSpeed", "model");
		while ((tmp = bufferedRead.readLine()) != null) {
			String[] array = tmp.split("\\s*(=>|,|\\s)\\s*");
			System.out.format(format, (array[1]), (array[3]), (array[5]),
					(array[7]), (array[9]));
		}
		bufferedRead.close();

	}

	public void find_by_id_new() throws NumberFormatException, IOException {
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedRead = new BufferedReader(fileReader);
		String tmp;
		while ((tmp = bufferedRead.readLine()) != null) {
			String[] array = (tmp.replaceAll("\\D+", " ").trim().split(" "));
			System.out.println("Enter name of Id which you want to show");
			int IDNumber = scanner.nextInt();
			System.out.println(tmp);
		}
	}

	public void remove_by_id() throws IOException {
		boolean delete = true;
		FileReader fileReader = new FileReader("tank.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String tmp;
		while ((tmp = bufferedReader.readLine()) != null) {
			String[] temp = tmp.split("\\s*(=>|,|\\s)\\s*");
			cars.add(new Car(Integer.parseInt(temp[1]), temp[3], Integer.parseInt(temp[5]), Integer.parseInt(temp[7]),
					temp[9]));
		}
		FileWriter fileWriter = new FileWriter("tank.txt");
		System.out.println("Enter name of Id which you want to delete");
		int ID = scanner.nextInt();
		for (int i = 0; i < cars.size(); i++) {
			if (ID == cars.get(i).getID()) {
				cars.remove(i);
				delete = false;
			} 
			for (int j = 0; j < cars.size(); j++) {
				fileWriter.write(cars.get(j) + "\n");
			}
			}
		if (delete == true) {
			System.out.println("We do not have such a car.");
		}
		cars.clear();
		fileWriter.close();
			bufferedReader.close();
		}
	
	public void update_information () throws IOException {
		boolean work = true;
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		System.out.println("Enter name of Id infotmation of which you want to update");
		int ID = scanner.nextInt();
		for (int i = 0; i < cars.size(); i++) {
			if (ID == cars.get(i).getID()) {
				System.out.println("What exactly do you want to update");
				int maxSpeedNex = scanner.nextInt();
				cars.get(i).setMaxSpeed(maxSpeedNex);
				work = false;	
			}
		}
		FileWriter fileWriter = new FileWriter(file);
		for (int j = 0; j < cars.size(); j ++) {
			fileWriter.write(cars.get(j) + "\n");
		}
		if (work == true) {
			System.out.println("We do not have such a car.");
		}
		fileWriter.close();
		cars.clear();
			bufferedReader.close();
		}
	}