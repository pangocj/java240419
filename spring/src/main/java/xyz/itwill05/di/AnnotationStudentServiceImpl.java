package xyz.itwill05.di;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component 어노테이션의 value 속성외 다른 속성이 없는 경우 속성값만 설정 가능
//@Component(value = "studentService")
@Component("studentService")
public class AnnotationStudentServiceImpl implements StudentService {
	//@Autowired : 스프링 컨테이너로부터 Spring Bean으로 등록된 클래스의 객체를 제공받아 필드에
	//자동으로 저장되도록 의존성 주입을 하기 위한 어노테이션
	
	//클래스의 필드에 @Autowired 어노테이션을 사용하여 의존성 주입 - 필드 레벨의 의존성 주입
	// => 필드가 여러개 작성된 경우 필드마다 @Autowired 어노테이션을 사용해 의존성 주입 
	// => bean 엘리먼트의 autowire 속성값을 [byType]으로 설정한 경우 같은 방법으로 의존성 주입
	// => Setter Injection 기능을 사용하지만 필드의 Setter 메소드가 없어도 의존성 주입 가능
	
	//문제점 : 필드의 자료형이 인터페이스인 경우 인터페이스를 상속받은 자식클래스가 Spring Bean으로
	//2개이상 등록된 경우 의존성 주입 실패 - 예외 발생
	//해결법-1 : 다수의 클래스 중 의존성 주입하고자 하는 클래스의 식별자(beanName)을 필드명과
	//동일하게 변경 - 동일한 자료형의 Spring Bean이 여러개인 경우 autowire 속성값을 [byName]으로
	//설정한 경우와 같은 방법으로 의존성 주입
	@Autowired
	private StudentDAO studentDAO;
	
	public AnnotationStudentServiceImpl() {
		System.out.println("### AnnotationStudentServiceImpl 클래스의 기본 생성자 호출 ###");
	}
	
	@Override
	public void addStudent(Student student) {
		System.out.println("*** AnnotationStudentServiceImpl 클래스의 addStudent(Student student) 메소드 호출 ***");
		studentDAO.insertStudent(student);
	}

	@Override
	public void modifyStudent(Student student) {
		System.out.println("*** AnnotationStudentServiceImpl 클래스의 modifyStudent(Student student) 메소드 호출 ***");
		studentDAO.updateStudent(student);
	}

	@Override
	public void removeStudent(int num) {
		System.out.println("*** AnnotationStudentServiceImpl 클래스의 removeStudent(int num) 메소드 호출 ***");
		studentDAO.deleteStudent(num);
	}

	@Override
	public Student getStudent(int num) {
		System.out.println("*** AnnotationStudentServiceImpl 클래스의 getStudent(int num) 메소드 호출 ***");
		return studentDAO.selectStudent(num);
	}

	@Override
	public List<Student> getStudentList() {
		System.out.println("*** AnnotationStudentServiceImpl 클래스의 getStudentList() 메소드 호출 ***");
		return studentDAO.selectStudentList();
	}
}
