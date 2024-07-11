package xyz.itwill.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import xyz.itwill.dto.MemberDTO;

public class MemberDAO extends JdbcDAO {
	private static MemberDAO _dao;
	
	private MemberDAO() {
		// TODO Auto-generated constructor stub
	}
	
	static {
		_dao=new MemberDAO();		
	}
	
	public static MemberDAO getDAO() {
		return _dao;
	}
	
	//회원정보(MemberDTO 객체)를 전달받아 MEMBER 테이블의 행으로 삽입하고 삽입행의 갯수(int)를 반환하는 메소드
	public int insertMember(MemberDTO member) {
		Connection con=null;
		PreparedStatement pstmt=null;
		int rows=0;
		try {
			con=getConnection();
			
			String sql="insert into member values(member_seq.nextval,?,?,?,?,?,?,?,?,sysdate,null,null,1)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPasswd());
			pstmt.setString(3, member.getMemberName());
			pstmt.setString(4, member.getMemberEmail());
			pstmt.setString(5, member.getMemberMobile());
			pstmt.setString(6, member.getMemberZipcode());
			pstmt.setString(7, member.getMemberAddress1());
			pstmt.setString(8, member.getMemberAddress2());
			
			rows=pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("[에러]insertMember() 메서드의 SQL 오류 = "+e.getMessage());
		} finally {
			close(con, pstmt);
		}
		return rows;
	}
	
}
















