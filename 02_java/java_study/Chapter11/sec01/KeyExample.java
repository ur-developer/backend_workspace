package java_study.Chapter11.sec01;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {

		HashMap<Key, String> hashMap = new HashMap<Key, String>();

		hashMap.put(new Key(1), "홍길동");

		String value = hashMap.get(new Key(1));
		System.out.println(value);

		Object obj = new Object();
		System.out.println(obj);
		System.out.println(obj.hashCode());
	}
}
