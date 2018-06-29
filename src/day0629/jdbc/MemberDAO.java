package day0629.jdbc;

import java.util.List;

public interface MemberDAO {
	public int addMember(MemberDTO member);
	public MemberDTO getMember(String id);
	public List<MemberDTO> getMemberList();
}
