package java_study.chapter13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysasList {

	public static void main(String[] args) {
		List<String> initList = Arrays.<String>asList("홍길동", "신용권", "감자바"); // 읽기 전용
		List<String> list1 = new ArrayList(initList);

		list1.addAll(list1);

		list1.set(0, "고길동");
		list1.remove(0);
		list1.add("고길동");

		for (String name : list1) {
			System.out.println(name);
		}

		List<Integer> list2 = Arrays.asList(1, 2, 3);
		for (int value : list2) {
			System.out.println(value);
		}
	}

}
