package xyz.itwill.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

//웹프로그램 작성에 필요한 기능을 제공하기 위한 클래스
public class Utility {
	//문자열(비밀번호)을 전달받아 암호화 처리하여 반환하는 정적 메소드
	public static String encrypt(String password) {
		//암호화 처리된 문자열을 저장하기 위한 변수
		String encryptPassword="";
		
		try {
			//암호화 처리 기능을 제공하는 MessageDigest 객체를 반환받아 저장
			//MessageDigest.getInstance(String algorithm) : 매개변수로 전달받은 암호화 알고리즘이
			//저장된 MessageDigest 객체를 반환하는 정적메소드
			// => 매개변수에 잘못된 암호화 알고리즘을 전달할 경우 NoSuchAlgorithmException 발생
			//단방향 암호화 알고리즘(복호화 처리 불가능) : MD5, SHA-1, SHA-256, SHA-512 등
			//양방향 암호화 알고리즘(복호화 처리 가능) : AES-123, RSA 등
			MessageDigest messageDigest=MessageDigest.getInstance("SHA-256");
			
				
		} catch (NoSuchAlgorithmException e) {
			// TODO: handle exception
		}
		
		return encryptPassword;
	}
}
