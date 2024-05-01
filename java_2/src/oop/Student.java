package oop;

//학생정보(학번, 이름, 국어, 영어, 총점)를 저장하기 위한 클래스
public class Student {
	private int num;
	private String name;
	private int kor, eng, tot;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int num, String name, int kor, int eng) {
		super();
		//매개변수로 전달받은 값을 사용해 필드 초기화 처리
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
		//매개변수로 전달받은 값을 계산하여 필드 초기화 처리
		// => 총점을 계산하는 메소드 호출하여 필드 초기화 처리 - 생성자에서 메소드 호출 가능
		//tot=kor+eng;
		calcTot();
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}
	
	//총점을 계산하여 필드에 저장하는 메소드
	public void calcTot() {
		tot=kor+eng;
	}
	
	public void display() {
		System.out.print("["+name+"]님의 성적 >> ");
		System.out.println("국어 = "+kor+", 영어 = "+eng+", 총점 = "+tot);
	}
}












