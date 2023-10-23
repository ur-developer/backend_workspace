package java_study.chapter05;

public class MethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printCharacter('*', 30);
		System.out.println("Hello, Java");
		printCharacter('-', 30);

		for (int i = 1; i <= 5; i++) {
			printCharacter('*', i);
		}

		for (int i = 5; i > 0; i--) {
			printCharacter('*', i);
		}
	}

	// 코드 재사용 --> 코드 중복을 해결
	static void printCharacter(char ch, int num) {
		for (int cnt = 0; cnt < num; cnt++) {
			System.out.print(ch);
		}
		System.out.println();

	}

}
