package xyz.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//입력페이지의 form 태그를 사용해 사용자 입력값(파일)을 [multipart/form-data]로 전달받은 경우
//HttpServletRequest 객체로 리퀘스트 메세지 몸체부에 저장된 이진파일을 읽기 위해 입력스트림을
//(ServletInputStream 객체)를 반환받아 전달값과 전달파일을 구분하여 처리
// => [multipart/form-data]로 전달되는 문자값과 파일을 처리하기 위한 클래스를 사용하는 것을 권장

//[multipart/form-data]로 전달되는 문자값과 파일을 처리하기 위한 클래스가 포함된 라이브러리
//파일을 다운로드 받아 프로젝트로 빌드 처리
//1.Apache 그룹에서 배포한 commons-fileupload 라이브러리의 클래스 사용 - 선택적 파일 업로드
//2.Oreilly 그룹에서 배포한 cos 라이브러리의 클래스 사용 - 무조건 파일 업로드

//Oreilly 그룹에서 배포한 cos 라이브러리 파일을 다운로드 받아 프로젝트에 빌드 처리하는 방법
//1.http://www.servlets.com 사이트 접속 >> COS File Upload Library 메뉴 클릭 >> cos-22.05.zip 다운로드
//2.cos-22.05.zip 파일 압축 풀기 >> cos-22.05 폴더 이동 >> lib 폴더 이동 >> cos.jar 복사
//3.프로젝트 >> src/main/webapp >> WEB-INF >> lib >> cos.jar 붙여넣기
// => /WEB-INF/lib 폴더에 라이브러리 파일(jar 파일)을 붙여넣기 하면 자동으로 프로젝트에
//라이브러리 파일을 빌드 처리

//입력페이지(file_upload.html)에서 전달된 입력값과 입력파일의 이름을 HTML 문서에 포함하여 
//출력처리 되도록 응답하는 서블릿 
// => 사용자로부터 입력받아 전달된 파일은 서버 디렉토리에 저장 - 파일 업로드(File Upload)
@WebServlet("/upload.itwill")
public class FileUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		
		if(request.getMethod().equals("GET")) {
			response.sendRedirect("/servlet/file_upload.html");//입력페이지로 이동
			return;
		}
		
		/*
		//form 태그를 사용해 [multipart/form-data]로 전달된 입력값은 HttpServletRequest 객체의
		//getParameter() 메소드로 반환받아 사용 불가능
		request.setCharacterEncoding("utf-8");
		String uploader=request.getParameter("uploader");
		*/
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='utf-8'>");
		out.println("<title>Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>파일 업로드</h1>");
		out.println("<hr>");
		out.println("<p>올린이 = "+uploader+"</p>");
		out.println("</body>");
		out.println("</html>");	
	}
}






