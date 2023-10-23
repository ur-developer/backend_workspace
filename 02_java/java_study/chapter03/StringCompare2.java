package java_study.chapter03;

import javax.swing.JOptionPane;

public class StringCompare2 {

	public static void main(String[] args) {
		String id = "root";
		String pw = "pass";

		String inputId = JOptionPane.showInputDialog("아이디 입력");
		String inputPw = JOptionPane.showInputDialog("패스워드 입력");
		// String은 부품(class) //다시보기 꼭 보기
		if (id.equals(inputId) && pw.equals(inputPw)) {
			// and연산자, 여러 조건이 모두 true일 때,
			// 전체적인 논리적 판단을 true라고 판단하는 경우
			System.out.println("로그인 Ok");
		} else {
			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
		}
	}

}
