package jdbc_ex.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import jdbc_ex.domain.UserVO;

class UserDAOTest {

	UserDAO dao = UserDAOImpl.getInstance();

	@Test

	void testInsertUser() {
		UserVO user = new UserVO("test", "1234", "테스트", "USER");
		dao.insertUser(user);

		user = dao.getUser("test");
		assertNotNull(user);
		assertEquals("test", user.getId());
	}

	@Test
	void testGetUserList() {
		List<UserVO> list = dao.getUserList();
		assertEquals(4, list.size(), "목록의 개수가 일치하지 않음");

		for (UserVO user : list) {
			System.out.println(user);
		}
	}

	@Test
	void testGetUser() {
		UserVO user = dao.getUser("member");
		assertNotNull(user);
		assertEquals("member", user.getId());

	}

	@Test
	void testUpdateUser() {
		UserVO user = dao.getUser("admin");
		user.setName("최고관리자");

		dao.updateUser(user);
		user = dao.getUser("admin");
		assertNotNull(user);
		assertEquals("최고관리자", user.getName());
	}

	@Test
	void testDeleteUser() {
		dao.deleteUser("test");
		UserVO user = dao.getUser("test");
		assertNull(user);
	}

}
