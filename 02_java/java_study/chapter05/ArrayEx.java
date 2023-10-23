package java_study.chapter05;

public class ArrayEx {
	public static void main(String[] args) {
		// 많은 양의 데이터를 한꺼번에 다룰 때 편리
		int[] jumsu = new int[1000]; // int + int + int + ... + int
		System.out.println(jumsu); // 2F같은 주소가 들어감
		// int 변수 1000개가 모두 이름이 jumsu
		// jumsu를 인덱스(위치값)로 구분
		// 첫번째 jumsu의 index는 0! => jumsu[0]
		// 두번째 jumsu의 index는 1! => jumsu[1]
		// 마지막 jumsu의 index는 전체개수 -1! =>jumsu[전채개수-1]
		// 기본형 변수 : 기본형 데이터만 저장된 변수
		// => 기본형 변수는 변수 안에 해당 타입의 값!이 저장
		jumsu[0] = 100;
		jumsu[10] = 100;
		jumsu[999] = 1000;
//		jumsu[1000] = 100000;

		// jumsu[1000]은 존재하지 않음.

		System.out.println("첫번째 값:" + jumsu[0]);
		System.out.println("11번째 값:" + jumsu[10]);
		System.out.println("마지막 값:" + jumsu[999]);
		System.out.println("500번째 값:" + jumsu[499]);

		for (int i = 0; i < jumsu.length; i++) { // 인덱스 기반, .length(상수)
			System.out.println(i + ": " + jumsu[i]);
		}

		int sum = 0;
		for (int value : jumsu) { // 값을 기반
			System.out.println(value);
			sum += value;
		}
	}
}