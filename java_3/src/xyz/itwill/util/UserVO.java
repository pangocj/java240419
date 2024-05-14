package xyz.itwill.util;

//VO 클래스(Value Object) : 객체를 하나의 값으로 표현하기 위한 클래스
// => VO 클래스는 객체의 모든 필드값을 변경하지 못하도록 final 제한자를 사용하여 작성 - 데이타 불변
// => final 제한자로 작성된 필드는 매개변수가 작성된 생성자로 반드시 초기화 처리 - 매개변수가 없는
//기본 생성자를 작성하면 에러 발생
// => final 제한자로 작성된 필드는 Setter 메소드로 필드값을 변경할 수 없으므로 Getter 메소드만 작성
// => 객체를 하나의 값으로 비교하기 위해 Object 클래스의 equals() 메소드와 hashCode() 메소드를
//반드시 오버라이딩 선언
// => 객체에 저장된 필드값을 검증하여 사용하기 위해 선언한 클래스
// => VO 클래스 대신 Record 자료형으로 선언하여 사용 가능 

//사용자정보(아이디, 이름, 이메일)를 저장하기 위한 클래스
// => Set 객체에 동일한 사용자정보(UserVO 객체)가 저장되는 것을 방지하기 위해 VO 클래스로 선언
public class UserVO {
	private final String id;
	private final String name;
	private final String email;
	
	public UserVO(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	//필드값을 문자열로 변환하여 반환하는 메소드
	// => Object 클래스의 toString() 메소드를 오버라이딩 선언
	@Override
	public String toString() {
		return "{"+id+", "+name+", "+email+"}";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
