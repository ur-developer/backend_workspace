package rambdaex.ex10;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExam {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
			new Member("홍길동", Member.MALE, 30),
			new Member("김나리", Member.FEMALE, 20),
			new Member("신용권", Member.MALE, 45),
			new Member("박수미", Member.FEMALE, 27)
		);

		double ageAvg = list.stream()
				.filter(m -> m.getSex()==Member.MALE) // 특징 : 스트림 타입유지, 갯수변경 N개 -> M개
				.mapToInt(Member :: getAge) 		  // 갯수 유지 타입변경 Member -> int
				.average()
				.getAsDouble();
		
		System.out.println("남자 평균 나이: " + ageAvg);
	}
}