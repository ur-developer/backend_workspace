package java_study.chapter07.sec03;

public class ComputerAssemble {

	public void main(String[] args) {

		Computer c1 = new Computer(10000, "Samsung", 30);
		Computer c2 = new Computer(50000, "Apple", 24);

		System.out.println(c1); // c1.toString() 호출
		System.out.println(c2); // c2.toString() 호출

		Computer c3 = new Computer();
		c3.setPrice(10000);
		c3.setMaker("Samsung");
		c3.setMoniter(25);

		System.out.println(c3);

	}

}
