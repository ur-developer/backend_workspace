package java_study.chapter08.sec08;

public class SmartPhone extends Phone {
	// 생성자
	public SmartPhone(String owner) {
		super(owner);
	}

	// 메소드
	public void internetSerarch() {
		System.out.println("인터넷을 검색합니다.");
	}
}
