package xyz.itwill.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//STUDENT 테이블에 저장된 모든 행(학생정보)을 검색하여 HTML 문서에 포함하여 응답하는 서블릿
// => JDBC 기능을 구현하기 위해서는 JDBC 관련 라이브러리 파일(ojdbc 라이브러리)을 프로젝트에 빌드 처리
@WebServlet("/old.itwill")
public class StudentDisplayOldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
