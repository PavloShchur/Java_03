package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, Double> hashMap = new HashMap<String, Double>();
		
		hashMap.put("Джон Доу", new Double(3434.34));
		hashMap.put("Том Сміт", new Double(123.22));
		hashMap.put("Джейе Бейкер", new Double(1378.00));
		hashMap.put("Тод Хал", new Double(99.22));
		hashMap.put("Ральф Сміт", new Double(-19.08));
		
		Set<Map.Entry<String, Double>> entries = hashMap.entrySet();
		
		for (Map.Entry<String, Double> me : entries) {
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}

			System.out.println();
			
			double balance = hashMap.get("Джон Доу");
			hashMap.put("Джон Доу", balance + 1000);
			System.out.println("Новий залишок на рахунку Джона Доу: " + hashMap.get("Джон Доу"));
	}

}
