package xyz.itwill.boot.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Board {
	private Long num;//글번호
	private String writer;//작성자
	private String title;//제목
	private String content;//내용
	private int hit;//조횟수
	private LocalDateTime createDate;//작성날짜
	private LocalDateTime updateDate;//변경날짜
}
