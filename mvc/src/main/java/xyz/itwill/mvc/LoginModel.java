package xyz.itwill.mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xyz.itwill.service.UserinfoService;

//클라이언트가 [/login.do]로 페이지를 요청한 경우 객체로 생성될 모델 역활의 클래스
// => 인증정보를 전달받아 USERINFO 테이블에 저장된 행과 비교하여 인증 처리하고 [/loginform.do]
//주소로 리다이렉트 이동하기 위한 정보가 저장된 ActionForward 객체 반환
public class LoginModel implements Action {
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ActionForward actionForward=new ActionForward();
		try {
			if(request.getMethod().equals("GET")) {//비정상적으로 요청한 경우
				throw new Exception("비정상적인 요청 - GET 방식 요청");//인위적 예외 발생
			}
			
			//서블릿(컨트롤러) 요청시 전달된 값을 반환받아 저장
			// => 서블릿(컨트롤러)의 HttpServletRequest 객체를 요청 처리 메소드의 매개변수로
			//전달받아 사용 가능
			String userid=request.getParameter("userid");
			String password=request.getParameter("password");
			
			//모델 클래스의 요청 처리 메소드에서는 Service 클래스의 객체로 메소드를 호출하여
			//데이타 처리 관련 기능이 실행되도록 작성
			
		} catch (Exception e) {//모든 예외를 제공받아 예외 처리
			e.printStackTrace();//콘솔에 예외 관련 정보를 출력 처리
			//[/error.do] 주소로 리다이렉트 이동하기 위한 정보를 ActionForward 객체에 저장
			actionForward.setForward(false);
			actionForward.setPath(request.getContextPath()+"/error.do");
		}
		
		return actionForward;
	}
	
}
