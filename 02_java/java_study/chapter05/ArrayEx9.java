package java_study.chapter05;

public class ArrayEx9 {

	private static final char[] Int = null;

	// 배열의 입력을 받아서 구성
	// 최소값을 찾아서, 인덱스 0번과 값을 교환
	public static void main(String[] args) {

		int[] data = new int[5];

		ArrayUtil.getNumbers("숫자 입력>> ", data);
		int mixIx = ArrayUtil.findMinValue(data, 0, data.length);

		System.out.printf("%d\n", data[mixIx]);

		swap(data, mixIx);
	}

	static void swap(int[] data, int mixIx) {

		// data[0] 20 mixIx 10 , 숫자입력 20, 15, 10, 60, 80

		int temp = 0;
		int mixvalue = data[mixIx];
		temp = mixvalue;
		System.out.println(mixvalue);
		mixvalue = data[0];
		System.out.println(data[0]);
		data[0] = temp;

		System.out.printf("%d %d\n", data[0], mixvalue);
	}
}
