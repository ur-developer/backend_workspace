package java_study.chapter05;

public class ArrayEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = { "홍길동", "김길동", "박길동", "송길동", "전길동" };
		int[] ages = { 50, 40, 30, 20, 10 };
		int[] shoes = { 134, 235, 245, 255, 300 };
		char[] gender = { '남', '여', '남', '남', '여' };

		System.out.println("이름 나이 발크기 성별");
		System.out.println("----------------");
		for (int i = 0; i < names.length; i++) {
			System.out.printf("%d %s %d %d %c\n", i + 1, names[i], ages[i], shoes[i], gender[i]);
		}
	}

}
