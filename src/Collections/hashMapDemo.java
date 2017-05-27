package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, Double> hashMap = new HashMap<String, Double>();
		
		hashMap.put("���� ���", new Double(3434.34));
		hashMap.put("��� ���", new Double(123.22));
		hashMap.put("����� ������", new Double(1378.00));
		hashMap.put("��� ���", new Double(99.22));
		hashMap.put("����� ���", new Double(-19.08));
		
		Set<Map.Entry<String, Double>> entries = hashMap.entrySet();
		
		for (Map.Entry<String, Double> me : entries) {
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}

			System.out.println();
			
			double balance = hashMap.get("���� ���");
			hashMap.put("���� ���", balance + 1000);
			System.out.println("����� ������� �� ������� ����� ���: " + hashMap.get("���� ���"));
	}

}
