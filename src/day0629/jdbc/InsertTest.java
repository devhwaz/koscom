package day0629.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "koscom";
		String password = "koscom";
		String sql = "insert into member values(?,?,?,?,sysdate)";
		try {
			//드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//접속
			conn = DriverManager.getConnection(url, user, password);
			//쿼리작성
			ps = conn.prepareStatement(sql);
			ps.setString(1, "testid1");
			ps.setString(2, "테스트1");
			ps.setString(3, "1111");
			ps.setString(4, "test@test.com");
			//쿼리실행
			int resultCount = ps.executeUpdate();
			System.out.println(resultCount +"건 입력하였습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
