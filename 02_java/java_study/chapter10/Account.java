package java_study.chapter10;

public class Account {
	private long balance;

	public Account() {
	}

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}

	public void withdarw(int money) throws BalancelnsufficientException {
		if (balance < money) {
			throw new BalancelnsufficientException("잔고부족:" + (money - balance) + " 모자람");
		}
		balance -= money;
	}
}
