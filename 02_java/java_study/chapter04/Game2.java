package java_study.chapter04;

import java.util.Random;
import java.util.Scanner;

//가위 0 , 바위 1, 보 2 게임
public class Game2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int SCISSORS = 0;
		final int ROCK = 1;
		final int PAPER = 2;

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int meWin = 0;
		int comWin = 0;
		int draw = 0;

		while (true) {
			int computer = r.nextInt(3); // 3은 미포함 0,1,2 중에서 랜덤하게 정함
			System.out.println("0:가위, 1:바위, 2:보, -1: 종료 >> ");
			int me = sc.nextInt();

			// 종료 조건 확인 후 진행
			if (me == -1) { // 종료 조건
				System.out.println("게임을 끝냅니다.");
				System.out.println("-------------");
				// System.out.println("나의 이긴 횟수: " + meWin + "회");
				System.out.printf("내가 이긴 회수 %d회\n", meWin);
				// System.out.println("컴의 이긴 횟수: " + comWin + "회");
				System.out.printf("컴이 이긴 회수 %d회\n", comWin);
				// System.out.println("비긴 횟수: " + draw + "회");
				System.out.printf("비긴 회수 %d회\n", draw);

				int sum = meWin + comWin;
				double result = (double) meWin / sum * 100;
				// System.out.println("나의 승률" + (int) result + "%");
				System.out.printf("나의 승률 %d%%", (int) result);

				break;
			}

			System.out.printf("컴퓨터 : %d, 나: %d ==>", computer, me);

			if (me == computer) { // 비긴거
				draw++;
				System.out.println(" 비겼습니다.");
			} else if ((me == SCISSORS && computer == PAPER) || (me == ROCK && computer == SCISSORS)
					|| (me == PAPER && computer == ROCK)) { // 내가 이긴경우
				meWin++;
				System.out.println(" 내가 이겼습니다.");
			} else { // 내가 진 경우
				comWin++;
				System.out.println(" 컴퓨터가 이겼습니다.");
			}
		}
	}
}