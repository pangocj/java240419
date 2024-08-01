<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 인증정보를 전달받아 USERINFO 테이블에 저장된 회원정보와 비교하여 인증 처리하고
[user_login.jsp] 문서를 요청할 수 있는 URL 주소로 응답하는 JSP 문서 --%>    
<%
	if(request.getMethod().equals("GET")) {
		response.sendRedirect("user_error.jsp");
		return;
	}
%>