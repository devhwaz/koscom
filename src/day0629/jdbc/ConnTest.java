package day0629.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnTest {

	public static void main(String[] args) {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "koscom";
		String password = "koscom";
		try {
			// 드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 접속
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		if (conn != null)
			System.out.println("^^");
		else
			System.out.println("-_-;;");
	}

}
