package java_study.chapter10;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();

		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());

		try {
			account.withdarw(30000);
		} catch (BalancelnsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
		}
	}
}
