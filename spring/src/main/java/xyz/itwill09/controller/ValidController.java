package xyz.itwill09.controller;

import java.util.regex.Pattern;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import xyz.itwill09.dto.Employee;

@Controller
public class ValidController {
	@RequestMapping(value = "/valid/html", method = RequestMethod.GET)
	public String html() {
		return "valid/html_form";		
	}
	
	@RequestMapping(value = "/valid/html", method = RequestMethod.POST)
	public String html(@ModelAttribute Employee employee, Model model) {
		if(employee.getId() == null || employee.getId().equals("")) {
			model.addAttribute("idMsg", "아이디를 입력해 주세요");
			return "valid/html_form";		
		}
		
		String idReg="^[a-zA-Z]\\w{5,19}$";
		if(!Pattern.matches(idReg, employee.getId())) {
			model.addAttribute("idMsg", "아이디를 형식에 맞게 입력해 주세요");
			return "valid/html_form";		
		}
		
		return "valid/result";		
	}
	
	@RequestMapping(value = "/valid/spring", method = RequestMethod.GET)
	public String spring() {
		return "valid/spring_form";		
	}
}












