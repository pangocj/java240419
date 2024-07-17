<%@page import="xyz.itwill.dao.ReviewDAO"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 게시글(새글 또는 답글)을 전달받아 REVIEW 테이블의 행으로 삽입하고 [/review/review_list.jsp]
문서를 요청할 수 있는 URL 주소로 응답하는 JSP 문서 - 페이징 처리 및 조회기능 관련 값 전달 --%>    
<%-- => 로그인 사용자만 요청 가능한 JSP 문서 --%>
<%-- => 게시글이 [multipart/form-data]로 전달되므로 COS 라이브러리의 MultipartRequst 객체를 
사용해 전달값 및 파일 처리 - 전달파일은 [/review_image] 폴더에 저장되도록 업로드 처리 --%>

<%@include file="/security/login_check.jspf" %>
<%
	//비정상적으로 JSP 문서를 요청한 경우에 대한 응답 처리
	if(request.getMethod().equals("GET")) {//JSP 문서를 GET 방식으로 요청한 경우
		request.setAttribute("returnUrl", request.getContextPath()+"/index.jsp?workgroup=error&work=error_400");
		return;
	}

	//파일을 저장할 서버 디렉토리의 파일 시스템 경로를 반환받아 저장
	//String saveDirectory=application.getRealPath("/review_images");
	String saveDirectory=request.getServletContext().getRealPath("/review_images");
	//System.out.println("saveDirectory = "+saveDirectory);
	
	//MultipartRequst 객체 생성 - 모든 전달파일이 서버 디렉토리에 자동으로 업로드 처리
	// => cos.jar 라이브러리 파일이 프로젝트에 빌드 처리되어야만 MultipartRequst 클래스 사용 가능
	MultipartRequest multipartReques=new MultipartRequest(request, saveDirectory
			, 20*1024*1024, "utf-8", new DefaultFileRenamePolicy());
	
	//전달값을 반환받아 저장
	int ref=Integer.parseInt(multipartReques.getParameter("ref"));
	int restep=Integer.parseInt(multipartReques.getParameter("restep"));
	int relevel=Integer.parseInt(multipartReques.getParameter("relevel"));
	String pageNum=multipartReques.getParameter("pageNum");
	String pageSize=multipartReques.getParameter("pageSize");
	String search=multipartReques.getParameter("search");
	String keyword=multipartReques.getParameter("keyword");
	
	String reviewSubject=multipartReques.getParameter("reviewSubject");
	int reviewStatus=1;//전달값이 없는 경우 - 일반글
	if(multipartReques.getParameter("reviewStatus") != null) {//전달값이 있는 경우 - 비밀글
		reviewStatus=Integer.parseInt(multipartReques.getParameter("reviewStatus"));
	}
	String reviewContent=multipartReques.getParameter("reviewContent");
	//업로드 처리된 파일의 이름을 반환받아 저장 - 전달파일이 없는 경우 [null] 반환
	String reviewImage=multipartReques.getFilesystemName("reviewImage");

	//REVIEW_SEQ 시퀸스의 다음값을 검색하여 반환하는 ReviewDAO 클래스의 메소드 호출
	int nuxtNum=ReviewDAO.getDAO().selectReviewNextNum();
	
	//게시글을 작성한 클라이언트의 IP 주소를 반환받아 저장
	//requst.getRemoteAddress() : JSP 문서를 요청한 클라이언트의 IP 주소를 반환하는 메소드
	// => 이클립스에 등록된 WAS 프로그램은 기본적으로 128Bit 형식(IPV6)의 IP 주소 제공
	//32Bit(IPV4)의 IP 주소 제공받을 수 있도록 이클립스에 등록된 WAS 프로그램의 환경설정 변경
	// => Run >> Run Configurations... >> Apache Tomcat >> 사용중인 Apache Tomcat 선택
	// >> Arguments >> VM Arguments >> [-Djava.net.preferIPv4Stack=true] 추가 >> Apply 	
	String reviewIp=request.getRemoteAddr();
	System.out.println("reviewIp = "+reviewIp);
	
	
%>    


















