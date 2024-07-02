package xyz.itwill.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Servlet : Server+let 합성어로 웹서버에서 실행되는 간단한 프로그램
// => SSL : Server Script Language - Java Web Program
// => Servlet 프로그램은 클라이언트의 요청으로 WAS(Web Application Server)에 의해 실행되며
//실행결과로 HTML 문서(XML 문서, JSON 문서 등)를 동적으로 생성하여 클라이언트에게 응답
//WAS(Web Application Server) : 웹프로그램을 실행하기 위한 프로그램 
// => Web 관련 객체를 관리(생성, 사용, 삭제)하는 Web Container 기능 제공  

//서블릿 프로그램을 작성하는 방법
//1.HttpServlet 클래스를 상속받은 자식클래스 작성 - 서블릿 클래스
// => 서블릿 프로그램을 작성하기 위해서는 JavaEE 라이브러리(Apache Tomcat 라이브러리)가 프로젝트에 빌드 처리
// => HttpServlet 클래스를 상속받은 자식클래스는 객체 직렬화 클래스로 serialVersionUID 필드를 선언하는 것을 권장
// => 클라이언트가 서블릿 프로그램을 요청하면 WAS 프로그램이 서블릿 클래스를 자동으로 객체로 생성
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//2.doGet() 메소드 또는 doPost() 메소드를 오버라이딩 선언 - 요청 처리 메소드
	// => 클라이언트 요청에 대한 처리과 처리결과를 웹문서로 생성하는 명령을 작성하는 메소드
	// => 요청 처리 메소드는 WAS 프로그램에 의해 자동 호출되는 메소드
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	
	
}














