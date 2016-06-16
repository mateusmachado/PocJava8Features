package cap2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person {

	String firstName;
	String lastName;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public static void main(String[] args) {
		
		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				int n = p1.getLastName().compareTo(p2.getLastName());
				if (n == 0) {

				}
				return n;
			}

		});
		
		list.sort(Comparator.comparing(Person::getLastName)
				.thenComparing(Person::getFirstName));
		
	}
}