package xyz.itwill09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import xyz.itwill09.dto.Product;

//스프링 메세지(Spring Message - 메세지를 관리하는 기능) 사용 방법
//1.메세지가 저장된 Properties 파일 생성
// => 스프링 컨테이너(WebApplicationContext 객체)가 참조할 수 있도록 [src/main/webapp] 폴더에
//Properties 파일을 작성하는 것을 권장

@Controller
@RequestMapping("/message")
public class MessageController {
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String message(@ModelAttribute Product product) {
		return "message/register";
	}
}
