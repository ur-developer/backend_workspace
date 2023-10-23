package java_study.Chapter11.sec06;

public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567 ";

		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);

		String secondNum = ssn.substring(7);
		System.out.println(secondNum);

		String fileName = "Hello.world.mp3";
		int ix = fileName.lastIndexOf('.');
		if (ix != -1) {
			String ext = fileName.substring(ix + 1);
			System.out.println(ext);

			String baseName = fileName.substring(0, ix);
			System.out.println(baseName);
		}
	}
}
