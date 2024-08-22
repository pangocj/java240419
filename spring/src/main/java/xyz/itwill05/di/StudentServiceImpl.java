package xyz.itwill05.di;

import java.util.List;

//Service 클래스 : 프로그램 실행에 필요한 데이타 처리 기능을 제공하기 위한 클래스 - 컴퍼넌트
// => Service 클래스의 메소드는 DAO 클래스의 객체로 다수의 메소드를 호출하여 작성 - DAO 모듈화
// => Service 클래스의 메소드에서 DAO 클래스의 메소드를 호출하기 위해 Service 클래스에 DAO
//객체를 저장할 수 있는 필드 작성 - DAO 클래스와 Service 클래스를 포함관계(의존관계)로 설정
// => Service 클래스 교체돼도 Service 클래스를 사용하는 클래스(Medel 클래스)에 영향을 최소화 하기
//위해 반드시 인터페이스를 상속받아 작성하는 것을 권장 - 결합도를 낮춰 유지보수의 효율성 증가
public class StudentServiceImpl implements StudentService {
	//StudentJdbcDAOImpl 클래스를 사용하여 필드 작성
	// => StudentJdbcDAOImpl 객체를 제공받아 필드에 저장해야만 의존관계 성립
	// => StudentServiceImpl 클래스의 메소드에서 필드에 저장된 StudentJdbcDAOImpl 객체를 참조해
	//StudentJdbcDAOImpl 클래스의 메소드 호출
	private StudentJdbcDAOImpl studentJdbcDAOImpl;
	
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rmoveStudent(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student getStudent(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getStudentList() {
		// TODO Auto-generated method stub
		return null;
	}

}
