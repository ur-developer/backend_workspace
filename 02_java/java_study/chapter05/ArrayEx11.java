package java_study.chapter05;

public class ArrayEx11 {

	public static void main(String[] args) {

		// int[] jumsu = new int[10000];
//		Random random = new Random(5);
//		for (int i = 0; i < jumsu.length; i++) {
//			jumsu[i] = random.nextInt(331); // 0~330
//		}

		int[] jumsu = ArrayUtil.getRandomArray(10000, 331);

		// 수능 만점자 수는 몇명일까요?
		int count = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] == 330) {
				count++;
				System.out.println(count + ": 만점자 번호는 " + i + "번");
//				System.out.printf("%d: 만점자 번호 %d번\n", count, i);
			}
		}
		System.out.println("전체 만점자 수는" + count + "명");
//		System.out.printf("전체 만점자 수는 %d 명\n", count);
	}

}
