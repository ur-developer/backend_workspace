package java_study.Chapter06.sec03;

public class Car {

	String color; // public이 없으면 같은 패키지에서만 접근가능

	public void run() {
		System.out.println("부릉부릉 달리다!!");
	}

	public void up() {
		System.out.println("비싼 휘발유를 먹으며!! 미친듯이 속도Up.");
	}

}
