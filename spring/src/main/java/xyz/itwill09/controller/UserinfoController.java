package xyz.itwill09.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.RequiredArgsConstructor;
import xyz.itwill09.dto.Userinfo;
import xyz.itwill09.exception.BadRequestException;
import xyz.itwill09.exception.ExistsUserinfoException;
import xyz.itwill09.exception.LoginAuthFailException;
import xyz.itwill09.service.UserinfoService;

@Controller
@RequestMapping("/userinfo")
@RequiredArgsConstructor
public class UserinfoController {
	private final UserinfoService userinfoService;
	
	//회원정보를 입력받기 위한 JSP 문서의 뷰이름을 반환하는 요청 처리 메소드
	// => 관리자만 요청 가능한 페이지
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String write(HttpSession session) {
		Userinfo loginUserinfo=(Userinfo)session.getAttribute("loginUserinfo");
		//try~catch 구문을 사용해 예외가 발생될 경우 에러페이지를 출력하는 JSP 문서의 뷰이름 반환
		// => 500 에러코드 미발생
		/*
		try {
			//페이지를 요청한 사용자가 비로그인 사용자이거나 관리자가 아닌 경우 인위적 예외 발생
			if(loginUserinfo == null || loginUserinfo.getAuth() != 9) {
				throw new BadRequestException("비정상적인 방법으로 페이지를 요청 하였습니다.");
			}
		} catch (BadRequestException e) {
			return "userinfo/user_error";
		}
		*/
		return "userinfo/user_write";
	}
	
	//회원정보를 전달받아 USERINFO 테이블의 행으로 삽입하고 로그인 페이지를 요청할 수 있는
	//URL 주소를 반환하는 요청 처리 메소드
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String write(@ModelAttribute Userinfo userinfo, Model model) {
		try {
			//매개변수로 전달받은 회원정보의 아이디가 중복될 경우 ExistsUserinfoException 발생
			userinfoService.addUserinfo(userinfo);
		} catch (ExistsUserinfoException e) {
			model.addAttribute("message", e.getMessage());
			return "userinfo/user_write";
		}
		return "redirect:/userinfo/login";
	}

	//인증정보를 입력받기 위한 JSP 문서의 뷰이름을 반환하는 요청 처리 메소드
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "userinfo/user_login";
	}
	
	//인증정보를 전달받아 USERINFO 테이블에 저장된 행을 검색하여 로그인 처리하고 환영메세지를
	//출력하는 JSP 문서의 뷰이름 반환하는 요청 처리 메소드
	// => 로그인 처리 : 인증 성공시 세션에 권한 관련 정보(회원정보)를 속성값으로 저장
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute Userinfo userinfo, Model model, HttpSession session) {
		try {
			//매개변수로 전달받은 회원정보로 인증이 실패한 경우 LoginAuthFailException 발생
			Userinfo authUserinfo=userinfoService.loginAuth(userinfo);
			session.setAttribute("loginUserinfo", authUserinfo);
		} catch (LoginAuthFailException e) {
			model.addAttribute("message", e.getMessage());
			model.addAttribute("userid", userinfo.getUserid());
			return "userinfo/user_login";
		}
		
		return "userinfo/user_login";
	}
	
	//로그아웃 처리하고 로그인 페이지를 요청할 수 있는 URL 주소를 반환하는 요청 처리 메소드
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		//session.removeAttribute("loginUserinfo");
		session.invalidate();
		return "redirect:/userinfo/login";
	}
}





