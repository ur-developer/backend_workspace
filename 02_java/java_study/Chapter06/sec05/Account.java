package java_study.Chapter06.sec05;

public class Account {

	String name;
	String accountNumber;
	int balance; // 잔액

	public void deposit(int amount) { // amount : 입금액
		balance += amount;

//		System.out.println(name + "이 " + balance + "원을 입금하다.");
		System.out.printf("%s이 %d원을 입금하다.\n", name, amount);
	}

	public void withdraw(int amount) { // amount : 출금액
		if (amount > balance) {
			System.out.println("잔액부족이 부족합니다.");
			return;
		}

		balance -= amount;
		System.out.printf("%s이 튼튼적금에서 출금하다.\n", name);

	}

	@Override
	public String toString() {
		return "Account [name=" + name + ",  accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}

}
