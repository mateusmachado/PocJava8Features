package ex2;

import java.util.Arrays;
import java.util.List;

public class AveragePeople {

	// Media de idade das pessoas

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList
				(new Person("Joao", "Silva", "POA", 2),
				new Person("Maria", "Souza", "POA", 4),
				new Person("Nina", "Silva", "POA", 18),
				new Person("Jown", "Snow", "POA", 24)
		);

		double average = persons.stream().mapToInt(Person::getAge).average().getAsDouble();
		System.out.println(average);

	}
}
