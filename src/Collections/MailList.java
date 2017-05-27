package Collections;

import java.util.LinkedList;

public class MailList {

	public static void main(String[] args) {
		LinkedList<Address> addresses = new LinkedList<Address>();
		
		addresses.add(new Address("J. W. West", "LL Oak Ave", "Urbana", "IL", "61801"));
		addresses.add(new Address("J. W. West", "LL Oak Ave", "Urbana", "IL", "61802"));
		addresses.add(new Address("J. W. West", "LL Oak Ave", "Urbana", "IL", "61803"));
		addresses.add(new Address("J. W. West", "LL Oak Ave", "Urbana", "IL", "61804"));
		
		for (Address m : addresses) 
			System.out.println(m + " ");
		
		System.out.println();
		System.out.println(Math.sqrt(-2.0)); 
		System.out.println(1.0/0.0); 
	}

}
