package xyz.itwill.io;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

//문서파일 편집기(메모장) 프로그램 작성
public class NotepadApp extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JTextArea textArea;
	private JMenuItem init, open, save, exit;
		
	public NotepadApp(String title) {
		super(title);
		
		JMenuBar menuBar=new JMenuBar();
		
		//Mnemonic : [Alt] 기능키와 같이 사용해 메뉴 또는 메뉴 아이템을 키보드로 선택하기 위한 문자값
		JMenu fileMenu=new JMenu("파일(F)");
		fileMenu.setMnemonic('F');//메뉴를 선택할 수 있는 문자값을 변경
		
		init=new JMenuItem("새로 만들기(N)", 'N');
		open=new JMenuItem("열기(O)", 'O');
		save=new JMenuItem("저장(S)", 'S');
		exit=new JMenuItem("끝내기(X)", 'X');
		
		//메뉴 아이템에 단축키 변경(등록)
		init.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
		open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O
			, InputEvent.ALT_DOWN_MASK + InputEvent.SHIFT_DOWN_MASK));
		save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S
				, InputEvent.ALT_DOWN_MASK + InputEvent.SHIFT_DOWN_MASK));
		
		fileMenu.add(init);
		fileMenu.add(open);
		fileMenu.add(save);
		fileMenu.addSeparator();
		fileMenu.add(exit);
		
		menuBar.add(fileMenu);
		
		setJMenuBar(menuBar);
		
		textArea=new JTextArea();
		textArea.setFont(new Font("굴림체", Font.PLAIN, 20));
		JScrollPane scrollPane=new JScrollPane(textArea);
		
		getContentPane().add(scrollPane, BorderLayout.CENTER);

		//메뉴 아이템을 선택한 경우 ActionEvent 발생 - ActionListener 객체를 사용해 이벤트 처리
		init.addActionListener(new NotepadActionEventHandle());
		open.addActionListener(new NotepadActionEventHandle());
		save.addActionListener(new NotepadActionEventHandle());
		exit.addActionListener(new NotepadActionEventHandle());
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(450, 150, 1000, 600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new NotepadApp("제목 없음 - Java 메모장");
	}
	
	public class NotepadActionEventHandle implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			Object eventSource=e.getSource();
			
			if(eventSource == init) {
				
			} else if(eventSource == open) {
				
			} else if(eventSource == save) {
				
			} else if(eventSource == exit) {
				System.exit(0);
			}
		}
	}
}










