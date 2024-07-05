package xyz.itwill.guest;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//게시글을 전달받아 GUEST 테이블에 행으로 삽입하고 게시글 목록페이지(/guest/list.itwill)를
//요청할 수 있는 URL 주소를 응답하는 서블릿
// => 클라이언트는 응답받은 URL 주소로 브라우저의 요청 URL 주소로 변경하고 URL 주소의 서블릿을
//요청해 실행결과를 응답받아 출력 처리 - 리다이렉트 이동
@WebServlet("/guest/write.itwill")
public class GuestWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
