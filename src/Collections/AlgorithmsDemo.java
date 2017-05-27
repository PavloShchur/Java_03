package Collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(-8);
		ll.add(20);
		ll.add(-20);
		ll.add(8);
		
		Comparator<Integer> r = Collections.reverseOrder();
		
		Collections.sort(ll, r);
		
		System.out.println("Список відсортовано в зворотньому порядку: ");
		
		for (int i : ll) {
			System.out.println(i + " ");
		}
		
		System.out.println();
		
		Collections.shuffle(ll);
		
		System.out.println("Список перетасовано: ");
		
		for (int i : ll) {
			System.out.println(i + " ");
		}
		
		System.out.println();
		
		System.out.println("Мінімум: " + Collections.min(ll));
		System.out.println("Максимум: " + Collections.max(ll));

	}

}
