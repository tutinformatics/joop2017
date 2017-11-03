package stream.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example {
	
	void example() {
		List<String> names = Arrays.asList("John", "Mary");
		
		// processing list data in usual way
		for (String name : names) {
			if (name.contains("a")) {
				if(name.length() > 2) {
					System.out.println(name);
				}
			}
		}
		
		// for simple use cases, operate without creating stream:
		names.forEach(System.out::println);
		
		// processing with streams
		names.stream()
			.filter(name -> name.contains("a"))
			//.filter(this::nameContainsA) // alternative way
			.filter(name -> name.length() > 2)
			.forEach(System.out::println); // method reference is cleaner way to execute existing methods
			//.forEach(name -> System.out.println(name)); // same as above, but requires more syntax
		
		// sama asi :
		// konfin uue streami
		Stream<String> nameStream = names.stream();
		// konfin uue streami
		Stream<String> hasA = nameStream
				.filter(name -> name.contains("a"));
		
		hasA
			.filter(name -> name.length() > 2)
			// eager method, käivitab andmete liikumise
			.forEach(System.out::println);
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
