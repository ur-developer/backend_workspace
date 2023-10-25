package rambdaex.ex11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExam {
	public static void main(String[] args) {
		
		IntStream intStream = Arrays.stream(new int[] {5, 3, 2, 1, 4});
		intStream
			.sorted()
			.forEach(n -> System.out.print(n + ","));
		
		System.out.println();
		
		List<Student> studentList = Arrays.asList(
			new Student("홍길동", 30),
			new Student("신용권", 10),
			new Student("유미선", 20)
		);
		
		studentList.stream()
			.peek(System.out::println)
			.sorted()
			.forEach(s -> System.out.print(s.getScore() + ","));
		System.out.println();
		
		studentList.stream()
			.sorted(Comparator.reverseOrder()) // 내림차순
			.forEach(s -> System.out.print(s.getScore() + ","));		
	}
}
