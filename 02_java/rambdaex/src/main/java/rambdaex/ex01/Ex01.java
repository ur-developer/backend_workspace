package rambdaex.ex01;

public class Ex01 {
	public static void main(String[] args) {
		MyFuctionalInterface fi;

	fi= () -> {
		String str = "method call1";
		System.out.println(str);
	};
	fi.method();
	
	fi = () -> { System.out.println("method call2"); };
	fi.method();
	
	fi = () -> System.out.println("method call3");
	fi.method();
	}
}

