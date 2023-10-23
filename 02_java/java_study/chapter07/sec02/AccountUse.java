package java_study.chapter07.sec02;

public class AccountUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a1 = new Account("홍길동", "920603", 10000);
		System.out.println(a1);
//		System.out.println(a1.toString());

		Account a2 = new Account("고길동", "950421", 100000);
		System.out.println(a2);
//		System.out.println(a2.toString());

		// 현재 잔액만 출력
		a2.setMoney(200000);
		System.out.println(a2.getMoney());

	}
}
