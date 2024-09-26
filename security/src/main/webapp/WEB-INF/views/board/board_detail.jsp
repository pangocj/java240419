<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SECURITY</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<style type="text/css">
table {
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	border: 1px solid black;
	text-align: center;
	padding: 5px;	
}
</style>
</head>
<body>
	<h1>게시글</h1>
	<hr>
	<table>
		<tr>
			<td width="200">글번호</td>
			<td width="500">${securityBoard.num }</td>
		</tr>
		<tr>
			<td width="200">작성자</td>
			<td width="500">${securityBoard.writer }</td>
		</tr>
		<tr>
			<td width="200">제목</td>
			<td width="500" style="text-align: left;">${securityBoard.subject }</td>
		</tr>
		<tr>
			<td width="200">내용</td>
			<td width="500" style="font-size: 16px; text-align: left;">
				<pre>${securityBoard.content }</pre>
			</td>
		</tr>
		<tr>
			<td width="200">작성일</td>
			<td width="500">${securityBoard.regdate }</td>
		</tr>
	</table>
	
	<div style="margin-top: 10px;">
		<form method="get" id="linkForm">
			<input type="hidden" name="num" value="${securityBoard.num }">
			<%-- 권한 설정을 위해 게시글 작성자 전달 --%>
			<input type="hidden" name="writer" value="${securityBoard.writer }">
			<input type="hidden" name="pageNum" value="${searchMap.pageNum }">
			<input type="hidden" name="pageSize" value="${searchMap.pageSize }">
			<input type="hidden" name="column" value="${searchMap.column }">
			<input type="hidden" name="keyword" value="${searchMap.keyword }">
			
			<button type="button" id="listBtn">글목록</button>
			<sec:authorize access="isAuthenticated()">
				<%-- authorize 태그의 access 속성값으로 설정된 권한이 있는 경우 var 속성값으로 
				작성된 Scope 속성명에 [true] 저장 --%>
				<sec:authorize access="hasRole('ROLE_ADMIN')" var="adminRole"/>
				<%-- authentication 태그로 인증된 사용자 정보를 제공받아 var 속성값으로 작성된
				Scope 속성명에 인증된 사용자 정보 저장 --%>
				<sec:authentication property="principal" var="pinfo"/>
			
				<c:if test="${adminRole || pinfo.userid eq securityBoard.writer }">
					<button type="button" id="modifyBtn">글변경</button>
					<button type="button" id="removeBtn">글삭제</button>
				</c:if>
			</sec:authorize>
		</form>
	</div>
	
	<script type="text/javascript">
	$("#listBtn").click(function() {
		$("#linkForm").attr("action","<c:url value="/board/list"/>").submit();
	});
	
	$("#modifyBtn").click(function() {
		$("#linkForm").attr("action","<c:url value="/board/modify"/>").submit();
	});
		
	$("#removeBtn").click(function() {
		$("#linkForm").attr("action","<c:url value="/board/rmeove"/>").submit();
	});
	</script>
</body>
</html>












