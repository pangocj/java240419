package xyz.itwill.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import xyz.itwill.dto.MyComment1;
import xyz.itwill.dto.MyComment2;
import xyz.itwill.mapper.MyCommentMapper;

public class MyCommentDAO extends AbstractSession {
	private static MyCommentDAO _dao;
	
	private MyCommentDAO() {
		// TODO Auto-generated constructor stub
	}
	
	static {
		_dao=new MyCommentDAO(); 
	}
	
	public static MyCommentDAO getDAO() {
		return _dao;
	}
	
	public int insertComment1(MyComment1 comment) {
		SqlSession sqlSession=getSqlSessionFactory().openSession(true);
		try {
			return sqlSession.getMapper(MyCommentMapper.class).insertComment1(comment);
		} finally {
			sqlSession.close();
		}
	}
		
	public int insertComment2(MyComment1 comment) {
		SqlSession sqlSession=getSqlSessionFactory().openSession(true);
		try {
			return sqlSession.getMapper(MyCommentMapper.class).insertComment2(comment);
		} finally {
			sqlSession.close();
		}
	}
	
	public List<MyComment1> selectCommentList1() {
		SqlSession sqlSession=getSqlSessionFactory().openSession(true);
		try {
			return sqlSession.getMapper(MyCommentMapper.class).selectCommentList1();
		} finally {
			sqlSession.close();
		}
	}
	
	public List<MyComment2> selectCommentList2() {
		SqlSession sqlSession=getSqlSessionFactory().openSession(true);
		try {
			return sqlSession.getMapper(MyCommentMapper.class).selectCommentList2();
		} finally {
			sqlSession.close();
		}
	}
}










