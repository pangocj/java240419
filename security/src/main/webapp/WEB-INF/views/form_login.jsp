<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SECURITY</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
</head>
<body>
	<h1>로그인</h1>
	<hr>
	<form action="<c:url value="/user_login"/>" method="post" id="loginForm">
	<table>
		<tr>
			<td>아이디</td>
			<td><input type="text" name="userid" id="userid"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="passwd" id="passwd"></td>
		</tr>
		<tr>
			<td colspan="2"><button type="submit">로그인</button></td>
		</tr>
	</table>
	<input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }">
	</form>
	<h3><a href="<c:url value="/"/>">메인페이지</a></h3>
	
	<script type="text/javascript">
	$("#loginForm").submit(function() {
		if($("#userid").val() == "") {
			alert("아이디를 입력해 주세요.");
			return false;
		}		
		
		if($("#passwd").val() == "") {
			alert("비밀번호를 입력해 주세요.");
			return false;
		}
	});
	</script>
</body>
</html>





