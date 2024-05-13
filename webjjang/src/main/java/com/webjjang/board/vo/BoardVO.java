package com.webjjang.board.vo;

import java.util.Date;

import lombok.Data;

// 생성자, getter, setter, toString 자동으로 만들어줌
@Data
public class BoardVO {

	private Long no;
	private String title;
	private String content;
	private String writer;
	private Date writeDate;
	private Long hit;
	private String pw;
}
