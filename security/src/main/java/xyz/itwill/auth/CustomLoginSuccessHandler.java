package xyz.itwill.auth;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

//인증 성공 후 실행될 기능을 제공하기 위한 클래스
// => 마지막 로그인 날짜 변경 처리 또는 로그인 실패 횟수 초기화 등의 기능 구현
// => AuthenticationSuccessHandler 인터페이스를 상속받아 작성하거나 AuthenticationSuccessHandler 
//인터페이스를 상속받은 자식클래스를 상속받아 작성

//인증 성공 후 사용자 권한에 따라 다른 페이지로 이동하는 기능을 제공
public class CustomLoginSuccessHandler implements AuthenticationSuccessHandler {
	//인증 성공시 자동 호출되는 메소드
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		
		//로그인 사용자의 권한을 저장하기 위한 List 객체 생성
		List<String> roleNames=new ArrayList<String>();
		
		
		
	}
}







