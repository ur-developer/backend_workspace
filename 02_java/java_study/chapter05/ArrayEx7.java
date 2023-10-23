package java_study.chapter05;

public class ArrayEx7 {

	public static void main(String[] args) {
		// 5개의 점수를 받아서 평균을 출력
		int[] jumsu = new int[5];

		ArrayEx6.getNumbers("점수 >> ", jumsu);
		ArrayEx6.showNumbers(jumsu);
		int sum = ArrayEx6.addAll(jumsu);

		double avg = (double) sum / jumsu.length;

		System.out.println("평균은: " + avg);
	}

}
