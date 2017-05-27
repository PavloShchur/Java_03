package Collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HTDDemo2 {
	public static void main(String[] args) {

		Hashtable<String, Double> balance = new Hashtable<String, Double>();

		String str;
		double bal;

		balance.put("���� ���", new Double(3434.34));
		balance.put("��� ���", new Double(123.22));
		balance.put("����� ������", new Double(1378.00));
		balance.put("��� ���", new Double(99.22));
		balance.put("����� ���", new Double(-19.08));

		Set<String> set = balance.keySet();

		Iterator<String> iterator = set.iterator();

		while (iterator.hasNext()) {
			str = iterator.next();
			System.out.println(str + " " + balance.get(str));

		}

		System.out.println();

		bal = balance.get("���� ���");
		balance.put("���� ���", bal + 1000);
		System.out.println("����� ������� �� ������� ����� ���: " + balance.get("���� ���"));
	}
}