package basic;//클래스가 작성된 패키지를 표현하기 위해 사용하는 문장

//주석문 : 프로그램 실행과 아무런 상관없는 설명문을 제공하기 위한 문장
// => 유지보수의 효율성 증가를 위해 소스코드에 설명문 제공
// => 행주석(//설명문)과 범위주석(/* 설명문 */) - Source 주석

/*
프로그램 이름 : FirstEclipse
프로그램 버전 : 1.0
개발도구 : JDK17
*/

//이클립스 단축키
//[Ctrl]+[Space] : 단어 또는 문장(Template Code 사용)에 대한 자동 완성 기능 제공
//[Ctrl]+[S] : 소스파일 저장
//[Ctrl]+[F11] : 실행
//[Ctrl]+[Alt]+[↑] 또는 [Ctrl]+[Alt]+[↓] : 커서 위치의 행을 복사하여 위 또는 아래에 붙여넣기  
//[Alt]+[↑] 또는 [Alt]+[↓] : 커서 위치의 행을 위 또는 아래에 이동
//[Ctrl]+[/] : 행주석 처리 및 삭제
//[Ctrl]+[Shift]+[/] : 범위주석 처리
//[Ctrl]+[Shift]+[\] : 범위주석 삭제

//깃허브(GitHub) : 분산 버전 관리 툴인 깃 저장소 호스팅 기능을 제공하는 웹서비스
// => https://github.com/ 사이트 사용 
//깃(Git) : 다수의 사용자들간의 파일 작업을 조율하기 위한 분산 버전 관리 시스템(프로그램)

/** 이클립스로 만든 프로그램 - API 주석 */
public class FirstEclipseApp {
	/* JVM에 의해 자동으로 호출되는 메소드 */
	public static void main(String[] args) {
		System.out.print("이클립스로 처음 만든 프로그램입니다."); 
		System.out.println();//엔터(Enter) 출력
		System.out.println("열심히 해봐요.");
	} 
}