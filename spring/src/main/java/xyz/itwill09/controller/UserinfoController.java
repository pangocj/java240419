package xyz.itwill09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.RequiredArgsConstructor;
import xyz.itwill09.dto.Userinfo;
import xyz.itwill09.service.UserinfoService;

@Controller
@RequestMapping("/userinfo")
@RequiredArgsConstructor
public class UserinfoController {
	private final UserinfoService userinfoService;
	
	//회원정보를 입력받기 위한 JSP 문서의 뷰이름을 반환하는 요청 처리 메소드
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String write() {
		return "userinfo/user_write";
	}
	
	//회원정보를 전달받아 USERINFO 테이블의 행으로 삽입하고 로그인 페이지를 요청할 수 있는
	//URL 주소를 반환하는 요청 처리 메소드
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String write(@ModelAttribute Userinfo userinfo) {
		userinfoService.addUserinfo(userinfo);
		return "redirect:/userinfo/login";
	}

	//인증정보를 입력받기 위한 JSP 문서의 뷰이름을 반환하는 요청 처리 메소드
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "userinfo/user_login";
	}
}





