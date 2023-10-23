package java_study.chapter03;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = new String("안녕하세요.");
		String str2 = new String("안녕하세요.");

		System.out.println(str1);
		System.out.println(str2);

		if (str1 == str2) {
			System.out.println("두 문자열 동등");
		} else {
			System.out.println("두 문자열 다름");
		}

		// == : js --> 내용검사
		// java는 --> 참조값 검사
		// 내용의 동등성 --> .equals() 메서드로 판정

		if (str1.equals(str2)) { // 내용검사
			System.out.println("두 문자열 동등");
		} else {
			System.out.println("두 문자열 다름");
		}
	}

}
