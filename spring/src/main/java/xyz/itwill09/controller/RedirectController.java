package xyz.itwill09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {
	@RequestMapping("/forward_move")
	public String forward(Model model) {
		//Model 객체를 사용해 뷰(View)에게 제공할 객체를 Request Scope 속성값으로 저장
		model.addAttribute("name", "홍길동");
		
		//뷰(View)를 생성하기 위한 뷰이름(ViewName) 반환
		// => Front Controller(DispatcherServlet 객체)는 요청 처리 메소드를 호출하여 호출 처리 
		//후 반환받은 뷰이름을 InternalResourceViewResolver 객체에게 전달하여 JSP 문서의 경로를
		//제공받아 JSP 문서로 포워드 이동하여 응답 처리
		//포워드 이동 : 클라이언트 요청에 의해 실행된 웹프로그램(Front Controller)에서 응답 
		//처리할 웹프로그램(View - JSP)으로 스레드를 이동하여 응답 처리
		// => 클라이언트의 요청 URL 주소는 변경되지 않고 Request Scope 속성값을 스레드가 이동된
		//웹프로그램(JSP)에서 객체로 제공받아 사용 가능
		return "display_forward";
	}
}
