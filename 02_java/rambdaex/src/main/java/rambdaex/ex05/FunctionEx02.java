package rambdaex.ex05;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionEx02 {
	private static List<Student> list = Arrays.asList(
		new Student("홍길동", 90, 96),
		new Student("신용권", 95, 93)
	);

	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for(Student studeent : list) {
			sum += function.applyAsInt(studeent);
		}
		double avg = (double) sum / list.size();
		return avg;
	}
	
	public static void main(String[] args) {
		double englishAvg = avg( s -> s.getEnglishScore());
		System.out.println("영어 평균 점수: " + englishAvg);
	
		double mathAvg = avg( s -> s.getEnglishScore());
		System.out.println("수학 평균 점수: " + mathAvg);
	}
}
