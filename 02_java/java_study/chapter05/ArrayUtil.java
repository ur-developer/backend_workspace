package java_study.chapter05;

import java.util.Random;
import java.util.Scanner;

public class ArrayUtil {

	public static void getNumbers(String inputTitle, int[] data) {
		Scanner scanner = new Scanner(System.in);

		System.out.print(inputTitle);
		for (int i = 0; i < data.length; i++) {
			data[i] = scanner.nextInt();
		}
	}

	static void showNumbers(int[] data) {
		for (int x : data) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

	static int addAll(int[] data) {
		int sum = 0;
		for (int x : data) // jumsu에서 하나씩 꺼내 쓰겠다 라는 의미
		{
			sum += x;
		}
		return sum;
	}

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

	static int findMinValue(int[] data, int start, int end) {
		int min = data[start];
		int minIx = start;
		for (int i = start; i < end; i++) {
			if (min > data[i]) {
				min = data[i];
				minIx = i;
			}
		}
		return minIx;
	}

	static void swap(int[] data, int ix1, int ix2) {
		int temp;
		temp = data[ix1];
		data[ix1] = data[ix2];
		data[ix2] = temp;
	}

	// length 길이의 배열을 생성해서,
	// until까지의 랜덤한 값을 채움
	// 배열을 리턴

	static int[] getRandomArray(int length, int until) {
		int[] data = new int[length];
		Random random = new Random();
		for (int i = 0; i < data.length; i++) {
			data[i] = random.nextInt(until);
		}
		return data;
	}
}