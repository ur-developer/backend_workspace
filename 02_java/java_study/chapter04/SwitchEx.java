package java_study.chapter04;

public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컨트롤 + 쉬프트 + f : 자동 포맷팅
		String name = "자바";
		switch (name) {
		case "자바":
			System.out.println("1103호로 가세요.");
			break;
		case "파이썬":
			System.out.println("1104호로 가세요.");
			break;
		case "리눅스":
			System.out.println("1102호로 가세요.");
			break;
		default:
			System.out.println("카운터에 가서 문의하세요.");
			break;
		}
	}

}
