<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 사용자로부터 로그인 처리에 필요한 인증정보(아이디와 비밀번호)를 입력받기 위한 JSP 문서 --%>
<%-- => [로그인] 태그를 클릭한 경우 [login_action.jsp] 문서를 요청하여 페이지 이동 - 입력값(인증정보) 전달 --%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>
	<%
		//request.getParameter(String name) : 매개변수로 전달받은 이름의 전달값을 반환하는 메소드
		// => 매개변수로 전달받은 이름의 전달값이 없는 경우 null 반환
		String msg=request.getParameter("msg");
		if(msg == null) {//전달값이 없는 경우
			//표현식(Expression)으로 인해 [null]이 문자열로 변환되어 출력되는 것을 방지
			msg="";
		}
	%>
	<h1>로그인</h1>
	<hr>
	<form action="login_action.jsp" method="post" name="loginForm">
	<table>
		<tr>
			<td>아이디</td>
			<td><input type="text" name="id"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="passwd"></td>
		</tr>
		<tr>
			<td colspan="2"><button type="submit">로그인</button></td>
		</tr>
	</table>	
	</form>
	<p id="message" style="color: red;"><%=msg %></p>
	
	<script type="text/javascript">
	loginForm.id.focus();
	
	loginForm.onsubmit=function() {
		if(loginForm.id.value == "") {
			document.getElementById("message").innerHTML="아이디를 입력해 주세요.";
			loginForm.id.focus();
			return false;
		}
		
		if(loginForm.passwd.value == "") {
			document.getElementById("message").innerHTML="비밀번호를 입력해 주세요.";
			loginForm.passwd.focus();
			return false;
		}
	}
	</script>
	
	
	
	
	
	
	
	
</body>
</html>