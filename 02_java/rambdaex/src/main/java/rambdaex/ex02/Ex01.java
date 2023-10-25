package rambdaex.ex02;

public class Ex01 {
	public static void main(String[] args) {
		MyFuctionalInterface fi;

		fi= (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		fi.method(2);
		
		fi = (x) -> { System.out.println(x*5); };
		fi.method(2);
		
		fi = (x) -> System.out.println(x*5);
		fi.method(2);
		}
	}
