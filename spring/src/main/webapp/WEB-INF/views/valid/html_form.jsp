<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SPRING</title>
</head>
<body>
	<h1>사원등록</h1>
	<hr>
	<c:url value="/valid/html" var="url"/>
	<form action="${url }" method="post" id="registerForm">
	<table>
		<tr>
			<td>아이디</td>
			<td>
				<input type="text" name="id" id="id">
				<span id="idMsg" class="error"></span>
			</td>	
		</tr>
		<tr>
			<td>비밀번호</td>
			<td>
				<input type="password" name="passwd" id="passwd">
				<span id="passwdMsg" class="error"></span>
			</td>	
		</tr>
		<tr>
			<td>이름</td>
			<td>
				<input type="text" name="name" id="name">
				<span id="nameMsg" class="error"></span>
			</td>	
		</tr>
		<tr>
			<td>이메일</td>
			<td>
				<input type="text" name="email" id="email">
				<span id="emailMsg" class="error"></span>
			</td>	
		</tr>
		<tr>
			<td>성별</td>
			<td>
				남자<input type="radio" name="gender" class="gender" value="남자">&nbsp;&nbsp;
				여자<input type="radio" name="gender" class="gender" value="여자">
				<span id="genderMsg" class="error"></span>
			</td>	
		</tr>
		<tr>
			<td colspan="2">
				<button type="submit">등록</button>
			</td>	
		</tr>
	</table>
	</form>
</body>
</html>