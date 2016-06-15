import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class MapTest {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5); //Create a Collection
		HashSet squareDistinct = new HashSet();

		// OLD
		for (Integer values : numbers) squareDistinct.add(values * values); // add values to new collection
		System.out.println(squareDistinct);

		// NEW
		List<Integer> squaresList = numbers.stream() // convert to stream
				.map(i -> i * i) // takes each element of the stream and applies the given function
				.distinct() // distinct elements
				.collect(Collectors.toList()); // convert stream to list
		System.out.println(squaresList);
	}
}