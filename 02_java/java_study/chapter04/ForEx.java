package java_study.chapter04;

import java.util.Scanner;

public class ForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) { // %2 --> 0: 짝수, 1: 홀수
				sum += i; // sum = sum + i;
			}
		}
		System.out.println("1~100까지의 합:" + sum);

		sum = 0;
		for (int i = 0; i <= 100; i += 2) {
			sum += i; // sum = sum + i;
		}
		System.out.println("1~100까지의 짝수 합: " + sum);

		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 >> ");
		int num = scanner.nextInt();

		sum = 0;
		for (int i = 1; i <= num; i += 1) {
			sum += i;

		}
		System.out.printf("1%d의 합" + sum);
	}

}
