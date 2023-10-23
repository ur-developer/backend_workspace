package java_study.chapter07.sec05;

public class BbsUse {

	public static void main(String[] args) {

		Bbs[] bbsArr = { new Bbs(1, "java", "fun java", "park"), new Bbs(2, "jsp", "fun jsp", "hong"),
				new Bbs(3, "spring", "fun spring", "kim"), };

		System.out.println("게시판");
		System.out.println("--------------------------------");
		System.out.println("no  tile       content    Writer");
		System.out.println("--------------------------------");

		for (Bbs bbs : bbsArr) {
			System.out.printf("%-3d %-10s %-10s %-10s\n", bbs.getNo(), bbs.getTitle(), bbs.getContent(),
					bbs.getWriter());
		}
	}

}