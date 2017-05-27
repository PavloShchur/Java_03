package Queue_additional;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.UUID;

public class MyQueue extends AbstractQueue<Person> {

	static ArrayList<Person> persons = new ArrayList<>(Main.capacity);

	public void add_person() {
		String name = UUID.randomUUID().toString().replaceAll("[^a-zA-Z]", "").toUpperCase().substring(0, 2);
		int age = 16 + (int) (Math.random() * 90);
		persons.add(new Person(name, age));
	}

	@Override
	public boolean offer(Person person) {
		if (size() < Main.capacity) {
//			String name = UUID.randomUUID().toString().replaceAll("[^a-zA-Z]", "").toUpperCase().substring(0, 2);
//			int age = 16 + (int) (Math.random() * 90);
//			persons.add(new Person(name, age));
			persons.add(person);

		} else {
			System.out.println("No");
			poll();
			offer(person);
		}
		return true;
	}
	public void offerNewPerson () {
			String name = UUID.randomUUID().toString().replaceAll("[^a-zA-Z]", "").toUpperCase().substring(0, 2);
			int age = 16 + (int) (Math.random() * 90);
			sort_by_year();
			persons.remove(persons.size() - 1);
			persons.add(new Person(name, age));
		}
	@Override
	public Person peek() {
		System.out.println(persons.get(0));
		return persons.get(0);
	}

	@Override
	public Iterator<Person> iterator() {
		Iterator<Person> iterator = persons.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		return iterator;
		
	}

	@Override
	public int size() {
		return persons.size();
	}

	public void sort_by_year() {
		Collections.sort(persons, new Sort_by_year());
	}

//	public void show_all_persons() {
//		Iterator<Person> iterator = persons.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//	}

	@Override
	public Person poll() {

		return persons.remove(0);
	}

}
