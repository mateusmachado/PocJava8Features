package cap2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SampleSort {

	// Java7
	ActionListener al = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(e.getActionCommand());
		}
	};

	// Java8
	ActionListener al8 = e -> System.out.println(e.getActionCommand());

	public static void main(String[] args) {

	// ActionListener
		List<String> list = Arrays.asList("a", "b", "c");

		// Java7
		for (String string : list) {
			System.out.println(list);
		}

		// Java8
		list.forEach(System.out::println);

		
	// Sorting a list of Strings

		// Java 7
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});
		
		// Java8
		list.sort(Comparator.comparing(String::length));
	}
}
