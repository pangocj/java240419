package xyz.itwill.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Statement 객체 : DBMS 서버에 SQL 명령을 전달하여 실행하기 위한 기능을 제공하는 객체
public class StatementApp {
	public static void main(String[] args) throws NumberFormatException, IOException, SQLException {
		//키보드로 학생정보를 입력받아 STUDENT 테이블에 행으로 삽입하여 저장하고 STUDENT 테이블에
		//저장된 모든 행(학생정보)을 검색하여 출력하는 JDBC 프로그램 작성
		
		//키보드로 학생정보를 입력받기 위한 입력스트림 생성
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
				
		//키보드로 학생정보를 입력받아 저장
		System.out.println("<<학생정보 입력>>");
		System.out.print("학번 입력 >> ");
		//키보드로 입력받아 반환된 문자열을 정수값으로 변환하여 저장
		int no=Integer.parseInt(in.readLine());
		System.out.print("이름 입력 >> ");
		String name=in.readLine();
		System.out.print("전화번호 입력 >> ");
		String phone=in.readLine();
		System.out.print("주소 입력 >> ");
		String address=in.readLine();
		System.out.print("생년월일 입력 >> ");
		String birthday=in.readLine();
		System.out.println("==============================================================");
		//키보드로 입력받은 학생정보를 STUDENT 테이블에 행으로 삽입하여 저장
		Connection con=ConnectionFactory.getConnection();
		
		Statement stmt=con.createStatement();
		
		//SQL 명령 작성시 Java 변수값을 사용하기 위해 문자열 결합 기능 사용
		String sql1="insert into student values("+no+",'"+name+"','"
				+phone+"','"+address+"','"+birthday+"')";
		int rows=stmt.executeUpdate(sql1);
		
		System.out.println(rows+"명의 학생정보를 삽입하여 저장 하였습니다.");
		System.out.println("==============================================================");
		//STUDENT 테이블에 저장된 모든 행(학생정보)을 검색하여 출력
		String sql2="select no,name,phone,address,birthday from student order by no";
		ResultSet rs=stmt.executeQuery(sql2);
		
		System.out.println("<<학생정보 출력>>");
		while(rs.next()) {
			System.out.println("학번 = "+rs.getInt("no")+", 이름 = "+rs.getString("name")
				+", 전화번호 = "+rs.getString("phone")+", 주소 = "+rs.getString("address")
				+", 생년월일 = "+rs.getString("birthday").substring(0, 10));
		}
		System.out.println("==============================================================");
		ConnectionFactory.close(con, stmt, rs);
	}
}












