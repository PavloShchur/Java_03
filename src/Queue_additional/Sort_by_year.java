package Queue_additional;

import java.util.Comparator;
import java.util.Queue;

public class Sort_by_year implements Comparator<Person> {

	public int compare(Person o1, Person o2) {
		return o2.getAge() - o1.getAge();
	}

}


