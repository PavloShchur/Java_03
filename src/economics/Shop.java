package economics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Shop extends Supermarket {
	Type_of_good type_of_good;

	public Shop(String name, int number_of_cash_desks, int budget, boolean parking, boolean discounts) {
		super(name, number_of_cash_desks, budget, parking, discounts);
	}

	public Map<Department, List<Good>> getMap_supermarket() {
		return map_supermarket;
	}

	public void setMap_supermarket(Map<Department, List<Good>> map_supermarket) {
		this.map_supermarket = map_supermarket;
	}

	public Shop(String name, int number_of_cash_desks, int budget, boolean parking, boolean discounts,
			Map<Department, List<Good>> map_supermarket) {
		super(name, number_of_cash_desks, budget, parking, discounts);
		this.map_supermarket = map_supermarket;
	}

	private Map<Department, List<Good>> map_supermarket = new HashMap<>();
	private Set<Entry<Department, List<Good>>> set = map_supermarket.entrySet();
	
	

	public void add_department() {
		System.out.println("Please enter name of department");
		String name_of_department = Main.scanner.next();
		map_supermarket.put(new Department(name_of_department), new ArrayList<Good>());
	}

	public void add_good_to_department(String type) {

		System.out.println("Please enter name of department");
		String name_of_department = Main.scanner.next();

		Iterator<Entry<Department, List<Good>>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Entry<Department, List<Good>> entry = iterator.next();
			if (entry.getKey().getName_of_department().equalsIgnoreCase(name_of_department)) {
				System.out.println("Please enter name of good");
				String name_of_good = Main.scanner.next();
				System.out.println("Please enter price of good");
				double price_of_good = Main.scanner.nextDouble();
				System.out.println("Please enter number of goods");
				int number_of_goods = Main.scanner.nextInt();
				System.out.println("Please enter type of good");
				if (type.equals("Alcohol")) {
					entry.getValue().add(new Good(name_of_good, type_of_good, price_of_good, number_of_goods));
				} else if (type.equals("Food")) {
					entry.getValue().add(new Good(name_of_good, type_of_good, price_of_good, number_of_goods));
				} else if (type.equals("Household_chemicals")) {
					entry.getValue().add(new Good(name_of_good, type_of_good, price_of_good, number_of_goods));
				} else if (type.equals("Technique")) {
					entry.getValue().add(new Good(name_of_good, type_of_good, price_of_good, number_of_goods));
				} else if (type.equals("Toys")) {
					entry.getValue().add(new Good(name_of_good, type_of_good, price_of_good, number_of_goods));
				} else {
					System.out.println("Type is not correct");
				}

			}

		}

	}

	public void sort_by_price() {
		System.out.println("Please enter name of department");
		String name_of_department = Main.scanner.next();

		Iterator<Entry<Department, List<Good>>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Entry<Department, List<Good>> entry = iterator.next();
			if (entry.getKey().getName_of_department().equalsIgnoreCase(name_of_department)) {
				List<Good> goods = entry.getValue();
				Collections.sort(goods, new Sort_by_price());
			}
		}
	}
}
