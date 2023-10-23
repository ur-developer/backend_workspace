package java_study.chapter07.sec03;

public class Computer {

	private int price;
	private String maker;
	private int moniter;

	public Computer(int price, String maker, int moniter) {
		super();
		this.price = price;
		this.maker = maker;
		this.moniter = moniter;
	}

	public Computer() {
		// TODO Auto-generated constructor stub
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getMoniter() {
		return moniter;
	}

	public void setMoniter(int moniter) {
		this.moniter = moniter;
	}

	@Override
	public String toString() {
		return "Computer [price=" + price + ", maker=" + maker + ", moniter=" + moniter + "]";
	}

	public String areaCircle(int r) {
		// TODO Auto-generated method stub
		return null;
	}

}
