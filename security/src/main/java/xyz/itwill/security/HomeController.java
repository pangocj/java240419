package xyz.itwill.security;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//Spring Security : 인증과 인가 기능을 제공하는 보안 프레임워크
//인증(Authentication) : 프로그램을 사용할 수 있는 사용자가 맞는지를 확인하는 절차
// => 인증을 정상적으로 수행하기 위해서는 사용자를 구분할 수 있는 정보 필요 - Credential
//인가(Authorization) : 인증된 사용자가 요청한 자원에 접근 가능한가를 결정하는 절차
// => 인증 처리 후 권한을 부여 받을 수 있으며 권한은 일반적으로 역활(Role) 형태로 부여

//Spring Security는 인증과 인가를 위해 Principal 객체를 아이디로 사용하고 Credential 객체를
//비밀번호로 사용하는 Credential 기반의 인증 방식을 사용

//Spring Security를 SpringMVC 프로그램에 적용하여 제공 받을 수 있는 기능
// => 다양한 형태(폼로그인 인증, 토큰 기반 인증, OAuth2 기반 인증, LDAP 인증)의 사용자 인증 방법 제공
// => 프로그램 사용자의 역활(Role)에 따른 권한 레벨 적용
// => 프로그램에서 제공하는 자원에 대한 접근 제어
// => 데이타 암호화
// => SSL 적용
// => 일반적으로 알려진 웹보안 공격 차단

//Spring Security를 SpringMVC 프로그램에 적용하는 방법
//1.spring-security-web, spring-security-core, spring-security-config, spring-security-tablibs
//라이브러리를 프로트젝에 빌드 처리 - 메이븐 : pom.xml
//2.[web.xml] 파일에 Spring Security 기능을 제공하는 필터 클래스를 필터로 등록하고 필터가 실행
//되기 위한 URL 패턴을 매핑 처리
//3.[web.xml] 파일에 Spring Security 기능의 필터가 사용하기 위한 정보를 제공하는 Spring Bean
//Configuration File 설정 - ContextLoaderListener 클래스가 읽을 수 있도록 파일 경로 지정
//4.Spring Security 기능을 구현하기 위한 Spring Bean Configuration File 작성
// => Spring Security 관련 필터가 동작되기 위한 정보를 security 네임스페이스를 추가하여
//spring-security.xsd 파일에 설정된 엘리먼트를 사용하여 제공

@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
