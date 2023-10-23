package java_study.chapter05;

public class ArrayEx8 {

	static int findMaxValue(int[] data) {
		int max = data[0];
		int maxIx = 0;
		for (int i = 0; i < data.length; i++) {
			if (max < data[i]) {
				max = data[i];
				maxIx = i;
			}
		}
		return maxIx;
	}

	static int findMinValue(int[] data) {
		int min = data[0];
		int minIx = 0;
		for (int i = 0; i < data.length; i++) {
			if (min > data[i]) {
				min = data[i];
				minIx = i;
			}
		}
		return minIx;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] save = new int[5];

		ArrayEx6.getNumbers("숫자 입력 >>", save);

		int maxIx = ArrayUtil.findMaxValue(save);
		int minIx = ArrayUtil.findMinValue(save, 0, save.length);

		System.out.println("최고 점수는 " + save[maxIx]); // save[maxIx]
		System.out.println("최저 점수는 " + save[minIx]); // save[minIx]

	}

}

//		int max = save[0];
//		for (int i = 0; i < save.length; i++) {
//			if (max < save[i]) {
//				max = save[i];
//			}
//		}
//		int min = save[0];
//		for (int i = 0; i < save.length; i++) {
//			if (min > save[i]) {
//				min = save[i];

//		int max = save[0];
//		int min = save[0];
//		for (int i = 0; i < save.length; i++) {
//			if (max < save[i]) {
//				max = save[i];
//			}
//			if (min > save[i]) {
//				min = save[i];
//			}
