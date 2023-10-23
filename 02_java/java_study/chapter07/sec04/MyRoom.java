package java_study.chapter07.sec04;

public class MyRoom {

	public static void main(String[] arg) {
		System.out.println(Tv.count);

		Tv myTv = new Tv(8, 8, true);
		Tv yourTv = new Tv(9, 9, true);
		System.out.println(myTv);
		System.out.println(yourTv);

		Tv[] tvArr = new Tv[100];
		for (int i = 0; i < 100; i++) {

			Tv tv = new Tv(1, 1, true);
			tvArr[i] = tv;
			// tvArr[i] = new Tv(1, 1, true);
		}

		System.out.println(myTv.getChannel());
		System.out.println(yourTv.getChannel());
		System.out.println(tvArr[0]);

		int[] numbers = { 1, 2, 3 };
		Tv[] tvArr2 = { new Tv(10, 10, false), new Tv(11, 10, true), new Tv(12, 10, false) };

		Tv tv3 = new Tv();
		tv3.setChannel(10);
		System.out.println("tv3의 serial number: " + tv3.getSerial());

		System.out.println(Tv.count);
		System.out.println(myTv.count);
		System.out.println("mtTv의 serial number: " + myTv.getSerial());
	}

}
