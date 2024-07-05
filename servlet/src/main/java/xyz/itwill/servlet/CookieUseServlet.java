package xyz.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//클라이언트에게 전달받은 쿠키값을 HTML 문서에 포함하여 응답하는 서블릿
// => 클라이언트는 서버에 접속하여 서블릿을 요청하면 접속된 서버정보로 저장된 모든 쿠키를 
//리퀘스트 메세지 머릿부에 저장하여 서블릿에게 전달
@WebServlet("/use.itwill")
public class CookieUseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		
		//클라이언트에게 전달받은 모든 쿠키를 반환받아 저장
		//HttpServletRequest.getCookies : 클라이언트로부터 전달받은 모든 쿠키를 Cookie 객체
		//배열로 반환하는 메소드
		Cookie[] cookies=request.getCookies();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='utf-8'>");
		out.println("<title>Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>쿠키 사용</h1>");
		out.println("<hr>");
		if(cookies == null) {//클라이언트로부터 전달받은 쿠키가 없는 경우 
			out.println("<p>네 안에 쿠키 없다</p>");
		} else {
			String id="";
			String count="";
			
			//배열의 요소값(Cookie 객체)를 차례대로 제공받아 변수에 저장하기 위한 반복문
			for(Cookie cookie : cookies) {
				//Cookie.getName() : Cookie 객체에 저장된 쿠키명을 반환하는 메소드
				if(cookie.getName().equals("id")) {
					//Cookie.getValue() : Cookie 객체에 저장된 쿠키값을 반환하는 메소드
					id=cookie.getValue();
				} else if(cookie.getName().equals("count")) {
					count=cookie.getValue();
				}
			}
			
			if(!id.equals("")) {//쿠키값이 있는 경우
				//쿠키값을 HTML 문서에 포함하여 출력 처리
				out.println("<p>아이디 = "+id+"</p>");
			}
			
			if(!count.equals("")) {
				int cnt=Integer.parseInt(count)+1;
				out.println("<p>서블릿 요청 횟수 = "+cnt+"</p>");
				
				//Cookie 객체를 생성하여 클라이언트에게 전달해 저장
				// => 클라이언트에 전달된 쿠키의 쿠키명이 클라이언트에 저장된 쿠키명과 같은
				//경우 기존 쿠키를 삭제하고 전달된 쿠키로 저장 - 쿠키 변경
				Cookie cookie=new Cookie("count", cnt+"");
				cookie.setMaxAge(24*60*60);
				response.addCookie(cookie);
			}
		}
		out.println("<hr>");
		out.println("<p><a href='/servlet/create.itwill'>쿠키 생성</a></p>");
		out.println("<p><a href='/servlet/remove.itwill'>쿠키 삭제</a></p>");
		out.println("</body>");
		out.println("</html>");
	}
}
