package java_study.chapter05;

import java.util.Scanner;

public class ArrayEx5 {

	// SRP(Single Responsibility Principal) : 단일 책임의 원칙

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] jumsu = new int[5];

		for (int i = 0; i < jumsu.length; i++) {
			System.out.print("점수(공백으로 숙자 구분 후 마지막에 엔터) >> ");
			jumsu[i] = scanner.nextInt(); // 버퍼링 --> 엔터 앞에 데이터를 여러개 줄 수 있음
		}
		for (int x : jumsu) {
			System.out.print(x + " ");
		}
		System.out.println();

		int sum = 0;
		for (int x : jumsu) // jumsu에서 하나씩 꺼내 쓰겠다 라는 의미
		{
			sum = sum + x;
		}
		System.out.println("전체합계: " + sum);
		double avg = (double) sum / jumsu.length;
		System.out.println("전체평균: " + avg);
	}
}
