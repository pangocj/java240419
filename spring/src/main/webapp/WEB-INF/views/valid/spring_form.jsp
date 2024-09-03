<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SPRING</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<style type="text/css">
.error { color: red; }
</style>
</head>
<body>
	<h1>사원등록</h1>
	<hr>
	<c:url value="/valid/spring" var="url"/>
	<%-- Spring form 태그 : 페이지를 요청하여 입력값을 전달하는 태그 --%>
	<%-- modelAttribute 속성(필수) : 요청 처리 메소드의 매개변수에 저장된 Command 객체의 
	속성명을 속성값으로 설정 --%>
	<%-- => 전달값에 대한 검증 실패시 전달값이 저장된 Command 객체를 제공받아 입력태그의 
	입력값으로 사용 --%>
	<form:form action="${url }" method="post" id="registerForm" modelAttribute="employee">
	<table>
		<tr>
			<td>아이디</td>
			<td>
				<%-- Spring input 태그 : 문자열을 입력받기 위한 태그 --%>
				<%-- => HTML input 태그의 type 속성값을 [text]로 설정한 것과 동일한 태그 --%>
				<%-- path 속성 : 입력값을 전달하기 위한 이름을 속성값으로 설정 --%>
				<%-- => HTML input 태그의 name 속성과 id 속성을 설정하는 것과 동일 --%>
				<%-- => 입력값에 대한 검증 실패시 value 속성으로 Command 객체의 필드값을 제공받아 사용 --%>
				<form:input path="id"/>
				<%-- Spring errors 태그 : 요청 처리 메소드로부터 제공 받은 에러메세지를 출력하기 위한 태그 --%>
				<%-- path 속성 : 에러메세지를 제공받아 출력하기 위한 식별자(전달값의 이름)를 속성값으로 설정 --%>
				<%-- cssClass 속성 : CSS 스타일의 클래스 선택자를 속성값으로 설정 - HTML 태그의 class 속성과 동일 --%>
				<%-- delimiter 속성 : 다수의 에러메세지가 전달된 경우 에러메세지를 구분하기 위한
				문자를 속성값으로 설정 --%>
				<form:errors path="id" cssClass="error" delimiter=" "/>
				<span id="idMsg" class="error"></span>
			</td>
		</tr>
	</table>
	</form:form>
</body>
</html>









