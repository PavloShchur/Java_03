package Collections;

import java.util.ArrayList;

public class ForEachDemo {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		
		System.out.print("Вихідне положення спискового масиву arraylist: ");
		
		for (int v : arrayList) 
			System.out.print(v + " ");
		
		
		System.out.println();
	int sum = 0;
	
	for (int v : arrayList) 
		sum += v;
		System.out.println(sum);
	

}}
