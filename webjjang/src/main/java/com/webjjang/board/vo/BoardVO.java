package com.webjjang.board.vo;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// 생성자, getter, setter, toString 자동으로 만들어줌
@Data
@Setter
@Getter
@ToString

public class BoardVO {

	private Long no;
	private String title;
	private String content;
	private String writer;
	private Date writeDate;
	private Long hit;
	private String pw;
}

//DROP TABLE board;
//
//CREATE TABLE board (
//    no NUMBER,
//    content VARCHAR2(1000),
//    title VARCHAR2(100),
//    writer VARCHAR2(50),
//    writeDate DATE,
//    hit NUMBER,
//    pw VARCHAR2(50)
//);
//
//INSERT INTO board (no, content, title, writer, writeDate, hit, pw) 
//VALUES
//(1, '가', '토끼', '흥부', TO_DATE('2024-05-10', 'YYYY-MM-DD'), 15, '1234'),
//(2, '나', '고양이', '놀부', TO_DATE('2024-05-12', 'YYYY-MM-DD'), 16, '1234'),
//(3, '다', '개', '제비', TO_DATE('2024-05-09', 'YYYY-MM-DD'), 19, '1234');
//
//
//select *
//from board;
//
//commit;