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
	
	
%>
















