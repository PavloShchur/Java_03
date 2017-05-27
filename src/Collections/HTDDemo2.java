package Collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HTDDemo2 {
	public static void main(String[] args) {

		Hashtable<String, Double> balance = new Hashtable<String, Double>();

		String str;
		double bal;

		balance.put("Джон Доу", new Double(3434.34));
		balance.put("Том Сміт", new Double(123.22));
		balance.put("Джейе Бейкер", new Double(1378.00));
		balance.put("Тод Хал", new Double(99.22));
		balance.put("Ральф Сміт", new Double(-19.08));

		Set<String> set = balance.keySet();

		Iterator<String> iterator = set.iterator();

		while (iterator.hasNext()) {
			str = iterator.next();
			System.out.println(str + " " + balance.get(str));

		}

		System.out.println();

		bal = balance.get("Джон Доу");
		balance.put("Джон Доу", bal + 1000);
		System.out.println("Новий залишок на рахунку Джона Доу: " + balance.get("Джон Доу"));
	}
}