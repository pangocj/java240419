package xyz.itwill09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JoinController {
	//사용자로부터 회원정보를 입력받기 위한 JSP 문서의 뷰이름을 반환하는 요청 처리 메소드
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		return "join_form";
	}
	
	/*
	//전달값(회원정보)을 매개변수로 제공받아 Request Scope 속성값으로 저장하고 속성값을 출력하는
	//JSP 문서의 뷰이름을 반환하는 요청 처리 메소드
	// => 전달값과 같은 이름으로 매개변수를 작성해 전달값 제공받아 사용
	// => 전달값을 제공받기 위해 매개변수에 @RequestParam 어노테이션을 사용해 매개변수의
	//이름과 같은 이름으로 전달된 값이 없는 경우 400 에러코드가 발생되도록 작성
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(@RequestParam String id, @RequestParam String passwd
			, @RequestParam String name, @RequestParam String email, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("passwd", passwd);
		model.addAttribute("name", name);
		model.addAttribute("email", email);
		return "join_display";
	}
	*/
	
	//@ModelAttribute : 값(객체)를 뷰(View)에게 제공하기 위한 어노테이션
	// => 전달값을 제공받아 저장하기 위한 매개변수에 @ModelAttribute 어노테이션을 사용하면 
	//매개변수에 저장된 전달값을 요청 처리 메소드의 뷰이름으로 생성된 뷰에게 제공
	// => value 속성을 반드시 사용해 뷰에서 속성값을 사용할 수 있는 속성명을 설정
	// => value 속성값으로 설정된 이름의 전달값을 얻어와 매개변수에 저장하여 사용
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(@ModelAttribute("id") String id, @ModelAttribute("passwd") String passwd
			, @ModelAttribute("name") String name, @ModelAttribute("email") String email) {
		return "join_display";
	}
	
}










