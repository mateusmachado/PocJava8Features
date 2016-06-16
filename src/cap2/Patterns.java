package cap2;

import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Patterns {

	public static void main(String[] args) {

		Pattern patt = Pattern.compile(",");
		patt.splitAsStream("a, b, c").forEach(System.out::println);

		Stream.generate(() -> Math.random());

		Stream.iterate(1, i -> i + 1).forEach(System.out::println);

		IntStream.range(1, 11).forEach(System.out::println);
	}
}
