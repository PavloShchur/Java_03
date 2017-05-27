package Collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {

	public static void main(String[] args) {
		TreeMap<String, Double> treeMap = new TreeMap<String, Double>(new TComp());

		treeMap.put("Джон Доу", new Double(3434.34));
		treeMap.put("Том Сміт", new Double(123.22));
		treeMap.put("Джейе Бейкер", new Double(1378.00));
		treeMap.put("Тод Хал", new Double(99.22));
		treeMap.put("Ральф Сміт", new Double(-19.08));

		Set<Map.Entry<String, Double>> entries = treeMap.entrySet();

		for (Map.Entry<String, Double> me : entries) {
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}

		System.out.println();

		double balance = treeMap.get("Джон Доу");
		treeMap.put("Джон Доу", balance + 1000);
		System.out.println("Новий залишок на рахунку Джона Доу: " + treeMap.get("Джон Доу"));	}

}
