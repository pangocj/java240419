package basic;

import java.util.Scanner;

//키보드로 점수를 입력받아 학점을 계산하여 출력하는 프로그램 작성
// => 100 ~ 90 : A, 89 ~ 80 : B, 79 ~ 70 : C, 69 ~ 60: D, 59 ~ 0 :F
public class InputCheckApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("점수 입력 >> ");
		int score=scanner.nextInt();
		
		String grade="";
		switch(score/10) {
		case 10:
		case 9: grade="A"; break;
		case 8: grade="B"; break;
		case 7: grade="C"; break;
		case 6: grade="D"; break;
		default: grade="F"; break;
		}
		
		System.out.println("[결과]"+score+"점 = "+grade+"학점");
		
		scanner.close();
	}
}
