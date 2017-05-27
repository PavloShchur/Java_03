package Collections;

import java.util.TreeSet;

public class CompDemo {

	public static void main(String[] args) {
		
		MyComp comp = new MyComp();
		TreeSet<String> ts = new TreeSet<String>((o1, o2) -> o2.compareTo(o1));
		
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		
		for (String element: ts) {
			System.out.print(element + " ");
		}
	}

}
