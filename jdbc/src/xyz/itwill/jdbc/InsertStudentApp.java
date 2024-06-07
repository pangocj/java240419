package xyz.itwill.jdbc;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

import oracle.jdbc.driver.OracleDriver;

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
//3.프로젝트 폴더에 저장된 라이브러리 파일을 프로젝트에 연결하여 프로그램 작성시 사용 가능
//하도록 빌드(Build) 처리
// => 라이브러리 파일에 작성된 인터페이스 또는 클래스를 프로그램에서 사용할 수 있도록 설정
// => 프로젝트 >> 마우스 오른쪽 버튼 >> Properties >> 속성창 >> Java Build Path >> Libraries
//    >> classpath >> Add Jars >> 파일 선택창 >> 프로젝트 폴더의 Jar 파일 선택 >> OK >> Apply And Close

//STUDENT 테이블 : 학생정보를 저장하기 위한 테이블
// => 학번(숫자형 - PK), 이름(문자형), 전화번호(문자형), 주소(문자형), 생년월일(날짜형)
//CREATE TABLE STUDENT(NO NUMBER(4) PRIMARY KEY,NAME VARCHAR2(50),PHONE VARCHAR2(20)
//	,ADDRESS VARCHAR2(100),BIRTHDAY DATE);

//STUDENT 테이블에 행(학생정보)을 삽입하여 저장하는 JDBC 프로그램 작성
public class InsertStudentApp {
	public static void main(String[] args) {
		try {
			/*
			//1.OracleDriver 클래스를 객체로 생성하여 DriverManager 클래스에 JDBC Driver 객체로 등록
			// => 동일한 Driver 클래스로 생성된 다수의 객체가 DriverManager 클래스에 JDBC Driver 객체로 등록 가능
			// => 불필요한 자원이 존재해 프로그램 성능 저하 
			//OracleDriver 클래스 : Oracle DBMS 서버에 접속할 수 있는 기능을 제공하는 Driver 객체를 
			//생성하기 위한 클래스
			//Driver 객체 : DBMS 서버에 접속할 수 있는 기능을 제공하기 위한 객체
			//DriverManager 클래스 : Driver 객체를 관리하기 위한 기능을 제공하는 클래스
			//DriverManager.registerDriver(Driver driver) : 매개변수로 전달받은 Driver 객체를
			//DriverManager 클래스가 관리할 수 있는 JDBC Driver 객체로 등록하는 정적메소드 
			DriverManager.registerDriver(new OracleDriver());
			
			//DriverManager 클래스가 관리하는 Driver 객체를 반환받아 출력 처리
			Enumeration<Driver> drivers=DriverManager.getDrivers();
			while (drivers.hasMoreElements()) {
				Driver driver = (Driver) drivers.nextElement();
				System.out.println(driver);
			}
			*/
			
			//1.Class.forName(String className) 메소드를 호출하여 OracleDriver 클래스를 
			//제공받아 Class 객체로 생성해 메모리에 저장
			// => OracleDriver 클래스의 정적영역에서 OracleDriver 클래스를 객체로 생성하여 
			//DriverManager 클래스에 JDBC Driver 객체로 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");			

			/*
			Enumeration<Driver> drivers=DriverManager.getDrivers();
			while (drivers.hasMoreElements()) {
				Driver driver = (Driver) drivers.nextElement();
				System.out.println(driver);
			}
			*/
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("OracleDriver 클래스를 찾을 수 없습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
















