package java_study.Chapter11.sec06;

public class StringWithExample {

	public static void main(String[] args) {
		String s = "abc";
		boolean b1 = s.startsWith("ab");
		boolean b2 = s.startsWith("a");
		boolean b3 = s.startsWith("bc");

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}
}
