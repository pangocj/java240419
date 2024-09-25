package xyz.itwill.security;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.scribejava.core.model.OAuth2AccessToken;

import lombok.RequiredArgsConstructor;
import xyz.itwill.auth.KaKaoLoginBean;

//Spring Security는 OAuth2.0을 사용한 인증 처리 기능 제공
// => Google, Kakao, Naver 등의 Social 로그인 기능을 사용한 인증 처리

//카카오의 로그인 OpenAPI를 사용해 간편 로그인 하는 방법
//1.Kakao Developers 페이지 접속 - Kakao 로그인
//2.[내 애플리케이션] >> [애플리케이션 추가하기] >> 앱 아이콘, 앱 이름, 회사명, 카테고리 입력 >> 저장
// => [비즈니스] >> [개인 개발자 비즈 앱 전환] >> 2차 인증 >> 비즈 앱 전환 목적 : [이메일 필수 동의] >> 전환
//3.생성된 애플리케이션 >> [앱키] >> [REST API 키] 복사 
//4.생성된 애플리케이션 >> [플랫폼] >> [Web 플랫폼 등록] >> 사이트 도메인 추가 >> 저장 
//5.생성된 애플리케이션 >> [카카오 로그인] >> [활성화 설정]의 상태를 [ON]으로 변경
//  >> [Redirect URI 등록] >> Redirect URI 주소 입력 >> 저장
// => Redirect URI 주소 : http://localhost:8000/security/kakao/callback
//6.생성된 애플리케이션 >> [카카오 로그인] >> [동의 항목] >> 동의 항목 설정 - 동의된 항목만 응답받아 사용 가능 
//7.생성된 애플리케이션 >> [카카오 로그인] >> [보안] >> Client Secret 코드 발급 및 복사 
// >> 활성화 상태로 변경
//8.scribejava-apis 라이브러리와 json-simple 라이브러리를 프로젝트에 빌드 처리 - 메이븐 : pom.xml
//9.로그인 관련 OpenAPI를 요청하기 위한 KakaoLoginApi 클래스와 KaKaoLoginBean 클래스 작성

@Controller
@RequestMapping("/kakao")
@RequiredArgsConstructor
public class KakaoController {
	private final KaKaoLoginBean kaKaoLoginBean;
	
	//카카오 로그인 페이지를 요청하기 위한 요청 처리 메소드
	@RequestMapping("/login")
	public String login(HttpSession session) {
		String kakaoAuthUrl=kaKaoLoginBean.getAuthorizationUrl(session);
		return "redirect:"+kakaoAuthUrl;
	}
	
	//카카오 로그인 성공시 요청되는 콜백 URL 주소를 처리하기 위한 요청 처리 메소드
	@RequestMapping("/callback")
	public String login(@RequestParam String code, @RequestParam String state
			, HttpSession session) throws IOException {
		OAuth2AccessToken accessToken=kaKaoLoginBean.getAccessToken(session, code, state);
		String apiResult=kaKaoLoginBean.getUserProfile(accessToken);
		//apiResult = {"id":3719292067,"connected_at":"2024-09-25T01:56:26Z","properties":{"nickname":"내삶의선물","profile_image":"http://k.kakaocdn.net/dn/dazM9Q/btsJEGW5mS6/J5HBuuTUjmBfLwAAajWbqk/img_640x640.jpg","thumbnail_image":"http://k.kakaocdn.net/dn/dazM9Q/btsJEGW5mS6/J5HBuuTUjmBfLwAAajWbqk/img_110x110.jpg"},"kakao_account":{"profile_nickname_needs_agreement":false,"profile_image_needs_agreement":false,"profile":{"nickname":"내삶의선물","thumbnail_image_url":"http://k.kakaocdn.net/dn/dazM9Q/btsJEGW5mS6/J5HBuuTUjmBfLwAAajWbqk/img_110x110.jpg","profile_image_url":"http://k.kakaocdn.net/dn/dazM9Q/btsJEGW5mS6/J5HBuuTUjmBfLwAAajWbqk/img_640x640.jpg","is_default_image":false,"is_default_nickname":false},"has_email":true,"email_needs_agreement":false,"is_email_valid":true,"is_email_verified":true,"email":"ocj1778@hanmail.net"}}
		System.out.println("apiResult = "+apiResult);
		
		return "redirect:/";
	}
}


















