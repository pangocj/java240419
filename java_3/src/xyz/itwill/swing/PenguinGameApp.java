package xyz.itwill.swing;

import java.awt.Image;

import javax.swing.JFrame;

public class PenguinGameApp extends JFrame {
	private static final long serialVersionUID = 1L;

	private static final int JFRAME_WIDTH=646;
	private static final int JFRAME_HEIGHT=461;
	private static final int PENGUIN_SIZE=50;
	
	private Image backImage;
	private Image[] penguins;

	private int penguinNo;
	private int penguinX, penguinY;
	
	//펭귄 이미지의 이동 방향을 저장하기 위한 필드
	// => 1 : 왼쪽 방향, 2 : 오른쪽 방향
	private int direction;
	
	//게임 실행 상태를 저장하기 위한 필드
	// => false : 중지상태, true : 실행상태(true)
	private boolean isRun;
	
	//펭귄 상태를 저장하기 위한 필드
	// => false : 죽음상태, true : 생존상태(true)
	private boolean isPenguinAlive;
	
	//돌멩이 이미지의 폭과 높이를 저장하기 상수필드
	private static final int STONE_SIZE=30;
	
	//돌멩이 이미지를 저장하기 위한 필드
	private Image stoneImage;

}










