package java_study.Chapter11.sec03;

public class MemberExample {

	public static void main(String[] args) {

		Member original = new Member("blue", "홍길동", "12345", 25, true);
		// 복제 객체를 얻은 후에 패스워드 변경
		Member cloned = original.getMember();
		cloned.password = "67890";
		System.out.println(original);
		System.out.println(cloned);
	}
}
