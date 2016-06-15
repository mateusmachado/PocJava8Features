import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<String> lines = Arrays.asList("spring", "node", "others");
		List<String> result = lines.stream().filter(line -> !"others".equals(line))
		.collect(Collectors.toList());
		result.forEach(System.out::println);
	}
}
