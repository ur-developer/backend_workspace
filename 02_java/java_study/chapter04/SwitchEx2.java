package java_study.chapter04;

import java.util.Date;

public class SwitchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		int month = date.getMonth() + 1;
		int day = date.getDay(); // 요일
		System.out.println(day);
		switch (day) {
		case 0:
		case 6:
			System.out.println("자바공부하러가");
			break;
		default:
			break;
		}
	}

}
