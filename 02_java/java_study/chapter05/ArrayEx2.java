package java_study.chapter05;

public class ArrayEx2 {
	public static void main(String[] args) {
		// 친구이름
		String[] names = { "홍길동", "김길동", "박길동", "송길동", "전길동" };
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + " ");
		}
		System.out.println();

		// 우리가족 5명의; 나이를 넣어 보세요. 전체 출력
		int[] ages = { 50, 40, 30, 20, 10 };
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i] + " ");
		}

		System.out.println();
		// 친구들의 발 사이즈를 넣어보세요. 전체 출력
		int[] shoes = { 134, 235, 245, 255, 300 };
		for (int i = 0; i < shoes.length; i++) {
			System.out.println(shoes[i] + " ");
		}

		System.out.println();
		// 친구들의 성별을 넣어보세요. 전체 출력
		char[] gender = { '남', '여', '남', '남', '여' };
		for (int i = 0; i < gender.length; i++) {
			System.out.println(gender[i] + " ");
		}
	}
}
