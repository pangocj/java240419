<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String headerFilePage="/action/include/header.jspf";
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
<style type="text/css">
div {
	margin: 5px;
	padding: 5px;
}

#header {
	height: 200px;
	border: 1px solid red;
}	

#header h1 {
	text-align: center;
}

#menu {
	font-size: 1.5em;
	text-align: right;
}

#menu a, #menu a:visited {
	text-decoration: none;
	color: black;
}

#menu a:hover {
	color: orange;
}

#content {
	min-height: 500px;
	border: 1px solid green;
	text-align: center;
}

#footer {
	height: 150px;
	border: 1px solid blue;
	text-align: center;
	font-size: 1.2em;
}
</style>
</head>
<body>
	<%-- 머릿부 : 로고, 메뉴 등 --%>
	<div id="header">
		<%-- 
		<h1><a href="<%=request.getContextPath()%>/action/include/index.jsp">쇼핑몰</a></h1>
		<div id="menu">
			<a href="<%=request.getContextPath()%>/action/include/index.jsp?worker=login">로그인</a>&nbsp;&nbsp;
			<a href="<%=request.getContextPath()%>/action/include/index.jsp?worker=join">회원가입</a>&nbsp;&nbsp;
			<a href="<%=request.getContextPath()%>/action/include/index.jsp?worker=cart">장바구니</a>&nbsp;&nbsp;
			<a href="<%=request.getContextPath()%>/action/include/index.jsp?worker=review">제품후기</a>&nbsp;&nbsp;
		</div>
		--%>
		
		<%-- include Directive : 문서파일(JSPF)의 소스코드를 JSP 문서에 포함하는 지시어 --%>
		<%-- => CSL(HTML, CSS, JavaScript) 및 SSL(Java - Script Element)로 작성된 코드를 JSP 문서에 포함 --%>
		<%-- => 문서파일의 소스코드를 JSP 문서에 그대로 포함하여 사용 - 정적포함 --%>
		<%-- JSP 문서를 요청한 경우 include Directive의 file 속성값으로 설정된 문서파일의
		코드를 JSP 문서에 포함하여 실행한 후 실행결과를 HTML 문서로 생성하여 응답 처리 --%>
		<%-- => include Directive의 file 속성값으로 설정된 문서파일이 변경된 경우 JSP 문서가
		변경된 경우 동일하므로 JSP 문서 요청시 서블릿 클래스를 새로 변환하여 실행 처리 --%>
		<%--  include Directive의 file 속성값으로 표현식(Expression) 사용 불가능 --%>
		<%-- <%@include file="/action/include/header.jspf" %> --%>
		<%-- <%@include file="<%=headerFilePage %>" %> --%>
		
		
	</div>
	
	<%-- 몸체부 : 요청에 대한 실행 결과 --%>
	<div id="content">
		<h2>메인 페이지 - 제품 목록 출력</h2>
	</div>
	
	<%-- 꼬릿부 : 저작권, 약관, 개인정보 보호정책 등 --%>
	<div id="footer">
		<p>Copyright ⓒ Itwill Corp. All rights reserved</p>
		<p>관리자 : 홍길동(abc@itwill.xyz)</p>
	</div>
</body>
</html>