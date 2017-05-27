package Collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("C");
		set.add("B");
		set.add("E");
		set.add("F");
		set.add("D");

		System.out.println(set);
		
		System.out.println(set.subSet("C", "F"));
	}

}
