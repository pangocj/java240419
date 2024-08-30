package xyz.itwill09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JoinController {
	//사용자로부터 회원정보를 입력받기 위한 JSP 문서의 뷰이름을 반환하는 요청 처리 메소드
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		return "join_form";
	}
}
