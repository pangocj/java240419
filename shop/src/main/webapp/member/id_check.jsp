<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 아이디를 전달받아 MEMBER 테이블에 저장된 행의 아이디와 비교해 중복결과를 HTML 문서에
포함하여 응답하는 JSP 문서 --%>
<%-- => 아이디 미중복 : 아이디 사용 가능 메세지를 출력하고 [아이디 사용] 태그를 클릭하면
부모 브라우저의 아이디 입력태그의 입력값으로 아이디를 출력 후 브라우저 종료 --%>
<%-- => 아이디 중복 : 아이디 사용 불가능 메세지를 출력하고 새로운 아이디를 입력받아 현재 
실행중인 JSP 문서(id_check.jsp) 문서를 다시 요청 - 입력값(아이디) 전달 --%>    
<%
	//전달값을 반환받아 저장
	String id=request.getParameter("id");

	if(id == null) {//전달값이 없는 경우 - 비정상적인 요청
		response.sendRedirect(request.getContextPath()+"/error/error_400.jsp");
		return;
	}
	
	//아이디를 전달받아 MEMBER 테이블에 저장된 하나의 행을 검색하여 검색된 회원정보를 반환하는
	//MemberDAO 클래스의 메소드 호출
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>