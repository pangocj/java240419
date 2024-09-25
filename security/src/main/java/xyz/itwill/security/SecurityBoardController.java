package xyz.itwill.security;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;
import xyz.itwill.service.SecurityBoardService;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class SecurityBoardController {
	private final SecurityBoardService securityBoardService;
	
	//페이지 요청시 모든 전달값을 Map 객체로 제공받아 사용
	@RequestMapping("/list")
	public String list(@RequestParam Map<String, Object> map, Model model) {
		model.addAttribute("resultMap", securityBoardService.getSecurityBoardList(map));
		model.addAttribute("searchMap", map);
		return "board/board_list";
	}
}






