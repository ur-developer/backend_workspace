package java_study.chapter05;

import java.util.Scanner;

public class ArrayEx6 {

	public static void getNumbers(String inputTitle, int[] data) {
		Scanner scanner = new Scanner(System.in);

		System.out.print(inputTitle);
		for (int i = 0; i < data.length; i++) {
			data[i] = scanner.nextInt();
		}
	}

	static void showNumbers(int[] data) {
		for (int x : data) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

	static int addAll(int[] data) {
		int sum = 0;
		for (int x : data) // jumsu에서 하나씩 꺼내 쓰겠다 라는 의미
		{
			sum += x;
		}
		return sum;
	}

	public static void main(String[] args) {

		int[] jumsu = new int[5];

		ArrayUtil.getNumbers("점수 >> ", jumsu); // call by reference
		ArrayUtil.showNumbers(jumsu);

		int sum = addAll(jumsu);

		System.out.println("전체합계: " + sum);
		double avg = (double) sum / jumsu.length;
		System.out.println("전체평균: " + avg);
	}

}
