package inheritance;

public class CarApp {
	public static void main(String[] args) {
		Car car=new Car("싼타페", "홍길동");
		
		System.out.println("모델명 = "+car.getModelName());
		System.out.println("소유자 = "+car.getUserName());
		System.out.println("==============================================================");
		//Object.toString() : 참조변수에 저장된 객체를 참조하여 "클래스@메모리주소" 형식의
		//문자열을 반환하는 메소드
		//System.out.println("car.toString() = "+car.toString());
		//참조변수를 출력할 경우 자동으로 Object 객체를 참조하여 Object 클래스의 toString()
		//메소드 자동 호출 - toString() 호출 생략 가능
		System.out.println("car = "+car); 
		System.out.println("==============================================================");
		
	}
}
