package java_study.chapter08.sec03;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;

		Calculator calculator = new Calculator();
		System.out.println("원 면적 : " + calculator.areaCircle(r));
		System.out.println();

		Computer computer = new Computer();

		// 재 정의 된 메서드 호출
		System.out.println("원 면적 : " + computer.areaCircle(r));

		System.out.println(calculator); // calculator.toSrting() 호출
		System.out.println(computer); // computer.toSring() 호출
	}

}
