package java_study.chapter08.sec05;

public class ChildExample {
	static void run(Parent p) {
		p.method2(); // override된 method는 실체의 method가 호출됨
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		System.out.println(child);

		Parent parent = child; // 자동 타입 변환
		System.out.println(parent);

		run(child);

		parent.method1();
		parent.method2(); // 재정의된 메소드가 호출됨
//		parent.method3(); // (호출 불가능)

		child.method1();
		child.method2();
		child.method3();
	}

}
