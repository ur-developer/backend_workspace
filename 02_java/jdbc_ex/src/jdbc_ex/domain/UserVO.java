package jdbc_ex.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVO {

	// private 멤버 변수 선언
	private String id;
	private String password;
	private String name;
	private String role;
}
