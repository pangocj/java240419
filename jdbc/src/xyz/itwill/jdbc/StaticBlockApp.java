package xyz.itwill.jdbc;

public class StaticBlockApp {
	public static void main(String[] args) {
		//1.JVM은 ClassLoader 프로그램을 실행하여 Class 파일(XXX.class)을 읽어 메모리의  
		//Method 영역에 Class 객체(Clazz)로 생성
		//2.new 연산자로 클래스(Class 객체)의 생성자를 호출해 객체 생성 
		// => 객체는 메모리의 Head 영역에 생성 
		//3.참조변수를 만들어 생성된 객체의 메모리 주소를 저장
		// => 참조변수는 메모리의 Static 영역에 생성 
		StaticBlock sb=new StaticBlock();
		
		//참조변수에 저장된 메모리 주소로 객체를 참조하여 메소드 호출
		sb.display();
	}
}
