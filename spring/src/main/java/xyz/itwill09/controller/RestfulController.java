package xyz.itwill09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
}
