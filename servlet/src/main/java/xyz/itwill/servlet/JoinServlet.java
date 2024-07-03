package xyz.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//입력페이지(form.html)로부터 전달된 입력값(회원정보)을 반환받아 HTML 문서에 포함하여 출력처리
//되도록 응답하는 서블릿 
// => 입력페이지의 form 태그를 사용해 post 방식으로 요청하여 실행되는 서블릿
@WebServlet("/join.itwill")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		
		//서블릿을 get 방식으로 요청한 경우 비정상적인 요청이므로 클라이언트에게 에러코드(4XX 
		//or 5XX)를 전달하여 응답하거나 에러메세지를 출력하는 페이지의 URL 주소를 전달하여 응답
		//HttpServletRequest.getMethod() : 클라이언트가 서블릿을 요청한 요청방식(GET or POPST)을
		//반환하는 메소드
		//System.out.println("요청방식 = "+request.getMethod());
		if(request.getMethod().equals("GET")) {//서블릿을 GET 방식으로 요청한 경우
			/*
			//HttpServletResponse.sendError(int sc) : 클라이언트에게 에러코드를 전달하여 응답하는 메소드
			// => 매개변수에 전달되는 에러코드는 HttpServletResponse 인터페이스의 상수필드를 사용하는 것을 권장
			// => [web.xml] 파일에서 error-page 엘리먼트를 사용해 에러코드에 대한 에러메세지를
			//저장한 웹문서를 전달하여 응답해 출력하는 기능 제공 - 브라우저의 URL 주소 미변경
			//response.sendError(400);
			//response.sendError(HttpServletResponse.SC_BAD_REQUEST);
			//response.sendError(405);
			response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
			return;
			*/
			
			/*
			//HttpServletResponse.sendRedirect(String url) : 클라이언트에게 URL 주소를 전달하여 응답하는 메소드
			// => URL 주소를 응답받은 클라이언트는 브라우저의 URL 주소를 변경하여 URL 주소의
			//웹프로그램을 요청해 실행결과를 응답받아 출력 처리 - 리다이렉트 이동(페이지 이동)
			response.sendRedirect("/servlet/error.html");
			return;
			*/
			
			//응답파일(HTML 문서)에 자바스크립트을 저장하여 웹문서를 전달해 응답 처리
			// => 경고창을 사용해 메세지를 출력한 후 원하는 페이지로 이동되도록 처리
			out.println("<script>");
			out.println("alert('비정상적인 방법으로 페이지를 요청 하였습니다.');");
			out.println("location.href='/servlet/form.html';");
			out.println("</script>");
			return;
		}
	}
}










