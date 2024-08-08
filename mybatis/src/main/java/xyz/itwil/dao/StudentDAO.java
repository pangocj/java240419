package xyz.itwil.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;

import xyz.itwill.dto.StudentDTO;

public class StudentDAO {
	private static StudentDAO _dao;
	
	private StudentDAO() {
		// TODO Auto-generated constructor stub
	}
	
	static {
		_dao=new StudentDAO();
	}
	
	public static StudentDAO getDAO() {
		return _dao;
	}
	
	//SqlSessionFactory 객체를 생성하여 반환하는 메소드
	private SqlSessionFactory getSqlSessionFactory() {
		
	}
	
	//STUDENT 테이블에 저장된 모든 행을 검색하여 List 객체로 반환하는 메소드
	public List<StudentDTO> selectStudentList() {
		
	}
}











