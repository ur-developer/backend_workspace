package java_study.Chapter11.sec07;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		int[] scores = { 99, 97, 98, 67, 34, 102 };
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("찾은 인덱스: " + index);

//		for (int i = 0; i < scores.length; i++) {
//			System.out.println("scores[" + i + "]=" + scores[i]);
//		}
//		System.out.println();

		String[] names = { "홍길동", "박동수", "김민수" };
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));

		Member[] members = { new Member("홍길동", 10), new Member("박동수", 5), new Member("김민수", 3), };
		Arrays.sort(members);
		System.out.println(Arrays.toString(members));
	}

}
