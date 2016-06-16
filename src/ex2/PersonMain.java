package ex2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonMain {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Joao", "Silva", "POA", 2),
				new Person("Maria", "Souza", "SP", 4), new Person("Nina", "Silva", "POA", 18),
				new Person("Jown", "Snow", "RJ", 24));

		System.out.println("Average age of people: " + averageAgeOfPeople(people));
		System.out.println("Name Peoples Poa: " + namePeoplesPOA(people));
		System.out.println("Count last names: " + countLastNames(people));
	}

	private static Map<String, Long> countLastNames(List<Person> people) {
		Map<String, Long> counted = people.stream()
				.collect(Collectors.groupingBy(Person::getLastName, Collectors.counting()));
		return counted;
	}

	private static List<String> namePeoplesPOA(List<Person> people) {
		return people.stream().filter(i -> i.getCidade().equalsIgnoreCase("POA")).map(p -> p.getFirstName())
				.collect(Collectors.toList());
	}

	private static double averageAgeOfPeople(List<Person> people) {
		return people.stream().mapToInt(Person::getAge).average().getAsDouble();
	}
}
