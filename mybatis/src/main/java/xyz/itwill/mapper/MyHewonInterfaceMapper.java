package xyz.itwill.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import xyz.itwill.dto.MyHewon;

//mybatis 프레임워크는 Interface 기반의 매퍼파일만 사용해 맵퍼로 등록 가능
// => 인터페이스의 추상메소드에 매퍼 어노테이션을 사용해 SQL 명령 등록
public interface MyHewonInterfaceMapper {
	@Select("select hewon_id, hewon_name, hewon_phone, hewon_email, hewon_scope from myhewon order by hewon_id")
	List<MyHewon> selectHewonList();
}
