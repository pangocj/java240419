<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- Ajax 엔진을 사용해 [books_two.jsp] 문서를 요청하여 실행결과를 XML로 제공받아
태그를 변경하여 응답하는 JSP 문서 - jQuery 라이브러리를 사용해 AJAX 기능 구현 --%>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AJAX</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
</head>
<body>
	<h1>jQuery AJAX</h1>
	<hr>
	<div id="bookList"></div>
	
	<script type="text/javascript">
	$.ajax({
		type: "get",
		url: "books_two.jsp",
		dataType: "xml",
		success: function(xmlDoc) {
			
		},
		error: function(xhr) {
			alert("에러코드 = "+xhr.status);
		}
	});
	</script>
</body>
</html>













