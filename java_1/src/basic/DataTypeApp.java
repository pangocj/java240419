package basic;

//자료형(DataType) : 값 또는 객체를 표현하기 위한 단어(키워드 또는 식별자)
// => 기본형(PrimitiveType) : 값을 표현하기 위한 자료형 - 키워드
// => 참조형(ReferenceType) : 객체를 표현하기 위한 자료형 - 식별자(클래스)

//기본형 : 숫자형(정수형, 실수형, 문자형)과 논리형으로 구분하며 값을 저장하기 위한 변수를 선언할 때 사용

public class DataTypeApp {
	public static void main(String[] args) {
		//정수형(IntegerType) : 소숫점이 없는 숫자값 - 정수값
		// => Java 언어는 정수값을 기본적으로 4Byte(-2147483648~2147483647)로 표현
		System.out.println("<<정수형(IntegerType)>>");
		System.out.println("정수값(10진수 100) = "+100);//정수값 : 10진수 - IntegerType
		//println() 메소드는 정수값을 무조건 10진수로 변환하여 출력 처리
		System.out.println("정수값(8진수 100) = "+0100);//0정수값 : 8진수
		System.out.println("정수값(16진수 100) = "+0x100);//0x정수값 : 16진수
		System.out.println("정수값(10진수 100) = "+100L);//정수값L : 10진수(8Byte) - LongType
		
		System.out.println("정수값 = "+2147483647);
		//4Byte로 표현할 수 없는 정수값을 사용할 경우 에러 발생
		//System.out.println("정수값 = "+2147483648);
		//4Byte로 표현할 수 없는 정수값은 LongType으로 표현하여 사용
		System.out.println("정수값 = "+2147483648L);
		
		//정수값을 표현하기 위한 자료형 - 키워드
		// => byte(1Byte), short(2Byte), int(4Byte), long(8Byte)
		byte a1=127;//1Byte : -128~127
		short a2=32767;//2Byte : -32768~32767
		int a3=2147483647;//4Byte : -2147483648~2147483647
		long a4=2147483648L;//8Byte
		
		System.out.println("a1 = "+a1);
		System.out.println("a2 = "+a2);
		System.out.println("a3 = "+a3);
		System.out.println("a4 = "+a4);
		
		//int a5=100L;//값에 대한 손실이 발생할 수 있으므로 에러 발생
		long a5=100;//자료형이 큰 변수에는 자료형이 작은 리터럴(값) 저장 가능
		System.out.println("==============================================================");
		//실수형(DoubleType) : 소숫점이 있는 숫자값 - 실수값
		// => Java 언어는 정수값을 기본적으로 8Byte로 표현 - 부동소숫점 방식으로 표현
		System.out.println("<<실수형(DoubleType)>>");
		System.out.println("실수값(4Byte) = "+12.3F);//실수값F >> 4Byte(FloatType)
		System.out.println("실수값(8Byte) = "+12.3);//실수값 >> 8Byte(DoubleType)
		//println() 메소드는 실수값이 아주 작거나 큰 경우 지수형태로 변환하여 출력
		System.out.println("실수값(8Byte) = "+0.000000000123);
		//실수값을 지수형태로 표현하여 사용 가능
		System.out.println("실수값(8Byte) = "+1.23E10);
		
		//정수값을 표현하기 위한 자료형 - float(4Byte), double(8Byte)
		float b1=1.23456789F;//가수부로 표현 가능한 크기(정밀도) : 소숫점 7자리
		double b2=1.23456789;//가수부로 표현 가능한 크기(정밀도) : 소숫점 15자리

		System.out.println("b1 = "+b1);
		System.out.println("b2 = "+b2);
		System.out.println("==============================================================");
		
	}
}




















