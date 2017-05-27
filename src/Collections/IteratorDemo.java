package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");

		System.out.print("Первинний вміст списковог масиву: ");
		
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.print(element + " ");
		}
		
		ListIterator<String> litr = al.listIterator();
		while(litr.hasNext()) {
			String element = litr.next();
			litr.set(element + "+");
		}
		
		System.out.println();
		
		System.out.print("Змінений вміст спискового масиву al: ");
		itr = al.iterator();
		while(itr.hasNext()) {
			String element = itr.next();
			System.out.print(element + " ");
		}
		
		System.out.println();
				
		System.out.print("В зворотньому порядку: ");
		while (litr.hasPrevious()) {
			String elemet = litr.previous();
			System.out.print(elemet + " ");
		}
		System.out.println();
	}

}
