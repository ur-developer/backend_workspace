package java_study.Chapter11.sec06;

import java.util.Scanner;

public class EndsWithExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("파일명>> ");
		String fileName = sc.nextLine();
		String test = fileName.toLowerCase();

		if (test.endsWith(".mp3")) {
			System.out.println("음악 파일입니다.");
		} else {
			System.out.println("음악 파일이 아닙니다.");
		}
		sc.close();
	}
}
