package java_study.chapter07.sec02;

public class Account {
	private String name;
	private String ssn;
	private int money;

//	public Account(String name, String ssn, int money) {
//		this.name = name;
//		this.ssn = ssn;
//		this.money = money;
//	}

	public Account() {
	}

	public Account(String name, String ssn) {
//		super();
		this.name = name;
		this.ssn = ssn;
	}

	public Account(String name, String ssn, int money) {
//		super();
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}

	public int getMoney() { // Getter
		return money;
	}

	public void setMoney(int money) { // Setter
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", ssn=" + ssn + ", money=" + money + "]";
	}
}
