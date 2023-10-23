package java_study.chapter04;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String inputString;

		do {
			System.out.println(">");
			inputString = scanner.nextLine(); // 키보드로 입력한 값 얻기
			System.out.println(inputString);
		} while (!inputString.equalsIgnoreCase("q"));

		System.out.println();
		System.out.println("프로그램 종료");

	}

}
