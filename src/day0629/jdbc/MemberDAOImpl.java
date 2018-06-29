package day0629.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class MemberDAOImpl implements MemberDAO {

	@Override
	public int addMember(MemberDTO member) {
		//1.선언
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "insert into member values(?,?,?,?,sysdate)";
		int resultCount = 0;
		try {
		//3.접속
		conn = DBUtil.getConnect();
		//4.쿼리작성
		ps = conn.prepareStatement(sql);
		ps.setString(1, member.getId());
		ps.setString(2, member.getName());
		ps.setString(3, member.getPassword());
		ps.setString(4, member.getEmail());
		
		//5. 실행
		resultCount = ps.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			//2.닫기
			DBUtil.close(conn, ps);
		}
		
		return resultCount;
	}

}
