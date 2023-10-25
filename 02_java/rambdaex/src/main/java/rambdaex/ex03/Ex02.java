package rambdaex.ex03;

public class Ex02 {
	
	public Runnable test( ) {
	String lname = "고길동";

		Runnable r;
	
		// Runbable의 익명 구현 객체에서 this 확인
		r = new Runnable() {
			private String name="박길동";
			@Override
			public void run() {
				System.out.println(this.name);	
			}
		};
		r.run();
		System.out.println(this);

		//r = () -> System.out.println(this.name);
		r = () -> System.out.println(this.lname); // 지역변수가 람다에서 쓰이면 이 지역변수-->final(상수처리)
		
		//lname = "이길동";
		//r.run();
		return r;
		//	r = () -> System.out.println(this.name);
	}
	
	
	public static void main(String[] args) {
		Ex02 t = new Ex02();
		Runnable r = t.test();
		r.run();
		
	}
}
