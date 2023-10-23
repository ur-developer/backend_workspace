package java_study.chapter04;

import java.util.Scanner;

public class ConsoleTest1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("이름을 입력>> ");
		String name = scanner.next(); // 단어 입력 받는 기능

		System.out.println("소속을 입력>> ");
		String company = scanner.next();

		System.out.println("나이 입력>> ");
		int age = scanner.nextInt();

		System.out.println("당신의 이름은 " + name);
		System.out.println("당신의 소속은 " + company);
		System.out.println("당신의 나이는 " + age);

	}

}
