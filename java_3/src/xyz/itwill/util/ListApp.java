package xyz.itwill.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//List 인터페이스를 상속받은 콜렉션 클래스 - ArrayList 클래스, Vector 클래스, LinkedList 등
// => List 객체는 객체(값)를 저장한 요소의 순서가 있으며 요소에 동일한 객체 저장 가능
// => List 객체는 첨자로 요소를 구분해 사용 가능
// => List 객체에 저장된 요소값(객체)가 많은 경우 검색속도가 느린 단점 존재
public class ListApp {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		//List.add(E element) : 매개변수로 전달받은 객체를 List 객체의 요소에 추가하여 저장하는 메소드
		// => List 객체의 요소에 차례대로 요소값(객체)이 저장
		list.add("홍길동");
		list.add("임꺽정");
		list.add("전우치");
		
		//List.toString() : List 객체에 저장된 모든 요소값(객체)를 문자열로 반환하는 메소드
		System.out.println("list = "+list);
		System.out.println("==============================================================");
		list.add("임꺽정");
		System.out.println("list = "+list);
		System.out.println("==============================================================");
		//List.size() : List 객체에 저장된 요소값의 갯수를 반환하는 메소드
		System.out.println("List 객체에 저장된 요소값의 갯수 = "+list.size());
		System.out.println("==============================================================");
		//List.get(int index) : List 객체에 저장된 요소값 중 매개변수로 전달받은 첨자 위치의
		//요소값(객체)을 반환하는 메소드
		// => 매개변수로 전달받은 첨자가 List 객체의 요소값을 구분하는 첨자의 범위를 벗어난
		//경우 IndexOutOfBoundsException 발생
		System.out.println("3번째 사용자의 이름 = "+list.get(2));
		//System.out.println("10번째 사용자의 이름 = "+list.get(9));
		System.out.println("==============================================================");
		//List.add(int index, E element) : List 객체에 매개변수로 전달받은 첨자 위치에
		//요소값(객체)을 삽입하여 저장하기 위한 메소드
		list.add(3, "일지매");
		System.out.println("list = "+list);
		System.out.println("==============================================================");
		//List.remove(E element) : List 객체에서 매개변수로 전달받은 객체의 요소값을 삭제하는 메소드
		// => List 객체에 저장된 요소값이 VO 클래스로 생성된 객체인 경우에만 사용 가능
		// => List 객체에 동일한 객체에 여러개 저장되어 있는 경우 첫번째 요소값만 삭제
		//list.remove("임꺽정");
		
		//List.remove(int index) : List 객체에서 매개변수로 전달받은 첨자 위치의 요소값을 삭제하는 메소드
		list.remove(4);
		System.out.println("list = "+list);
		System.out.println("==============================================================");
		//List.set(int index, E element) : List 객체에 저장된 요소값에서 매개변수로 전달받은  
		//첨자 위치의 요소값(객체)을 변경하는 메소드
		list.set(1, "임걱정");
		System.out.println("list = "+list);
		System.out.println("==============================================================");
		//List 객체에 저장된 모든 요소값에 대한 일괄 처리 - 일반 for 구문 사용
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		System.out.println("==============================================================");
		//List 객체에 저장된 모든 요소값에 대한 일괄 처리 - Iterator 객체 사용
		//List.iterator() : List 객체에 저장된 모든 요소값을 일괄 처리할 수 있는 Iterator 객체를 반환하는 메소드
		Iterator<String> iterator=list.iterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		System.out.println("==============================================================");
		//List 객체에 저장된 모든 요소값에 대한 일괄 처리 - 향상된 for 구문 사용
		for(String str : list) {
			System.out.print(str+" ");
		}
		System.out.println();
		System.out.println("==============================================================");
		
	}
}


















