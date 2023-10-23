package java_study.chapter08.sec08;

public class PhoneExample {

	public static void main(String[] args) {
		// Phone phone = new Phone(); (x)

		SmartPhone smartPhone = new SmartPhone("홍길동");

		smartPhone.turnOn();
		smartPhone.internetSerarch();
		smartPhone.turnOff();

		Phone phone = new SmartPhone("홍길동");

		phone.turnOn();
		((SmartPhone) phone).internetSerarch();
		phone.turnOff();
	}
}
