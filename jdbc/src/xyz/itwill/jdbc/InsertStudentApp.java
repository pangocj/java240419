package xyz.itwill.jdbc;

//JDBC(Java DataBase Connectivity) : Java를 사용하여 DBMS 서버에 접속해 SQL 명령을 전달하여  
//실행하기 위한 기능을 제공하는 Java API(인터페이스 또는 클래스)

//java.sql : JDBC 프로그램을 작성하기 위한 Java 자료형이 선언된 패키지
// => java.sql 패키지에는 JDBC 기능을 제공하기 위한 인터페이스 제공
// => DBMS 종료가 다양하므로 JDK 라이브러리(jrt-fs.jar)에 JDBC 기능의 클래스 제공 불가능
// => DBMS를 개발하여 관리하는 그룹에서 JDBC 기능의 클래스(JDBC Driver)를 만들어 배포하므로
//JDBC Driver 관련 라이브러리 파일를 다운로드 받아 프로젝트에 빌드 처리

//Oracle DBMS 서버를 사용한 JDBC 프로그램을 작성하기 위해 Oracle JDBC Driver 관련 라이브러리
//파일을 다운로드 받아 프로젝트에 빌드 처리
//1.https://www.oracle.com 사이트에서 Oracle JDBC Driver 관련 라이브러리 파일 다운로드
// => Oracle JDBC Driver 관련 라이브러리 파일 : ojdbc11.jar - JDK 버전 참조
//2.Oracle JDBC Driver 관련 라이브러리 파일(ojdbc11.jar)을 프로젝트 폴더에 복사하여 붙여놓기

//STUDENT 테이블에 행(학생정보)을 삽입하여 저장하는 JDBC 프로그램 작성
public class InsertStudentApp {

}
