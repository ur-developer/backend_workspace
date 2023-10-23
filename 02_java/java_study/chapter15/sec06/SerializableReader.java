package java_study.chapter15.sec06;

public class SerializableReader {

	public static void main(String[] args) {
		try {
			ClassA v = (ClassA) Serializer.load("C:/Temp/Object2.dat");

			System.out.println("field1: " + v.field1);
			System.out.println("field2.field1: " + v.field2.field1);

			System.out.println("field3: " + v.field3);
			System.out.println("field4: " + v.field4);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}