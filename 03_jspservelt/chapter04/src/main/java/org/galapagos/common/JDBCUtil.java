package org.galapagos.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
	static Connection conn = null;

	public static void connect(String driver, String url, String username, String password) throws ClassNotFoundException  {
		// 드라이버 로드
		Class.forName(driver);

		// Connection
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Connection getConnection() {
		return conn;
	}

	public static void close() {

		try {
			if (conn != null) {
				conn.close();
				conn = null;
			}

		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}