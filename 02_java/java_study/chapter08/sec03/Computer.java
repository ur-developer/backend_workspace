package java_study.chapter08.sec03;

public class Computer extends Calculator {

	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areacircle() 실행");
		return Math.PI * r * r;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Computer..." + super.toString();
	}
}
