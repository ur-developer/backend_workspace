package java_study.chapter10;

public class ThrowsExample {

	public static void main(String[] args) {

		try {
			findClass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 후속 작업

		// System.in.read();

	}

	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.string2");
	}

}
