package java_study.chapter05;

public class ArrayEx10 {

	private static final char[] Int = null;

	// 배열의 입력을 받아서 구성
	// 최소값을 찾아서, 인덱스 0번과 값을 교환
	public static void main(String[] args) {

		// 인덱스 0위치와 minIx와 교환
//		int temp;
//		temp = data[0];
//		data[0] = data[minIx];
//		data[minIx] = temp;

//		int[] data = new int[5];
//		ArrayUtil.getNumbers("숫자 입력>> ", data);

		int[] data = ArrayUtil.getRandomArray(10, 100);

		for (int i = 0; i < data.length; i++) {
			int minIx = ArrayUtil.findMinValue(data, i, data.length);
			// 최소값을 찾아서, 인덱스 0번과 값을 교환
			ArrayUtil.swap(data, i, minIx);
			ArrayUtil.showNumbers(data);
		}

	}
}