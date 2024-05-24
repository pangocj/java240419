package xyz.itwill.net;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//채팅 클라이언트 프로그램 작성
// => 서버에서 보내온 메세지를 전달받아 JTextArea 컴퍼넌트에 출력 처리 - 무한루프(main 스레드)
// => JTextField 컴퍼넌트로 입력한 메세지를 서버에 전달 - 이베트 처리 객체(EventQueue 스레드)
public class ChatingClientApp extends JFrame {
	private static final long serialVersionUID = 1L;
	
	//이벤트 처리 메소드에서 사용할 컴퍼넌트를 저장하기 위한 필드
	private JTextArea textArea;//출력 컴퍼넌트
	private JTextField textField;//입력 컴퍼넌트
	
	//접속 서버의 정보가 저장된 Socket 객체를 저장하기 위한 필드
	private Socket socket;
	
	//서버에서 보내온 메세지를 전달받기 위한 입력스트림을 저장하기 위한 필드
	private BufferedReader in;
	
	//서버에게 메세지를 전달하기 위한 출력스트림을 저장하기 위한 필드
	private PrintWriter out;
	
	//대화명을 저장하기 위한 필드
	private String aliasName;
	
	public ChatingClientApp(String title) {
		
	}
	
	public static void main(String[] args) {
		new ChatingClientApp("자바채팅");
	}
}
