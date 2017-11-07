package stream.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Example {
	
	void example() {
		List<String> names = Arrays.asList("John", "Mary");
		List<Predicate> predicates = Arrays.asList(
				s -> s.equals("Tere"),
				s -> false
				);
		
		Object obj = new Object();
		
		predicates.stream()
			.filter(s -> s.test(obj))
			.count();
	
		// processing with streams
		names.stream()
			.filter(name -> name.contains("a"))
			.filter(this::checkLength)
			.forEach(System.out::println); // method reference is cleaner way to execute existing methods
	}

	boolean checkLength(String name) {
		return name.length() > 2;
	}
	
	// meetod, mis vastab sellele lambdale:
	// name -> name.contains("a")
	private boolean nameContainsA(String name) {
		return name.contains("a");
	}
	
	 public static void main(String[] args) {
		new Example().example();
	}
}
