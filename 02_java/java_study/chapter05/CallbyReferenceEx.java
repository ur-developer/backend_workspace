package java_study.chapter05;

public class CallbyReferenceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 100, 200 };
		System.out.printf("%d %d\n", data[0], data[1]);
		swap(data);
		System.out.printf("%d %d\n", data[0], data[1]);
	}

	static void swap(int[] data) {

		int temp;
		temp = data[0];
		data[0] = data[1];
		data[1] = temp;

		System.out.printf("%d %d\n", data[0], data[1]);
	}
}
