<%@page import="xyz.itwill.dao.ReviewDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- REVIEW 테이블에 저장된 행을 검색하여 검색된 행을 HTML 태그에 포함해 응답하는 JSP 문서 --%>
<%-- => REVIEW 테이블에 저장된 행을 페이지 단위로 구분하여 검색해 응답 처리 - 페이징 처리 --%>
<%-- => [페이지번호] 태그를 클릭한 경우 [/review/review_list.jsp] 문서를 요청하여 페이지 이동 
- 페이지번호, 게시글갯수, 조회대상, 조회단어 전달 : 조회기능을 유지하기 위해 조회대상과 조회단어 전달 --%>
<%-- => [게시글갯수] 태그의 입력값을 변경한 경우 [/review/review_list.jsp] 문서를 요청하여 페이지 이동    
- 페이지번호, 게시글갯수, 조회대상, 조회단어 전달 --%>
<%-- => [검색]태그를 클릭한 경우 [/review/review_list.jsp] 문서를 요청하여 페이지 이동
- 조회대상, 조회단어 전달 : 페이지번호와 게시글갯수는 기본값 사용 --%>
<%-- => [글쓰기] 태그를 클릭한 경우 [/review/review_write.jsp] 문서를 요청하여 페이지 이동 
- 로그인 사용자에게만 태그를 출력하여 링크가 제공되도록 작성 --%>
<%-- 게시글의 [글제목]을 클릭한 경우 [/review/review_detail.jsp] 문서를 요청하여 페이지 이동
- 글번호, 페이지번호, 게시글갯수, 조회대상, 조회단어 전달 --%>
<%
	//게시글 조회기능에 필요한 전달값(조회대상과 조회단어)을 반환받아 저장
	String search=request.getParameter("search");//조회대상
	if(search == null) {//전달값이 없는 경우 - 조회기능을 사용하지 않은 경우
		search="";
	}
	
	String keyword=request.getParameter("keyword");//조회단어
	if(keyword == null) {
		keyword="";
	}
	
	//페이징 처리에 필요한 전달값(페이지번호와 게시글갯수)을 반환받아 저장
	int pageNum=1;//페이지번호 - 전달값이 없는 경우 사용할 기본값 저장
	if(request.getParameter("pageNum") != null) {//전달값이 있는 경우
		pageNum=Integer.parseInt(request.getParameter("pageNum"));
	}
	
	int pageSize=10;//게시글갯수 - 전달값이 없는 경우 사용할 기본값 저장
	if(request.getParameter("pageSize") != null) {//전달값이 있는 경우
		pageSize=Integer.parseInt(request.getParameter("pageSize"));
	}
	
	//조회정보(조회대상과 조회단어)를 전달받아 REVIEW 테이블에 저장된 행에서 조회정보가 포함된 
	//행의 갯수를 검색하여 반환하는 RviewDAO 클래스의 메소드 호출
	int totalReview=ReviewDAO.getDAO().selectTotalReview(search, keyword);//게시글의 총갯수
	        	
	//페이지의 총갯수를 계산하여 저장
	//int totalPage=totalReview/pageSize+totalReview%pageSize==0?0:1;
	int totalPage=(int)Math.ceil((double)totalReview/pageSize);
	
	//전달받은 페이지번호가 비상적인 경우 첫번째 페이지를 요청할 수 있는 기본값 저장
	if(pageNum <= 0 || pageNum > totalPage) {
		pageNum=1;
	}
	
	//페이지번호에 대한 게시글의 시작 행번호를 계산하여 저장
	//ex) 1Page : 1, 2Page : 11, 3Page : 21, 4Page : 31, ...
	int startRow=(pageNum-1)*pageSize+1;

	//페이지번호에 대한 게시글의 종료 행번호를 계산하여 저장
	//ex) 1Page : 10, 2Page : 20, 3Page : 30, 4Page : 40, ...
	int endRow=pageNum*pageSize;

	//마지막 페이지의 게시글의 종료 행번호가 게시글의 총갯수보다 많은 경우 종료 행변호 변경
	if(endRow > totalReview) {
		endRow=totalReview;
	}

	//페이징 관련 정보(시작행번호, 종료행번호)와 게시글 조회기능 관련 정보(조회대상과 조회단어)를
	//전달받아 REVIEW 테이블에 저장된 행에서 조회정보가 포함된 행을 페이징 처리로 검색하여
	//List 객체를 반환하는 ReviewDAO 클래스의 메소드 호출
	
	
%>                   
<style type="text/css">
#review_list {
	width: 1000px;
	margin: 0 auto;
	text-align: center;
}

#review_title {
	font-size: 1.2em;
	font-weight: bold;
}

table {
	margin: 5px auto;
	border: 1px solid black;
	border-collapse: collapse;
}

th {
	border: 1px solid black;
	background: black;
	color: white;
}

td {
	border: 1px solid black;
	text-align: center;	
}

.subject {
	text-align: left;
	padding: 5px;
	white-space: nowrap;
	overflow: hidden;
	text-overflow: ellipsis;
}

#review_list a:hover {
	text-decoration: none; 
	color: blue;
	font-weight: bold;
}

.subject_hidden {
	background: black;
	color: white;
	font-size: 14px;
	border: 1px solid black;
	border-radius: 4px;
}

#page_list {
	font-size: 1.1em;
	margin: 10px;
}

#page_list a:hover {
	font-size: 1.3em;
}
</style>

<h1>제품후기</h1>
<div id="review_list">
	<div id="review_title">제품후기목록(1)</div>
	
	<div style="text-align: right;">
		게시글갯수 : 
		<select id="pageSize">
			<option value="10">&nbsp;10개&nbsp;</option>	
			<option value="20">&nbsp;20개&nbsp;</option>	
			<option value="50">&nbsp;50개&nbsp;</option>	
			<option value="100">&nbsp;100개&nbsp;</option>	
		</select>
		&nbsp;&nbsp;&nbsp;
		<button type="button" id="writeBtn">글쓰기</button>
	</div>
	
	<table>
		<tr>
			<th width="100">글번호</th>
			<th width="500">제목</th>
			<th width="100">작성자</th>
			<th width="100">조회수</th>
			<th width="200">작성일</th>
		</tr>
		
		<tr>
			<td>1</td>
			<td class="subject">테스트</td>
			<td>홍길동</td>
			<td>10</td>
			<td>2024-07-14</td>		
		</tr>
	</table>
	
	
	<div id="page_list">
		[1]
	</div>
	
	<form action="#" method="post">
		<select name="search">
			<option value="member_name">&nbsp;작성자&nbsp;</option>
			<option value="review_subject">&nbsp;제목&nbsp;</option>
			<option value="review_content">&nbsp;내용&nbsp;</option>
		</select>
		<input type="text" name="keyword">
		<button type="submit">검색</button>
	</form>
</div>















