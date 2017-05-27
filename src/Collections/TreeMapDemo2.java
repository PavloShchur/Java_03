package Collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {

	public static void main(String[] args) {
		TreeMap<String, Double> treeMap = new TreeMap<String, Double>(new TComp());

		treeMap.put("���� ���", new Double(3434.34));
		treeMap.put("��� ���", new Double(123.22));
		treeMap.put("����� ������", new Double(1378.00));
		treeMap.put("��� ���", new Double(99.22));
		treeMap.put("����� ���", new Double(-19.08));

		Set<Map.Entry<String, Double>> entries = treeMap.entrySet();

		for (Map.Entry<String, Double> me : entries) {
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}

		System.out.println();

		double balance = treeMap.get("���� ���");
		treeMap.put("���� ���", balance + 1000);
		System.out.println("����� ������� �� ������� ����� ���: " + treeMap.get("���� ���"));	}

}
