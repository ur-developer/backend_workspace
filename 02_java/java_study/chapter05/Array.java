package java_study.chapter05;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// new 는 Heap영역에 할당

		double[] height = { 123.4, 234.2, 124.5 };
		// [ 배열, D 엘리먼트타입(double타입 배열), @ at ~에, 3d012ddd 참조값(16진수 / 1개는 4bit)
		double[] space = new double[500];
		char[] gender = { '남', '여', '남' };
		String[] space2 = new String[333];

		System.out.println(space);
		System.out.println(space[0]);

		System.out.println(space2);
		System.out.println(space2[0]);
	}
}
