package xyz.itwill09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
//@Controller : 요청 처리 클래스(Controller 클래스)를 Spring Bean으로 등록하기 위한 어노테이션
// => 클래스의 이름을 Spring Bean을 구분하는 식별자(beanName)으로 사용 - 첫문자는 소문자로 변환
// => value 속성을 사용해 식별자(beanName) 변경 가능
//@Controller 어노테이션을 사용하여 Controller 인터페이스를 상속받지 않아도 요청 처리 클래스로 사용
// => 메소드에 @RequestMapping 어노테이션을 사용해 요청 처리 메소드로 처리되도록 작성
@Controller
public class HelloController {
	//
	
	//@RequestMapping : Controller 클래스의 메소드를 요청 처리 메소드로 설정하기 위한 어노테이션
	// => 클라이언트의 모든 요청방식(Method - GET, POST, PUT, PATCH, DELETE 등)에 의해 호출되는
	//요청 처리 메소드를 작성할 때 사용
	// => 클라이언트의 요청방식을 구분하여 요청 처리 메소드를 호출할 경우 @GetMapping, @PostMappingt
	//, @PutMapping, @PatchMapping, @DeleteMapping 등의 어노테이션 사용 가능
	//value 속성 : 클라이언트의 요청정보(Command - URL 주소)를 속성값으로 설정
	// => value 속성외에 다른 속성이 없는 경우 속성값만 설정 가능
	// => value 속성값으로 설정된 URL 주소로 요청한 경우 요청 처리 메소드를 호출하여 명령 실행
	@RequestMapping(value = "/hello")
	public void hello() {
		log.info("[/hello] 페이지 요청 : HelloController 클래스의 hello() 메소드 호출");
	}
}













