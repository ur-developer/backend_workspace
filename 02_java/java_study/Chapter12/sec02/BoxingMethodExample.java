package java_study.Chapter12.sec02;

import java_study.Chapter12.sec01.Box;

public class BoxingMethodExample {

	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();

		Box<String> box2 = Util.boxing("홍길동");
		String strValue = box2.get();
		System.out.println(box2);
	}
}
