package rambdaex.ex08;

public class Member {
	private String name;
	private String id;
	
	public Member() {
		System.out.println("Member() 실행");
	// () -> new Member();
	// Supplier<Member> s = Member::new;
	// s.get(); 
	}

	public Member(String id) {
		System.out.println("Member(string id) 실행");	
	// (id) -> new Member(id);
	// Function<String,Member> f =  Member :: new;
	//	f.apply("")
	}
	
	public Member(String name, String id) {
		System.out.println("Member(String name, String id)");
		this.name = name;
		this.id = id;
	// (name,id) -> new Member(name,id);
	// BiFunction<String, String, Member> = Member ::new;
	}

	public String getId() { return id; }
}


