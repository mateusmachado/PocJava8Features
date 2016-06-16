package ex2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonMain {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList
			   (new Person("Joao", "Silva", "POA", 2),
				new Person("Maria", "Souza", "SP", 4),
				new Person("Nina", "Silva", "POA", 18),
				new Person("Jown", "Snow", "RJ", 24));

		// Average Peoples
		double average = persons.stream()
				.mapToInt(Person::getAge)
				.average()
				.getAsDouble();
		 System.out.println(average);

		// Name peoples POA
		List<String> namePeoplesPOA = persons.stream()
				.filter(i -> i.getCidade().equalsIgnoreCase("POA"))
				.map(p -> p.getFirstName())
				.collect(Collectors.toList());
		System.out.println(namePeoplesPOA);

		
		
		

	}
}
