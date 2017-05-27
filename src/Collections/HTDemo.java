package Collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HTDemo {

	public static void main(String[] args) {
		Hashtable<String, Double> balance = new Hashtable<String, Double>();

		Enumeration<String> names;

		String str;
		double bal;

		balance.put("Джон Доу", new Double(3434.34));
		balance.put("Том Сміт", new Double(123.22));
		balance.put("Джейе Бейкер", new Double(1378.00));
		balance.put("Тод Хал", new Double(99.22));
		balance.put("Ральф Сміт", new Double(-19.08));

		names = balance.keys();

		while (names.hasMoreElements()) {
			str = names.nextElement();
			System.out.println(str + " " + balance.get(str));
		}

		System.out.println();

		bal = balance.get("Джон Доу");
		balance.put("Джон Доу", bal + 1000);
		System.out.println("Новий залишок на рахунку Джона Доу: " + balance.get("Джон Доу"));
	}

}
