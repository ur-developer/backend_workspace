package java_study.Chapter06.sec05;

public class AccountOpen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account dad = new Account();
		dad.name = "홍길동";
		dad.accountNumber = "튼튼적금";
		dad.balance = 1000;

		dad.deposit(1000);
		dad.deposit(2000);
		dad.deposit(10000);

		dad.withdraw(3000);
		dad.withdraw(2000);
		dad.withdraw(1000);

		System.out.println(dad);

		dad.withdraw(20000);
		dad.balance -= 20000;
		System.out.println(dad);
	}

}
