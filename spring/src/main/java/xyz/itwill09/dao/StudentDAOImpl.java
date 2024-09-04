package xyz.itwill09.dao;

//DAO 클래스(Repository 클래스) : 저장매체에 행을 삽입하고 저장된 행을 변경, 삭제, 검색하는
//기능을 제공하기 위한 클래스
// => DAO 클래스가 교체돼도 의존관계로 설정된 Service 클래스에 영향을 최소화 하기 위해
//인터페이스를 상속받아 작성하는 것을 권장 - 유지보수의 효율성 증가

//DBMS 서버를 저장매체로 사용하여 SQL 명령을 전달하여 행의 삽입, 변경, 삭제, 검색 처리
// => DAO 클래스의 메소드는 DBMS 서버에 접속해 하나의 SQL 명령을 전달하여 실행하고 실행결과를
//Java 객체(값)으로 반환되도록 작성 - JDBC

//SpringMVC 기능으로 웹프로그램 작성시 Mybatis 프레임워크를 사용해 DAO 클래스를 작성하는 방법
//1.DataSource 관련 라이브러리와 Mybatis 관련 라이브러리를 프로젝트에 빌드 처리 - 메이븐 : pom.xml
// => ojdbc, spring-jdbc(spring-tx), mybatis, mybatis-spring
//2.Mybatis 프레임워크의 환경설정파일(mybatis-config.xml - settings 엘리먼트) 작성
// => [src/main/webapp] 폴더에 환경설정파일을 작성해야 스프링 컨테이너(WebApplicationContext 객체)가
//환경설정파일을 제공받아 SqlSessionFactory 객체 생성 가능

public class StudentDAOImpl {

}
