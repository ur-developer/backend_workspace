package java_study.chapter04;

import java.util.Scanner;

class SwitchEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("저녁에 먹을 음식 종류는 1)짜장면, 2)우동, 3라면");
		String food = scanner.next();

		switch (food) {
		case "짜장면":
			System.out.println("중국집으로 가요!");
			break;
		case "우동":
			System.out.println("일식집으로 가요!");
			break;
		case "라면":
			System.out.println("분식집으로 가요!");
			break;
		default:
			System.out.println("집으로 가요!");
			break;

		}

	}

}
