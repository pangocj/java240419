package xyz.itwill09.controller;

import org.springframework.stereotype.Controller;
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
	public String html(@ModelAttribute Employee employee) {
		return "valid/result";		
	}
}
