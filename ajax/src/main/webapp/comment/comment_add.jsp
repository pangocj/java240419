<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 댓글정보(작성자와 내용)를 전달받아 AJAX_COMMENT 테이블의 행으로 삽입하고 실행결과를
JSON으로 응답하는 JSP 문서  --%>    
<%
	if(request.getMethod().equals("GET")) {
		response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
		return;
	}

	request.setCharacterEncoding("utf-8");
	
	String writer= request.getParameter("writer");
	String content=request.getParameter("content");

	
%>