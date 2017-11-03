package student;

import java.util.Arrays;
import java.util.List;

public class StudentIS {
	void playWithStudentStreams() {
		List<Student> students = Arrays.asList(
				new Student("Mary", 5),
				new Student("John", 5),
				new Student("Elisabeth", 3),
				new Student("Malcolm", 2)
			);
		
		students.stream()
			.filter(s -> s.getName().contains("e") || s.getName().contains("i"))
			//.peek(System.out::println)
			.filter(s -> s.getGrade() >= 3)
			//.forEach(s -> System.out.println(s));
			// samaväärne:
			.forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		new StudentIS().playWithStudentStreams();
	}
}
