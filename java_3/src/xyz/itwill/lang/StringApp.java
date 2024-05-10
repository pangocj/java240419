package xyz.itwill.lang;

//String 클래스 : 문자열이 저장된 객체를 생성하기 위한 클래스
// => String 객체에 저장된 문자열은 내부적으로 byte 배열로 처리 
// => byte 배열 요소에 문자를 하나씩 저장하고 있어 첨자로 문자 처리 가능
public class StringApp {
	public static void main(String[] args) {
		//문자열은 " " 기호를 사용하여 리터럴(값)로 표현하면 자동으로 " " 기호의 문자열이
		//저장된 String 객체를 생성하여 제공 
		// => 힙영역(HeapArea)이 아닌 메소드영역(MethodArea)에 String 객체 생성 - 상수객체
		// => 메소드영역에는 같은 문자열이 저장된 String 객체(상수객체) 생성 불가
		String str1="ABC";
		
		//String.toString() : String 객체에 저장된 문자열을 반환하는 메소드
		// => String 객체가 저장된 참조변수를 출력할 경우 자동으로 toString 메소드 호출
		//System.out.println("str1.toString() = "+str1.toString());
		System.out.println("str1 = "+str1);
		System.out.println("==============================================================");
		//메소드영역에 생성된 기본 String 객체를 제공받아 참조변수에 저장
		String str2="ABC";
		
		//참조변수를 비교연산자로 비교하면 참조변수에 저장된 메모리주소를 비교하여 결과 제공
		if(str1 == str2) {
			System.out.println("str1 변수와 str2 변수에 저장된 객체의 메모리주소가 같습니다.");
		} else {
			System.out.println("str1 변수와 str2 변수에 저장된 객체의 메모리주소가 다릅니다.");
		}
		System.out.println("==============================================================");
		//new 연산자로 String 클래스의 생성자를 호출하여 String 객체를 생성하여 String 객체는
		//힙영역에 생성
		String str3=new String("ABC");
		
		if(str1 == str3) {
			System.out.println("str1 변수와 str3 변수에 저장된 객체의 메모리주소가 같습니다.");
		} else {
			System.out.println("str1 변수와 str3 변수에 저장된 객체의 메모리주소가 다릅니다.");
		}
		System.out.println("==============================================================");
		//String.equals(String s) : String 객체에 저장된 문자열과 매개변수로 전달받은 String
		//객체의 문자열을 비교하여 다른 경우 [false]를 반환하여 같은 경우 [true]를 반환하는 메소드
		// => 비교 문자열이 영문자인 경우 대소문자를 구분하여 비교
		if(str1.equals(str3)) {
			System.out.println("str1 변수와 str3 변수에 참조하는 String 객체에 저장된 문자열이 같습니다.");
		} else {
			System.out.println("str1 변수와 str3 변수에 참조하는 String 객체에 저장된 문자열이 다릅니다.");
		}
		System.out.println("==============================================================");
		String str4="abc";
		
		if(str1.equals(str4)) {
			System.out.println("str1 변수와 str4 변수에 참조하는 String 객체에 저장된 문자열이 같습니다.");
		} else {
			System.out.println("str1 변수와 str4 변수에 참조하는 String 객체에 저장된 문자열이 다릅니다.");
		}
		System.out.println("==============================================================");
		//String.equalsIgnoreCase(String s) : equals() 메소드와 동일한 기능을 제공하지만
		//대소문자를 구분하지 않고 비교
		if(str1.equalsIgnoreCase(str4)) {
			System.out.println("str1 변수와 str4 변수에 참조하는 String 객체에 저장된 문자열이 같습니다.");
		} else {
			System.out.println("str1 변수와 str4 변수에 참조하는 String 객체에 저장된 문자열이 다릅니다.");
		}
		System.out.println("==============================================================");
		//String.compareTo(String s) : String 객체에 저장된 문자열과 매개변수로 전달받은 
		//String 객체의 문자열을 비교하여 String 객체에 저장된 문자열이 크면 [양수]를 반환하고
		//작으면 [음수]를 반환하며 같은 경우 [0]를 반환하는 메소드
		// => 비교 문자열이 영문자인 경우 대소문자를 구분하여 비교
		if(str1.compareTo(str4) > 0) {
			System.out.println("str1 변수가 참조하는 String 객체의 문자열이 str4 변수가 참조하는 String 객체의 문자열보다 큽니다.");
		} else if(str1.compareTo(str4) < 0) {
			System.out.println("str1 변수가 참조하는 String 객체의 문자열이 str4 변수가 참조하는 String 객체의 문자열보다 작습니다.");
		} else {
			System.out.println("str1 변수가 참조하는 String 객체의 문자열이 str4 변수가 참조하는 String 객체의 문자열과 같습니다.");
		}
		System.out.println("==============================================================");
		//String.getBytes() : String 객체에 저장된 문자열을 byte 배열로 변환하여 반환하는 메소드
		// => byte 배열의 요소에는 문자열을 구성한 문자의 코드값이 차례대로 저장 
		byte[] byteArray=str1.getBytes();
		
		for(byte character : byteArray) {
			System.out.print((char)character);
		}
		System.out.println();
		System.out.println("==============================================================");
		//String 클래스의 생성자 매개변수에 byte 배열을 전달하여 String 객체 생성
		String str5=new String(new byte[] {'A','B','C','D','E','F','G'});
		System.out.println("str5 = "+str5);
		
		//String.length() : String 객체에 저장된 문자열의 문자 갯수를 반환하는 메소드
		System.out.println("문자열의 문자 갯수 = "+str5.length());
		System.out.println("==============================================================");
		
		
		
	}
}












