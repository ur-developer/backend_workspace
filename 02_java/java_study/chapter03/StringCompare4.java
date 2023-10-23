package java_study.chapter03;

public class StringCompare4 {

	public static void main(String[] args) {
		int score = 80;
		// char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		char grade = 0;

		if (score > 90) {
			grade = 'A';
		} else {
			if (score > 80) {
				grade = 'B';
			} else {
				if (score > 70) {
					grade = 'C';
				}
			}
		}
		System.out.println(score + "점은 " + grade + "등급입니다.");

	}

}
