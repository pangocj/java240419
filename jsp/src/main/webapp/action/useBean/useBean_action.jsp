<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 전달값(회원정보)을 반환받아 내장객체의 속성값으로 저장하고 [useBean_display.jsp] 문서로 
포워드 이동하는 JSP 문서 - 클라이언트 요청에 대한 데이타 처리 기능만 제공하는 JSP 문서 --%>    
<%
	//JSP 문서를 GET 방식으로 요청한 경우 에러코드를 클라이언트에게 전달하여 응답 처리
	if(request.getMethod().equals("GET")) {//JSP 문서를 비정상적으로 요청한 경우
		response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
		return;
	}

	//POST 방식으로 요청하여 전달된 값을 읽기 위한 문자형태 변경
	request.setCharacterEncoding("utf-8");
%>
<%-- useBean 태그 : JSP 문서에 Java 객체(JavaBean)를 제공하기 위한 태그 --%>
<%-- 형식) <jsp:useBean id="식별자" class="클래스" scope="사용범위"></jsp:useBean> --%>
<%-- => 내장객체에 저장된 속성값을 객체로 반환받아 제공하거나 속성값이 없는 경우 객체를
생성하여 내장객체의 속성값으로 저장한 후 제공 --%>
<%-- id 속성 : useBean 태그에 제공되는 객체를 구분하기 위한 식별자를 속성값으로 설정 --%>
<%-- => 내장객체에 저장된 속성값에 대한 속성명으로 사용 --%>
<%-- class 속성 : useBean 태그에 제공되는 객체의 자료형(클래스)을 속성값으로 설정 --%>
<%-- scope 속성 : useBean 태그에 제공되는 객체의 사용범위를 속성값으로 설정 --%>
<%-- => page, request, session, application 중 하나를 속성값으로 설정 --%>
<%-- => scope 속성을 생략한 경우 [page] 속성값을 기본값으로 사용 --%>
<jsp:useBean id="hewon" class="xyz.itwill.bean.HewonBean" scope="request"/>
<%--
	//useBean 태그를 사용하면 HewonBean 객체를 생성하여 request 객체의 속성값으로 저장하는
	//명령과 동일한 기능을 제공
	HewonBean hewon=new HewonBean();
	request.setAttribute("hewon", hewon);
--%>


<jsp:forward page="/action/useBean/useBean_display.jsp"/>
<%-- request.getRequestDispatcher("/action/useBean/useBean_display.jsp").forward(request, response); --%>	











