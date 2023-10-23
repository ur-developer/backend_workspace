package java_study.chapter08.sec04;

public class SupersonicAirplaneExam {

	public static void main(String[] args) {

		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();

		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();

		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();

		sa.land();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
