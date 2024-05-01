package oop;

//회원정보(아이디, 이름, 이메일)를 저장하기 위한 클래스
public class Member {
	//필드(Field) : 표현대상의 속성값을 저장하기 위한 클래스의 요소
	private String id;
	private String name;
	private String email;

	//생성자(Constructor) : 객체를 생성하기 위한 특별한 메소드
	// => 생성자를 작성하지 않으면 매개변수가 없는 기본 생성자를 자동으로 생성하여 제공
	// => 생성자를 작성하면 매개변수가 없는 기본 생성자 미제공
	// => 필드에 원하는 초기값이 저장된 객체를 생성하기 위해 생성자 작성
	//형식) 접근제한자 클래스명(자료형 변수명, 자료형 변수명, ...) { 명령; 명령; ... }
	// => 반환형을 작성하지 않으며 생성자의 이름은 반드시 클래스 이름과 동일하게 작성
	// => 메소드 오버로딩을 사용해 다수의 생성자 작성
	// => 일반적으로 생성자에서는 매개변수로 전달받은 값은 필드의 초기값으로 저장하는 명령 작성
	
	//매개변수가 없는 생성자 작성 - 기본 생성자(Default Constructor)
	// => 필드에 대한 초기화 작업 미구현 - 필드에는 기본값이 초기값으로 저장
	// => 기본 생성자를 작성하지 않으면 클래스 상속시 문제가 발생될 수 있으므로 기본 생성자를 작성하는 것을 권장
	//이클립스 기능을 사용하여 기본 생성자 자동 작성 가능
	// => [Ctrl]+[Space] >> 나열된 목록 중 Constructor 선택
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	//매개변수가 있는 생성자 작성
	// => 매개변수에 전달되어 저장된 값을 필드의 초기값으로 저장
	//이클립스 기능을 사용하여 매개변수가 있는 생성자 자동 작성 가능
	// => [Alt]+[Shift]+[S] >> 팝업메뉴 - [O] >> 생성자 생성창 - 필드 선택 후 [Generate] 클릭
	public Member(String id) {
		this.id=id;
	}
	
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Member(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	//메소드(Method) : 명령을 실행하여 표현대상의 행위(기능)을 구현하기 위한 클래스의 요소
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display() {
		//System.out.println("아이디 = "+this.id);
		System.out.println("아이디 = "+id);
		System.out.println("이름 = "+name);
		System.out.println("이메일 = "+email);
	}
}
