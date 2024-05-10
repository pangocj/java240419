package xyz.itwill.lang;

//Wrapper 클래스 : 원시형(기본형)을 클래스로 포괄적으로 표현하기 위해 사용하는 이름
// => Byte, Short, Integer, Long, Character, Float, Double, Boolean
// => 원시형 대신 Wrapper 클래스로 객체를 생성하여 프로그램 작성

public class WrapperApp {
	public static void main(String[] args) {
		/*
		int num1=100, num2=200;
		int num3=num1+num2;
		System.out.println("합계 = "+num3);
		*/
		
		//Integer 클래스 : 정수값이 저장된 객체를 생성하기 위한 클래스 
		//Integer num1=new Integer(100);//생성자를 사용하여 객체 생성 비권장
		//Integer.valueOf(int i) : 매개변수로 전달받은 정수값이 저장된 Integer 객체로 반환하는 정적메소드
		Integer num1=Integer.valueOf(100);
		//Integer.valueOf(Object o) : 매개변수로 전달받은 객체를 정수값으로 변환해 정수값이 
		//저장된 Integer 객체로 반환하는 정적메소드
		Integer num2=Integer.valueOf("200");
		
		
	}
}
