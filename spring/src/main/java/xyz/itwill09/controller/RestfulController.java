package xyz.itwill09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//REST(Representational State Transfer) : 자원(Resource)의 표현(Representational)에 의해
//상태(State)를 전달(Transfer)하는 것을 의미
// => 페이지 요청에 대한 실행결과를 XML 문서 또는 JSON 형식의 문서로 클라이언트에게 응답 처리
//Restful API : REST 기능을 사용해 두 컴퓨터의 시스템이 안전하게 값을 주고 받기 위한 프로그램
// => 스마트기기의 프로그램(앱) 실행에 필요한 정보를 전달받거나 실행결과를 제공하기 위해 작성

@Controller
@RequestMapping("/rest")
public class RestfulController {
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		return "rest/input";
	}
	
	/*
	//페이지 요청시 요청 처리 메소드를 호출해 요청 처리 후 실행결과를 Model 객체로 Request
	//Scope 속성값으로 저장하고 뷰이름(ViewName)을 반환하여 뷰(View)로 응답 처리
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(@RequestParam String id, @RequestParam String name, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("name", name);
		return "rest/output";
	}
	*/
	
	//@ResponseBody : 요청 처리 메소드의 반환값을 리스폰즈 메세지 몸체부에 저장하여 일반 
	//문서로 클라이언트에게 전달하여 응답하는 기능을 제공하는 어노테이션
	// => Front Controller가 요청 처리 메소드의 반환값을 뷰로 변환하여 응답 처리하지 않고
	//요청 처리 메소드의 반환값으로 직접 응답 처리
	// => @ResponseBody 어노테이션 대신 ResponseEntity 클래스를 요청 처리 메소드의 반환형으로
	//작성해 응답 처리 가능
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	@ResponseBody
	public String join(@RequestBody String input) {
		return input;
	}
}
