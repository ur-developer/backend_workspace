package rambdaex.ex09;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapAndReduceExam {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 10),
				new Student("신용권", 20),
				new Student("유미선", 30)
		);
		
		double avg = studentList.stream()	// Stream<Student>
		//중간처리(학생 객체를 점수로 매핑)		// Stream<Integer>
			.mapToInt(Student :: getScore) // (s) -> s.getScore();		
			// 최종 처리(평균 점수)
			.average()
			.getAsDouble();
	
		System.out.println("평균 점수: " + avg);
		
		Stream<Student> stream1 = studentList.stream();
		IntStream stream2 = stream1.mapToInt(Student::getScore);
		OptionalDouble optional = stream2.average();
		double avg2 = optional.getAsDouble();
		
		System.out.println("평균 점수2: " + avg2);
		
		// 한번 사용한 Stream은 다시 사용하지 못한다.
		IntStream stream3 = stream1.mapToInt(Student::getScore);
		stream3.forEach(System.out::println);
	}
}
